package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod._KeyLike
import typings.node.fsMod._PathLike
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raw data is stored in instances of the Buffer class.
  * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
  * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
  */
@JSGlobal("Buffer")
@js.native
class Buffer protected ()
  extends Uint8Array
     with _KeyLike
     with _PathLike {
  def this(arrayBuffer: SharedArrayBuffer) = this()
  /**
    * Produces a Buffer backed by the same allocated memory as
    * the given {ArrayBuffer}/{SharedArrayBuffer}.
    *
    *
    * @param arrayBuffer The ArrayBuffer with which to share memory.
    * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
    */
  def this(arrayBuffer: ArrayBuffer) = this()
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
  def this(str: java.lang.String) = this()
  def this(str: java.lang.String, encoding: BufferEncoding) = this()
  def compare(otherBuffer: Uint8Array): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double): Double = js.native
  def compare(otherBuffer: Uint8Array, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
  def compare(
    otherBuffer: Uint8Array,
    targetStart: Double,
    targetEnd: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = js.native
  def copy(targetBuffer: Uint8Array): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double): Double = js.native
  def copy(targetBuffer: Uint8Array, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
  def equals(otherBuffer: Uint8Array): Boolean = js.native
  def fill(value: java.lang.String): this.type = js.native
  def fill(value: java.lang.String, offset: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double): this.type = js.native
  def fill(value: java.lang.String, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Double, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def fill(value: Uint8Array): this.type = js.native
  def fill(value: Uint8Array, offset: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double): this.type = js.native
  def fill(value: Uint8Array, offset: Double, end: Double, encoding: BufferEncoding): this.type = js.native
  def includes(value: java.lang.String): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double): Boolean = js.native
  def includes(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def includes(value: Buffer): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double): Boolean = js.native
  def includes(value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = js.native
  def indexOf(value: java.lang.String): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def indexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def indexOf(value: Uint8Array): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def indexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: java.lang.String): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double): Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Double, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def lastIndexOf(value: Uint8Array): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double): Double = js.native
  def lastIndexOf(value: Uint8Array, byteOffset: Double, encoding: BufferEncoding): Double = js.native
  def readDoubleBE(offset: Double): Double = js.native
  def readDoubleLE(offset: Double): Double = js.native
  def readFloatBE(offset: Double): Double = js.native
  def readFloatLE(offset: Double): Double = js.native
  def readInt16BE(offset: Double): Double = js.native
  def readInt16LE(offset: Double): Double = js.native
  def readInt32BE(offset: Double): Double = js.native
  def readInt32LE(offset: Double): Double = js.native
  def readInt8(offset: Double): Double = js.native
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  def readUInt16BE(offset: Double): Double = js.native
  def readUInt16LE(offset: Double): Double = js.native
  def readUInt32BE(offset: Double): Double = js.native
  def readUInt32LE(offset: Double): Double = js.native
  def readUInt8(offset: Double): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): AnonBufferData = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: Double, end: Double): java.lang.String = js.native
  def write(string: java.lang.String): Double = js.native
  def write(string: java.lang.String, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, encoding: BufferEncoding): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double): Double = js.native
  def write(string: java.lang.String, offset: Double, length: Double, encoding: BufferEncoding): Double = js.native
  def writeDoubleBE(value: Double, offset: Double): Double = js.native
  def writeDoubleLE(value: Double, offset: Double): Double = js.native
  def writeFloatBE(value: Double, offset: Double): Double = js.native
  def writeFloatLE(value: Double, offset: Double): Double = js.native
  def writeInt16BE(value: Double, offset: Double): Double = js.native
  def writeInt16LE(value: Double, offset: Double): Double = js.native
  def writeInt32BE(value: Double, offset: Double): Double = js.native
  def writeInt32LE(value: Double, offset: Double): Double = js.native
  def writeInt8(value: Double, offset: Double): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUInt16BE(value: Double, offset: Double): Double = js.native
  def writeUInt16LE(value: Double, offset: Double): Double = js.native
  def writeUInt32BE(value: Double, offset: Double): Double = js.native
  def writeUInt32LE(value: Double, offset: Double): Double = js.native
  def writeUInt8(value: Double, offset: Double): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}

/* static members */
@JSGlobal("Buffer")
@js.native
object Buffer extends js.Object {
  /**
    * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
    */
  var poolSize: Double = js.native
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
    *    If parameter is omitted, buffer will be filled with zeros.
    * @param encoding encoding used for call to buf.fill while initalizing
    */
  def alloc(size: Double): Buffer = js.native
  def alloc(size: Double, fill: java.lang.String): Buffer = js.native
  def alloc(size: Double, fill: java.lang.String, encoding: BufferEncoding): Buffer = js.native
  def alloc(size: Double, fill: Double): Buffer = js.native
  def alloc(size: Double, fill: Double, encoding: BufferEncoding): Buffer = js.native
  def alloc(size: Double, fill: Buffer): Buffer = js.native
  def alloc(size: Double, fill: Buffer, encoding: BufferEncoding): Buffer = js.native
  /**
    * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafe(size: Double): Buffer = js.native
  /**
    * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafeSlow(size: Double): Buffer = js.native
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
  def byteLength(string: SharedArrayBuffer): Double = js.native
  def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = js.native
  def byteLength(string: ArrayBuffer): Double = js.native
  def byteLength(string: ArrayBuffer, encoding: BufferEncoding): Double = js.native
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
  def concat(list: js.Array[Uint8Array]): Buffer = js.native
  def concat(list: js.Array[Uint8Array], totalLength: Double): Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer): Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double): Buffer = js.native
  def from(arrayBuffer: SharedArrayBuffer, byteOffset: Double, length: Double): Buffer = js.native
  /**
    * When passed a reference to the .buffer property of a TypedArray instance,
    * the newly created Buffer will share the same allocated memory as the TypedArray.
    * The optional {byteOffset} and {length} arguments specify a memory range
    * within the {arrayBuffer} that will be shared by the Buffer.
    *
    * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
    */
  def from(arrayBuffer: ArrayBuffer): Buffer = js.native
  def from(arrayBuffer: ArrayBuffer, byteOffset: Double): Buffer = js.native
  def from(arrayBuffer: ArrayBuffer, byteOffset: Double, length: Double): Buffer = js.native
  /**
    * Creates a new Buffer using the passed {data}
    * @param data data to create a new Buffer
    */
  def from(data: js.Array[Double]): Buffer = js.native
  def from(data: Uint8Array): Buffer = js.native
  def from(obj: AnonHint): Buffer = js.native
  def from(obj: AnonHint, byteOffset: Double): Buffer = js.native
  def from(obj: AnonHint, byteOffset: Double, length: Double): Buffer = js.native
  /**
    * Creates a new buffer containing the coerced value of an object
    * A `TypeError` will be thrown if {obj} has not mentioned methods or is not of other type appropriate for `Buffer.from()` variants.
    * @param obj An object supporting `Symbol.toPrimitive` or `valueOf()`.
    */
  def from(obj: AnonValueOf): Buffer = js.native
  def from(obj: AnonValueOf, byteOffset: Double): Buffer = js.native
  def from(obj: AnonValueOf, byteOffset: Double, length: Double): Buffer = js.native
  /**
    * Creates a new Buffer containing the given JavaScript string {str}.
    * If provided, the {encoding} parameter identifies the character encoding.
    * If not provided, {encoding} defaults to 'utf8'.
    */
  def from(str: java.lang.String): Buffer = js.native
  def from(str: java.lang.String, encoding: BufferEncoding): Buffer = js.native
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
  def of(items: Double*): Buffer = js.native
}

