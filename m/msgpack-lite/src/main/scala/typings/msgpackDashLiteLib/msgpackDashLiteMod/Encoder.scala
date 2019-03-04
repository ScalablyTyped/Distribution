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
    encode: js.Function1[js.Any, scala.Unit],
    end: js.Function1[js.Any, scala.Unit],
    fetch: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    maxBufferSize: scala.Double,
    minBufferSize: scala.Double,
    offset: scala.Double,
    pull: js.Function0[scala.Double],
    push: js.Function1[js.Any, scala.Unit],
    read: js.Function0[scala.Double],
    reserve: js.Function1[scala.Double, scala.Double],
    send: js.Function1[nodeLib.Buffer, scala.Unit],
    start: scala.Double,
    write: js.Function1[js.Any, scala.Unit]
  ): Encoder = {
    val __obj = js.Dynamic.literal(bufferish = bufferish, encode = encode, end = end, fetch = fetch, flush = flush, maxBufferSize = maxBufferSize, minBufferSize = minBufferSize, offset = offset, pull = pull, push = push, read = read, reserve = reserve, send = send, start = start, write = write)
  
    __obj.asInstanceOf[Encoder]
  }
}

