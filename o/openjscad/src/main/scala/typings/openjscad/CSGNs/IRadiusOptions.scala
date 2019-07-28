package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRadiusOptions extends js.Object {
  var radius: js.UndefOr[Double] = js.undefined
  var resolution: js.UndefOr[Double] = js.undefined
}

object IRadiusOptions {
  @scala.inline
  def apply(radius: Int | Double = null, resolution: Int | Double = null): IRadiusOptions = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRadiusOptions]
  }
}

