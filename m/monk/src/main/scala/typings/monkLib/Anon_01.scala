package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var msg: js.UndefOr[java.lang.String] = js.undefined
  var nIndexesWas: scala.Double
  var ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`
}

object Anon_01 {
  @scala.inline
  def apply(
    nIndexesWas: scala.Double,
    ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`,
    msg: java.lang.String = null
  ): Anon_01 = {
    val __obj = js.Dynamic.literal(nIndexesWas = nIndexesWas, ok = ok.asInstanceOf[js.Any])
    if (msg != null) __obj.updateDynamic("msg")(msg)
    __obj.asInstanceOf[Anon_01]
  }
}

