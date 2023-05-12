package typings.node

import typings.node.NodeJS.TypedArray
import typings.node.bufferMod.BlobOptions
import typings.node.bufferMod.FileOptions
import typings.node.bufferMod.TranscodeEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferConstructor
import typings.node.bufferMod.global.BufferEncoding
import typings.node.cryptoMod.BinaryLike
import typings.node.workerThreadsMod._TransferListItem
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonbufferMod {
  
  @JSImport("node:buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:buffer", "Blob")
  @js.native
  open class Blob protected ()
    extends typings.node.bufferMod.Blob
       with _TransferListItem {
    /**
      * Creates a new `Blob` object containing a concatenation of the given sources.
      *
      * {ArrayBuffer}, {TypedArray}, {DataView}, and {Buffer} sources are copied into
      * the 'Blob' and can therefore be safely modified after the 'Blob' is created.
      *
      * String sources are also copied into the `Blob`.
      */
    def this(sources: js.Array[BinaryLike | typings.node.bufferMod.Blob]) = this()
    def this(sources: js.Array[BinaryLike | typings.node.bufferMod.Blob], options: BlobOptions) = this()
  }
  
  @JSImport("node:buffer", "Buffer")
  @js.native
  def Buffer: BufferConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("node:buffer", "Buffer")
  @js.native
  open class BufferCls protected ()
    extends StObject
       with Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
      */
    def this(str: String) = this()
    def this(str: String, encoding: BufferEncoding) = this()
  }
  
  inline def Buffer_=(x: BufferConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(x.asInstanceOf[js.Any])
  
  @JSImport("node:buffer", "File")
  @js.native
  open class File protected ()
    extends typings.node.bufferMod.File {
    def this(sources: js.Array[BinaryLike | typings.node.bufferMod.Blob], fileName: String) = this()
    def this(
      sources: js.Array[BinaryLike | typings.node.bufferMod.Blob],
      fileName: String,
      options: FileOptions
    ) = this()
  }
  
  @JSImport("node:buffer", "INSPECT_MAX_BYTES")
  @js.native
  val INSPECT_MAX_BYTES: Double = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("node:buffer", "SlowBuffer")
  @js.native
  open class SlowBuffer protected ()
    extends StObject
       with Buffer {
    /** @deprecated since v6.0.0, use `Buffer.allocUnsafeSlow()` */
    def this(size: Double) = this()
  }
  
  object constants {
    
    @JSImport("node:buffer", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node:buffer", "constants.MAX_LENGTH")
    @js.native
    def MAX_LENGTH: Double = js.native
    inline def MAX_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("node:buffer", "constants.MAX_STRING_LENGTH")
    @js.native
    def MAX_STRING_LENGTH: Double = js.native
    inline def MAX_STRING_LENGTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_STRING_LENGTH")(x.asInstanceOf[js.Any])
  }
  
  inline def isAscii(input: js.typedarray.ArrayBuffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAscii(input: TypedArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAscii(input: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUtf8(input: js.typedarray.ArrayBuffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUtf8(input: TypedArray): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUtf8(input: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUtf8")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("node:buffer", "kMaxLength")
  @js.native
  val kMaxLength: Double = js.native
  
  @JSImport("node:buffer", "kStringMaxLength")
  @js.native
  val kStringMaxLength: Double = js.native
  
  inline def resolveObjectURL(id: String): js.UndefOr[typings.node.bufferMod.Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveObjectURL")(id.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.node.bufferMod.Blob]]
  
  inline def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(source.asInstanceOf[js.Any], fromEnc.asInstanceOf[js.Any], toEnc.asInstanceOf[js.Any])).asInstanceOf[Buffer]
}
