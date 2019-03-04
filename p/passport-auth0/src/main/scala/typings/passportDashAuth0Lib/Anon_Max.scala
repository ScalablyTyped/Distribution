package typings
package passportDashAuth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: scala.Double
}

object Anon_Max {
  @scala.inline
  def apply(min: scala.Double, max: scala.Int | scala.Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal(min = min)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

