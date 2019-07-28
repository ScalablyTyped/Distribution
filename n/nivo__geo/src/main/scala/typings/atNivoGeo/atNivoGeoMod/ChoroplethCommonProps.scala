package typings.atNivoGeo.atNivoGeoMod

import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
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
    margin: /* InlineNestedIdentityAlias: typings.std.Partial*/ Box = null,
    `match`: String | DatumMatcher = null,
    onClick: ChoroplethEventHandler = null,
    onMouseEnter: ChoroplethEventHandler = null,
    onMouseLeave: ChoroplethEventHandler = null,
    onMouseMove: ChoroplethEventHandler = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: typings.std.Partial*/ Theme = null,
    tooltip: ChoroplethTooltip = null,
    unknownColor: String = null,
    value: String | (FeatureAccessor[_, Double]) = null,
    valueFormat: String | (FeatureAccessor[_, String | Double]) = null
  ): ChoroplethCommonProps = {
    val __obj = js.Dynamic.literal(data = data, domain = domain, features = features)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor)
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation)
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation)
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (unknownColor != null) __obj.updateDynamic("unknownColor")(unknownColor)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(valueFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoroplethCommonProps]
  }
}

