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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferish")(bufferish)
    __obj.updateDynamic("encode")(encode)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("maxBufferSize")(maxBufferSize)
    __obj.updateDynamic("minBufferSize")(minBufferSize)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("pull")(pull)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("reserve")(reserve)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Encoder]
  }
}

