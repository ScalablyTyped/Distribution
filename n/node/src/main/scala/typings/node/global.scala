package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.Global
import typings.node.NodeJS.Immediate
import typings.node.NodeJS.Timeout
import typings.node.anon.ToPrimitive
import typings.node.anon.ValueOf
import typings.node.consoleMod.global.Console_
import typings.node.processMod.global.NodeJS.Process
import typings.std.ArrayBuffer
import typings.std.SharedArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def clearImmediate(immediateId: Immediate): Unit = js.native
  
  def clearInterval(intervalId: Timeout): Unit = js.native
  
  def clearTimeout(timeoutId: Timeout): Unit = js.native
  
  var console: Console_ = js.native
  
  @JSName("__dirname")
  var dirname: java.lang.String = js.native
  
  // Same as module.exports
  var exports: js.Any = js.native
  
  @JSName("__filename")
  var filename: java.lang.String = js.native
  
  var global: Global with (/* globalThis */ js.Any) = js.native
  
  var module: NodeModule = js.native
  
  var process: Process = js.native
  
  def queueMicrotask(callback: js.Function0[Unit]): Unit = js.native
  
  var require: NodeRequire = js.native
  
  def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  @js.native
  class Buffer protected ()
    extends typings.node.Buffer {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}/{SharedArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
      */
    def this(arrayBuffer: ArrayBuffer) = this()
    def this(arrayBuffer: SharedArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: js.Array[_]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
      */
    def this(array: Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
      */
    def this(buffer: typings.node.Buffer) = this()
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
    def this(str: java.lang.String) = this()
    def this(str: java.lang.String, encoding: BufferEncoding) = this()
  }
  /* static members */
  @js.native
  object Buffer extends js.Object {
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initalizing
      */
    def alloc(size: Double): typings.node.Buffer = js.native
    def alloc(size: Double, fill: js.UndefOr[scala.Nothing], encoding: BufferEncoding): typings.node.Buffer = js.native
    def alloc(size: Double, fill: java.lang.String): typings.node.Buffer = js.native
    def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): typings.node.Buffer = js.native
    def alloc(size: Double, fill: Double): typings.node.Buffer = js.native
    def alloc(size: Double, fill: Double, encoding: BufferEncoding): typings.node.Buffer = js.native
    def alloc(size: Double, fill: typings.node.Buffer): typings.node.Buffer = js.native
    def alloc(size: Double, fill: typings.node.Buffer, encoding: BufferEncoding): typings.node.Buffer = js.native
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    def allocUnsafe(size: Double): typings.node.Buffer = js.native
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    def allocUnsafeSlow(size: Double): typings.node.Buffer = js.native
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    def byteLength(string: java.lang.String): Double = js.native
    def byteLength(string: java.lang.String, encoding: BufferEncoding): Double = js.native
    def byteLength(string: ArrayBufferView): Double = js.native
    def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = js.native
    def byteLength(string: ArrayBuffer): Double = js.native
    def byteLength(string: ArrayBuffer, encoding: BufferEncoding): Double = js.native
    def byteLength(string: SharedArrayBuffer): Double = js.native
    def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
    
    /**
      * The same as buf1.compare(buf2).
      */
    def compare(buf1: Uint8Array, buf2: Uint8Array): Double = js.native
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    def concat(list: js.Array[Uint8Array]): typings.node.Buffer = js.native
    def concat(list: js.Array[Uint8Array], totalLength: Double): typings.node.Buffer = js.native
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
      */
    def from(arrayBuffer: ArrayBuffer): typings.node.Buffer = js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typings.node.Buffer = js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: Double): typings.node.Buffer = js.native
    def from(arrayBuffer: ArrayBuffer, byteOffset: Double, length: Double): typings.node.Buffer = js.native
    def from(arrayBuffer: SharedArrayBuffer): typings.node.Buffer = js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: js.UndefOr[scala.Nothing], length: Double): typings.node.Buffer = js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double): typings.node.Buffer = js.native
    def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): typings.node.Buffer = js.native
    /**
      * Creates a new Buffer using the passed {data}
      * @param data data to create a new Buffer
      */
    def from(data: js.Array[Double]): typings.node.Buffer = js.native
    def from(data: Uint8Array): typings.node.Buffer = js.native
    def from(obj: ToPrimitive): typings.node.Buffer = js.native
    def from(obj: ToPrimitive, byteOffset: js.UndefOr[scala.Nothing], length: Double): typings.node.Buffer = js.native
    def from(obj: ToPrimitive, byteOffset: Double): typings.node.Buffer = js.native
    def from(obj: ToPrimitive, byteOffset: Double, length: Double): typings.node.Buffer = js.native
    /**
      * Creates a new buffer containing the coerced value of an object
      * A `TypeError` will be thrown if {obj} has not mentioned methods or is not of other type appropriate for `Buffer.from()` variants.
      * @param obj An object supporting `Symbol.toPrimitive` or `valueOf()`.
      */
    def from(obj: ValueOf): typings.node.Buffer = js.native
    def from(obj: ValueOf, byteOffset: js.UndefOr[scala.Nothing], length: Double): typings.node.Buffer = js.native
    def from(obj: ValueOf, byteOffset: Double): typings.node.Buffer = js.native
    def from(obj: ValueOf, byteOffset: Double, length: Double): typings.node.Buffer = js.native
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      */
    def from(str: java.lang.String): typings.node.Buffer = js.native
    def from(str: java.lang.String, encoding: BufferEncoding): typings.node.Buffer = js.native
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    def isBuffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    def isEncoding(encoding: java.lang.String): /* is node.BufferEncoding */ Boolean = js.native
    
    /**
      * Creates a new Buffer using the passed {data}
      * @param values to create a new Buffer
      */
    def of(items: Double*): typings.node.Buffer = js.native
    
    /**
      * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
      */
    var poolSize: Double = js.native
  }
  
  /*----------------------------------------------*
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  *-----------------------------------------------*/
  @js.native
  object NodeJS extends js.Object
  
  @js.native
  object setImmediate extends js.Object {
    
    def apply(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): Immediate = js.native
  }
  
  @js.native
  object setTimeout extends js.Object {
    
    def apply(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timeout = js.native
  }
}
