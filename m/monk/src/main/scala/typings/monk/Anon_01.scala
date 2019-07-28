package typings.monk

import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var msg: js.UndefOr[String] = js.undefined
  var nIndexesWas: Double
  var ok: `1` | `0`
}

object Anon_01 {
  @scala.inline
  def apply(nIndexesWas: Double, ok: `1` | `0`, msg: String = null): Anon_01 = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas, ok = ok.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_01]
  }
}

