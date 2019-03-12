package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decoder extends js.Object {
  var bufferish: js.Any
  var offset: scala.Double
  def decode(chunk: js.Any): scala.Unit
  def end(chunk: js.Any): scala.Unit
  def fetch(): scala.Unit
  def flush(): scala.Unit
  def pull(): scala.Double
  def push(chunk: js.Any): scala.Unit
  def read(): scala.Double
  def reserve(length: scala.Double): scala.Double
  def write(chunk: js.Any): scala.Unit
}

object Decoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    decode: js.Any => scala.Unit,
    end: js.Any => scala.Unit,
    fetch: () => scala.Unit,
    flush: () => scala.Unit,
    offset: scala.Double,
    pull: () => scala.Double,
    push: js.Any => scala.Unit,
    read: () => scala.Double,
    reserve: scala.Double => scala.Double,
    write: js.Any => scala.Unit
  ): Decoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish, decode = js.Any.fromFunction1(decode), end = js.Any.fromFunction1(end), fetch = js.Any.fromFunction0(fetch), flush = js.Any.fromFunction0(flush), offset = offset, pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction1(push), read = js.Any.fromFunction0(read), reserve = js.Any.fromFunction1(reserve), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Decoder]
  }
}

