package typings.passportFacebook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: Double
}

object Max {
  @scala.inline
  def apply(min: Double, max: js.UndefOr[Double] = js.undefined): Max = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

