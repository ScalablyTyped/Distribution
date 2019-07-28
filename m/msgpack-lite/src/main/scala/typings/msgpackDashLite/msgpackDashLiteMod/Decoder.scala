package typings.msgpackDashLite.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder extends js.Object {
  var bufferish: js.Any
  var offset: Double
  def decode(chunk: js.Any): Unit
  def end(chunk: js.Any): Unit
  def fetch(): Unit
  def flush(): Unit
  def pull(): Double
  def push(chunk: js.Any): Unit
  def read(): Double
  def reserve(length: Double): Double
  def write(chunk: js.Any): Unit
}

object Decoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    decode: js.Any => Unit,
    end: js.Any => Unit,
    fetch: () => Unit,
    flush: () => Unit,
    offset: Double,
    pull: () => Double,
    push: js.Any => Unit,
    read: () => Double,
    reserve: Double => Double,
    write: js.Any => Unit
  ): Decoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish, decode = js.Any.fromFunction1(decode), end = js.Any.fromFunction1(end), fetch = js.Any.fromFunction0(fetch), flush = js.Any.fromFunction0(flush), offset = offset, pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction1(push), read = js.Any.fromFunction0(read), reserve = js.Any.fromFunction1(reserve), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Decoder]
  }
}

