package typings.monk.anon

import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  var msg: js.UndefOr[String] = js.undefined
  var nIndexesWas: Double
  var ok: `1` | typings.monk.monkNumbers.`0`
}

object Msg {
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | typings.monk.monkNumbers.`0`, msg: String = null): Msg = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}

