package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer
  extends stdLib.Uint8Array
     with nodeLib.cryptoMod._KeyLike
     with nodeLib.fsMod._PathLike {
  var constructor: Anon_Alloc = js.native
  def compare(otherBuffer: stdLib.Uint8Array): scala.Double = js.native
  def compare(otherBuffer: stdLib.Uint8Array, targetStart: scala.Double): scala.Double = js.native
  def compare(otherBuffer: stdLib.Uint8Array, targetStart: scala.Double, targetEnd: scala.Double): scala.Double = js.native
  def compare(
    otherBuffer: stdLib.Uint8Array,
    targetStart: scala.Double,
    targetEnd: scala.Double,
    sourceStart: scala.Double
  ): scala.Double = js.native
  def compare(
    otherBuffer: stdLib.Uint8Array,
    targetStart: scala.Double,
    targetEnd: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def copy(targetBuffer: stdLib.Uint8Array): scala.Double = js.native
  def copy(targetBuffer: stdLib.Uint8Array, targetStart: scala.Double): scala.Double = js.native
  def copy(targetBuffer: stdLib.Uint8Array, targetStart: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def copy(
    targetBuffer: stdLib.Uint8Array,
    targetStart: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def equals(otherBuffer: stdLib.Uint8Array): scala.Boolean = js.native
  def fill(value: js.Any): this.type = js.native
  def fill(value: js.Any, offset: scala.Double): this.type = js.native
  def fill(value: js.Any, offset: scala.Double, end: scala.Double): this.type = js.native
  def includes(value: java.lang.String): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: Buffer): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def indexOf(value: java.lang.String): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: stdLib.Uint8Array, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: stdLib.Uint8Array): scala.Double = js.native
  def lastIndexOf(value: stdLib.Uint8Array, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: stdLib.Uint8Array, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): Anon_BufferData = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def write(string: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
}

/**
  * Raw data is stored in instances of the Buffer class.
  * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
  * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
  */
@JSGlobal("Buffer")
@js.native
object Buffer
  extends org.scalablytyped.runtime.Instantiable2[/* str */ java.lang.String, /* encoding */ java.lang.String, Buffer]
     with /**
  * Allocates a new buffer containing the given {str}.
  *
  * @param str String to store in buffer.
  * @param encoding encoding to use, optional.  Default is 'utf8'
  * @deprecated since v10.0.0 - Use `Buffer.from(string[, encoding])` instead.
  */
/**
  * Allocates a new buffer of {size} octets.
  *
  * @param size count of octets to allocate.
  * @deprecated since v10.0.0 - Use `Buffer.alloc()` instead (also see `Buffer.allocUnsafe()`).
  */
/**
  * Allocates a new buffer containing the given {array} of octets.
  *
  * @param array The octets to store.
  * @deprecated since v10.0.0 - Use `Buffer.from(array)` instead.
  */
/**
  * Produces a Buffer backed by the same allocated memory as
  * the given {ArrayBuffer}/{SharedArrayBuffer}.
  *
  *
  * @param arrayBuffer The ArrayBuffer with which to share memory.
  * @deprecated since v10.0.0 - Use `Buffer.from(arrayBuffer[, byteOffset[, length]])` instead.
  */
/**
  * Copies the passed {buffer} data onto a new {Buffer} instance.
  *
  * @param buffer The buffer to copy.
  * @deprecated since v10.0.0 - Use `Buffer.from(buffer)` instead.
  */
org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* arrayBuffer */ stdLib.ArrayBuffer) | (/* buffer */ Buffer) | (/* size */ scala.Double) | (/* arrayBuffer */ SharedArrayBuffer) | (/* str */ java.lang.String) | (/* array */ stdLib.Uint8Array), 
      Buffer
    ] {
  /**
    * This is the number of bytes used to determine the size of pre-allocated, internal Buffer instances used for pooling. This value may be modified.
    */
  var poolSize: scala.Double = js.native
  /**
    * Allocates a new buffer of {size} octets.
    *
    * @param size count of octets to allocate.
    * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
    *    If parameter is omitted, buffer will be filled with zeros.
    * @param encoding encoding used for call to buf.fill while initalizing
    */
  def alloc(size: scala.Double): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: nodeLib.Buffer): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: nodeLib.Buffer, encoding: java.lang.String): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double): nodeLib.Buffer = js.native
  def alloc(size: scala.Double, fill: scala.Double, encoding: java.lang.String): nodeLib.Buffer = js.native
  /**
    * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafe(size: scala.Double): nodeLib.Buffer = js.native
  /**
    * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
    * of the newly created Buffer are unknown and may contain sensitive data.
    *
    * @param size count of octets to allocate
    */
  def allocUnsafeSlow(size: scala.Double): nodeLib.Buffer = js.native
  /**
    * Gives the actual byte length of a string. encoding defaults to 'utf8'.
    * This is not the same as String.prototype.length since that returns the number of characters in a string.
    *
    * @param string string to test.
    * @param encoding encoding used to evaluate (defaults to 'utf8')
    */
  def byteLength(string: java.lang.String): scala.Double = js.native
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  def byteLength(string: nodeLib.NodeJSNs.TypedArray): scala.Double = js.native
  def byteLength(string: nodeLib.NodeJSNs.TypedArray, encoding: java.lang.String): scala.Double = js.native
  def byteLength(string: nodeLib.SharedArrayBuffer): scala.Double = js.native
  def byteLength(string: nodeLib.SharedArrayBuffer, encoding: java.lang.String): scala.Double = js.native
  def byteLength(string: stdLib.ArrayBuffer): scala.Double = js.native
  def byteLength(string: stdLib.ArrayBuffer, encoding: java.lang.String): scala.Double = js.native
  def byteLength(string: stdLib.DataView): scala.Double = js.native
  def byteLength(string: stdLib.DataView, encoding: java.lang.String): scala.Double = js.native
  /**
    * The same as buf1.compare(buf2).
    */
  def compare(buf1: stdLib.Uint8Array, buf2: stdLib.Uint8Array): scala.Double = js.native
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
  def concat(list: js.Array[stdLib.Uint8Array]): nodeLib.Buffer = js.native
  def concat(list: js.Array[stdLib.Uint8Array], totalLength: scala.Double): nodeLib.Buffer = js.native
  def from(arrayBuffer: nodeLib.SharedArrayBuffer): nodeLib.Buffer = js.native
  def from(arrayBuffer: nodeLib.SharedArrayBuffer, byteOffset: scala.Double): nodeLib.Buffer = js.native
  def from(arrayBuffer: nodeLib.SharedArrayBuffer, byteOffset: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  /**
    * When passed a reference to the .buffer property of a TypedArray instance,
    * the newly created Buffer will share the same allocated memory as the TypedArray.
    * The optional {byteOffset} and {length} arguments specify a memory range
    * within the {arrayBuffer} that will be shared by the Buffer.
    *
    * @param arrayBuffer The .buffer property of any TypedArray or a new ArrayBuffer()
    */
  def from(arrayBuffer: stdLib.ArrayBuffer): nodeLib.Buffer = js.native
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double): nodeLib.Buffer = js.native
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
  /**
    * Creates a new Buffer using the passed {data}
    * @param data data to create a new Buffer
    */
  def from(data: js.Array[scala.Double]): nodeLib.Buffer = js.native
  def from(data: stdLib.Uint8Array): nodeLib.Buffer = js.native
  /**
    * Creates a new Buffer containing the given JavaScript string {str}.
    * If provided, the {encoding} parameter identifies the character encoding.
    * If not provided, {encoding} defaults to 'utf8'.
    */
  def from(str: java.lang.String): nodeLib.Buffer = js.native
  def from(str: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  /**
    * Returns true if {obj} is a Buffer
    *
    * @param obj object to test.
    */
  def isBuffer(obj: js.Any): /* is node.Buffer */ scala.Boolean = js.native
  /**
    * Returns true if {encoding} is a valid encoding argument.
    * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    *
    * @param encoding string to test.
    */
  def isEncoding(encoding: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  /**
    * Creates a new Buffer using the passed {data}
    * @param values to create a new Buffer
    */
  def of(items: scala.Double*): nodeLib.Buffer = js.native
}

