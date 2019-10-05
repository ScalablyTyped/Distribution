package typings.atNivoGeo.atNivoGeoMod

import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMapCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.undefined
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[_, Double])] = js.undefined
  var fillColor: js.UndefOr[String | (FeatureAccessor[_, String])] = js.undefined
  var onClick: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[GeoMapEventHandler] = js.undefined
  var tooltip: js.UndefOr[GeoMapTooltip] = js.undefined
}

object GeoMapCommonProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    borderColor: String | (FeatureAccessor[_, Double]) = null,
    borderWidth: Double | (FeatureAccessor[_, Double]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[_, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: /* InlineNestedIdentityAlias: typings.std.Partial*/ Box = null,
    onClick: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: typings.std.Partial*/ Theme = null,
    tooltip: GeoMapTooltip = null
  ): GeoMapCommonProps = {
    val __obj = js.Dynamic.literal(features = features)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor)
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation)
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation)
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[GeoMapCommonProps]
  }
}

