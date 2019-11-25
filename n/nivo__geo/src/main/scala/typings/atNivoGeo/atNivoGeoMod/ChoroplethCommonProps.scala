package typings.atNivoGeo.atNivoGeoMod

import typings.atNivoGeo.PartialBox
import typings.atNivoGeo.PartialTheme
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoroplethCommonProps extends CommonProps {
  var borderColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.undefined
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[ChoroplethBoundFeature, Double])] = js.undefined
  var colors: js.UndefOr[String | js.Array[String] | (FeatureAccessor[_, String])] = js.undefined
  var data: js.Array[_]
  var domain: js.Array[Double]
  var fillColor: js.UndefOr[String | (FeatureAccessor[ChoroplethBoundFeature, String])] = js.undefined
  var label: js.UndefOr[String | (FeatureAccessor[_, String])] = js.undefined
  var `match`: js.UndefOr[String | DatumMatcher] = js.undefined
  var onClick: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var tooltip: js.UndefOr[ChoroplethTooltip] = js.undefined
  var unknownColor: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.undefined
  var valueFormat: js.UndefOr[String | (FeatureAccessor[_, String | Double])] = js.undefined
}

object ChoroplethCommonProps {
  @scala.inline
  def apply(
    data: js.Array[_],
    domain: js.Array[Double],
    features: js.Array[_],
    borderColor: String | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    borderWidth: Double | (FeatureAccessor[ChoroplethBoundFeature, Double]) = null,
    colors: String | js.Array[String] | (FeatureAccessor[_, String]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[ChoroplethBoundFeature, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    label: String | (FeatureAccessor[_, String]) = null,
    margin: PartialBox = null,
    `match`: String | DatumMatcher = null,
    onClick: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* feature */ ChoroplethBoundFeature, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: ChoroplethTooltip = null,
    unknownColor: String = null,
    value: String | (FeatureAccessor[_, Double]) = null,
    valueFormat: String | (FeatureAccessor[_, String | Double]) = null
  ): ChoroplethCommonProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction2(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction2(onMouseMove))
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation.asInstanceOf[js.Any])
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (unknownColor != null) __obj.updateDynamic("unknownColor")(unknownColor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethCommonProps]
  }
}

