package typings.passportDashFacebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Max extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: Double
}

object Anon_Max {
  @scala.inline
  def apply(min: Double, max: Int | Double = null): Anon_Max = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Max]
  }
}

