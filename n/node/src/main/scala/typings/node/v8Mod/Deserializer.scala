package typings.node.v8Mod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @experimental
  */
@JSImport("v8", "Deserializer")
@js.native
class Deserializer protected () extends js.Object {
  def this(data: TypedArray) = this()
  /**
    * Reads the underlying wire format version.
    * Likely mostly to be useful to legacy code reading old wire format versions.
    * May not be called before .readHeader().
    */
  def getWireFormatVersion(): Double = js.native
  /**
    * Read a JS number value.
    */
  def readDouble(): Double = js.native
  /**
    * Reads and validates a header (including the format version).
    * May, for example, reject an invalid or unsupported wire format.
    * In that case, an Error is thrown.
    */
  def readHeader(): Boolean = js.native
  /**
    * Read raw bytes from the deserializer’s internal buffer.
    * The length parameter must correspond to the length of the buffer that was passed to serializer.writeRawBytes().
    */
  def readRawBytes(length: Double): Buffer = js.native
  /**
    * Read a raw 32-bit unsigned integer and return it.
    */
  def readUint32(): Double = js.native
  /**
    * Read a raw 64-bit unsigned integer and return it as an array [hi, lo] with two 32-bit unsigned integer entries.
    */
  def readUint64(): js.Tuple2[Double, Double] = js.native
  /**
    * Deserializes a JavaScript value from the buffer and returns it.
    */
  def readValue(): js.Any = js.native
  /**
    * Marks an ArrayBuffer as having its contents transferred out of band.
    * Pass the corresponding `ArrayBuffer` in the serializing context to serializer.transferArrayBuffer()
    * (or return the id from serializer._getSharedArrayBufferId() in the case of SharedArrayBuffers).
    */
  def transferArrayBuffer(id: Double, arrayBuffer: ArrayBuffer): Unit = js.native
}

