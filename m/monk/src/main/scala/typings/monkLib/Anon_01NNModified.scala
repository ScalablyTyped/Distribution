package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01NNModified extends js.Object {
  var n: scala.Double
  var nModified: scala.Double
  var ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`
}

object Anon_01NNModified {
  @scala.inline
  def apply(
    n: scala.Double,
    nModified: scala.Double,
    ok: monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`0`
  ): Anon_01NNModified = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("nModified")(nModified)
    __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01NNModified]
  }
}

