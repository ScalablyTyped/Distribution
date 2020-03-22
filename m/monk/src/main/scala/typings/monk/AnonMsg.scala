package typings.monk

import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsg extends js.Object {
  var msg: js.UndefOr[String] = js.undefined
  var nIndexesWas: Double
  var ok: `1` | `0`
}

object AnonMsg {
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | `0`, msg: String = null): AnonMsg = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
}

