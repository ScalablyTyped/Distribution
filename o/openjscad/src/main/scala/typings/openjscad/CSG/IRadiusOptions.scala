package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadiusOptions extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
}

object IRadiusOptions {
  @scala.inline
  def apply(radius: js.UndefOr[Double] = js.undefined, resolution: js.UndefOr[Double] = js.undefined): IRadiusOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadiusOptions]
  }
}

