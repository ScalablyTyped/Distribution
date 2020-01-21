package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAreaSvgStyle extends js.Object {
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  var dataAreaDefaults: js.UndefOr[AnonBorderColorHoverColor] = js.undefined
  var dataMarkerDefaults: js.UndefOr[AnonBorderColorBorderStyle] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var linkDefaults: js.UndefOr[AnonColorWidth] = js.undefined
}

object AnonAreaSvgStyle {
  @scala.inline
  def apply(
    areaSvgStyle: js.Object = null,
    dataAreaDefaults: AnonBorderColorHoverColor = null,
    dataMarkerDefaults: AnonBorderColorBorderStyle = null,
    hoverBehaviorDelay: Int | Double = null,
    labelStyle: js.Object = null,
    linkDefaults: AnonColorWidth = null
  ): AnonAreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    if (areaSvgStyle != null) __obj.updateDynamic("areaSvgStyle")(areaSvgStyle.asInstanceOf[js.Any])
    if (dataAreaDefaults != null) __obj.updateDynamic("dataAreaDefaults")(dataAreaDefaults.asInstanceOf[js.Any])
    if (dataMarkerDefaults != null) __obj.updateDynamic("dataMarkerDefaults")(dataMarkerDefaults.asInstanceOf[js.Any])
    if (hoverBehaviorDelay != null) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (linkDefaults != null) __obj.updateDynamic("linkDefaults")(linkDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAreaSvgStyle]
  }
}

