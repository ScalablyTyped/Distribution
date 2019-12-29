package typings.node.v8Mod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8", "Serializer")
@js.native
class Serializer () extends js.Object {
  /**
    * Returns the stored internal buffer.
    * This serializer should not be used once the buffer is released.
    * Calling this method results in undefined behavior if a previous write has failed.
    */
  def releaseBuffer(): Buffer = js.native
  /**
    * Marks an ArrayBuffer as having its contents transferred out of band.\
    * Pass the corresponding ArrayBuffer in the deserializing context to deserializer.transferArrayBuffer().
    */
  def transferArrayBuffer(id: Double, arrayBuffer: ArrayBuffer): Unit = js.native
  /**
    * Write a JS number value.
    */
  def writeDouble(value: Double): Unit = js.native
  /**
    * Writes out a header, which includes the serialization format version.
    */
  def writeHeader(): Unit = js.native
  /**
    * Write raw bytes into the serializer’s internal buffer.
    * The deserializer will require a way to compute the length of the buffer.
    */
  def writeRawBytes(buffer: TypedArray): Unit = js.native
  /**
    * Write a raw 32-bit unsigned integer.
    */
  def writeUint32(value: Double): Unit = js.native
  /**
    * Write a raw 64-bit unsigned integer, split into high and low 32-bit parts.
    */
  def writeUint64(hi: Double, lo: Double): Unit = js.native
  /**
    * Serializes a JavaScript value and adds the serialized representation to the internal buffer.
    * This throws an error if value cannot be serialized.
    */
  def writeValue(`val`: js.Any): Boolean = js.native
}

