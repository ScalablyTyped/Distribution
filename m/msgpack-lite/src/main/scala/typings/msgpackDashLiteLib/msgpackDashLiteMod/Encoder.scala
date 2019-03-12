package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoder extends js.Object {
  var bufferish: js.Any
  var maxBufferSize: scala.Double
  var minBufferSize: scala.Double
  var offset: scala.Double
  var start: scala.Double
  def encode(chunk: js.Any): scala.Unit
  def end(chunk: js.Any): scala.Unit
  def fetch(): scala.Unit
  def flush(): scala.Unit
  def pull(): scala.Double
  def push(chunk: js.Any): scala.Unit
  def read(): scala.Double
  def reserve(length: scala.Double): scala.Double
  def send(buffer: nodeLib.Buffer): scala.Unit
  def write(chunk: js.Any): scala.Unit
}

object Encoder {
  @scala.inline
  def apply(
    bufferish: js.Any,
    encode: js.Any => scala.Unit,
    end: js.Any => scala.Unit,
    fetch: () => scala.Unit,
    flush: () => scala.Unit,
    maxBufferSize: scala.Double,
    minBufferSize: scala.Double,
    offset: scala.Double,
    pull: () => scala.Double,
    push: js.Any => scala.Unit,
    read: () => scala.Double,
    reserve: scala.Double => scala.Double,
    send: nodeLib.Buffer => scala.Unit,
    start: scala.Double,
    write: js.Any => scala.Unit
  ): Encoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish, encode = js.Any.fromFunction1(encode), end = js.Any.fromFunction1(end), fetch = js.Any.fromFunction0(fetch), flush = js.Any.fromFunction0(flush), maxBufferSize = maxBufferSize, minBufferSize = minBufferSize, offset = offset, pull = js.Any.fromFunction0(pull), push = js.Any.fromFunction1(push), read = js.Any.fromFunction0(read), reserve = js.Any.fromFunction1(reserve), send = js.Any.fromFunction1(send), start = start, write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[Encoder]
  }
}

