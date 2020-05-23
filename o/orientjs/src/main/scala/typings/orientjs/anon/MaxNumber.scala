package typings.orientjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxNumber extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
}

object MaxNumber {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined): MaxNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNumber]
  }
}

