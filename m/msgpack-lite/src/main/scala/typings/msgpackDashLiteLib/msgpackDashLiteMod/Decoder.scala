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
    decode: js.Function1[js.Any, scala.Unit],
    end: js.Function1[js.Any, scala.Unit],
    fetch: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    offset: scala.Double,
    pull: js.Function0[scala.Double],
    push: js.Function1[js.Any, scala.Unit],
    read: js.Function0[scala.Double],
    reserve: js.Function1[scala.Double, scala.Double],
    write: js.Function1[js.Any, scala.Unit]
  ): Decoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bufferish")(bufferish)
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("pull")(pull)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("reserve")(reserve)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Decoder]
  }
}

