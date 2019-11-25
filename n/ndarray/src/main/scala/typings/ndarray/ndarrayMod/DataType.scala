package typings.ndarray.ndarrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ndarray.ndarrayStrings.int8
  - typings.ndarray.ndarrayStrings.int16
  - typings.ndarray.ndarrayStrings.int32
  - typings.ndarray.ndarrayStrings.uint8
  - typings.ndarray.ndarrayStrings.uint16
  - typings.ndarray.ndarrayStrings.uint32
  - typings.ndarray.ndarrayStrings.float32
  - typings.ndarray.ndarrayStrings.float64
  - typings.ndarray.ndarrayStrings.array
  - typings.ndarray.ndarrayStrings.uint8_clamped
  - typings.ndarray.ndarrayStrings.buffer
  - typings.ndarray.ndarrayStrings.generic
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def array: typings.ndarray.ndarrayStrings.array = this.cast("array")
  @scala.inline
  def buffer: typings.ndarray.ndarrayStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def float32: typings.ndarray.ndarrayStrings.float32 = this.cast("float32")
  @scala.inline
  def float64: typings.ndarray.ndarrayStrings.float64 = this.cast("float64")
  @scala.inline
  def generic: typings.ndarray.ndarrayStrings.generic = this.cast("generic")
  @scala.inline
  def int16: typings.ndarray.ndarrayStrings.int16 = this.cast("int16")
  @scala.inline
  def int32: typings.ndarray.ndarrayStrings.int32 = this.cast("int32")
  @scala.inline
  def int8: typings.ndarray.ndarrayStrings.int8 = this.cast("int8")
  @scala.inline
  def uint16: typings.ndarray.ndarrayStrings.uint16 = this.cast("uint16")
  @scala.inline
  def uint32: typings.ndarray.ndarrayStrings.uint32 = this.cast("uint32")
  @scala.inline
  def uint8: typings.ndarray.ndarrayStrings.uint8 = this.cast("uint8")
  @scala.inline
  def uint8_clamped: typings.ndarray.ndarrayStrings.uint8_clamped = this.cast("uint8_clamped")
}

