package typings
package atNivoGeoLib.atNivoGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoroplethCommonProps extends CommonProps {
  var borderColor: js.UndefOr[java.lang.String | (FeatureAccessor[ChoroplethBoundFeature, scala.Double])] = js.undefined
  var borderWidth: js.UndefOr[scala.Double | (FeatureAccessor[ChoroplethBoundFeature, scala.Double])] = js.undefined
  var colors: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (FeatureAccessor[_, java.lang.String])
  ] = js.undefined
  var data: js.Array[_]
  var domain: js.Array[scala.Double]
  var fillColor: js.UndefOr[java.lang.String | (FeatureAccessor[ChoroplethBoundFeature, java.lang.String])] = js.undefined
  var label: js.UndefOr[java.lang.String | (FeatureAccessor[_, java.lang.String])] = js.undefined
  var `match`: js.UndefOr[java.lang.String | DatumMatcher] = js.undefined
  var onClick: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[ChoroplethEventHandler] = js.undefined
  var tooltip: js.UndefOr[ChoroplethTooltip] = js.undefined
  var unknownColor: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | (FeatureAccessor[_, scala.Double])] = js.undefined
  var valueFormat: js.UndefOr[java.lang.String | (FeatureAccessor[_, java.lang.String | scala.Double])] = js.undefined
}

object ChoroplethCommonProps {
  @scala.inline
  def apply(
    data: js.Array[_],
    domain: js.Array[scala.Double],
    features: js.Array[_],
    borderColor: java.lang.String | (FeatureAccessor[ChoroplethBoundFeature, scala.Double]) = null,
    borderWidth: scala.Double | (FeatureAccessor[ChoroplethBoundFeature, scala.Double]) = null,
    colors: java.lang.String | js.Array[java.lang.String] | (FeatureAccessor[_, java.lang.String]) = null,
    enableGraticule: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String | (FeatureAccessor[ChoroplethBoundFeature, java.lang.String]) = null,
    graticuleLineColor: java.lang.String = null,
    graticuleLineWidth: scala.Int | scala.Double = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | (FeatureAccessor[_, java.lang.String]) = null,
    margin: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Box = null,
    `match`: java.lang.String | DatumMatcher = null,
    onClick: ChoroplethEventHandler = null,
    onMouseEnter: ChoroplethEventHandler = null,
    onMouseLeave: ChoroplethEventHandler = null,
    onMouseMove: ChoroplethEventHandler = null,
    projectionRotation: js.Tuple3[scala.Double, scala.Double, scala.Double] = null,
    projectionScale: scala.Int | scala.Double = null,
    projectionTranslation: js.Tuple2[scala.Double, scala.Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: ChoroplethTooltip = null,
    unknownColor: java.lang.String = null,
    value: java.lang.String | (FeatureAccessor[_, scala.Double]) = null,
    valueFormat: java.lang.String | (FeatureAccessor[_, java.lang.String | scala.Double]) = null
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

