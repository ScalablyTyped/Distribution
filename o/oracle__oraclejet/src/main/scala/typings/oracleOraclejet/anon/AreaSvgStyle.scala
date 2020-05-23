package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaSvgStyle extends js.Object {
  var areaSvgStyle: js.UndefOr[js.Object] = js.undefined
  var dataAreaDefaults: js.UndefOr[SelectedInnerColor] = js.undefined
  var dataMarkerDefaults: js.UndefOr[BorderStyle] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var linkDefaults: js.UndefOr[ColorWidth] = js.undefined
}

object AreaSvgStyle {
  @scala.inline
  def apply(
    areaSvgStyle: js.Object = null,
    dataAreaDefaults: SelectedInnerColor = null,
    dataMarkerDefaults: BorderStyle = null,
    hoverBehaviorDelay: js.UndefOr[Double] = js.undefined,
    labelStyle: js.Object = null,
    linkDefaults: ColorWidth = null
  ): AreaSvgStyle = {
    val __obj = js.Dynamic.literal()
    if (areaSvgStyle != null) __obj.updateDynamic("areaSvgStyle")(areaSvgStyle.asInstanceOf[js.Any])
    if (dataAreaDefaults != null) __obj.updateDynamic("dataAreaDefaults")(dataAreaDefaults.asInstanceOf[js.Any])
    if (dataMarkerDefaults != null) __obj.updateDynamic("dataMarkerDefaults")(dataMarkerDefaults.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverBehaviorDelay)) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.get.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (linkDefaults != null) __obj.updateDynamic("linkDefaults")(linkDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaSvgStyle]
  }
}

