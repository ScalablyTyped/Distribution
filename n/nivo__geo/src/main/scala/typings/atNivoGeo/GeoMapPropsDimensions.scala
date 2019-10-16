package typings.atNivoGeo

import typings.atNivoGeo.atNivoGeoMod.FeatureAccessor
import typings.atNivoGeo.atNivoGeoMod.GeoMapEventHandler
import typings.atNivoGeo.atNivoGeoMod.GeoMapTooltip
import typings.atNivoGeo.atNivoGeoMod.GeoProjectionType
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/geo.@nivo/geo.GeoMapProps & @nivo/core.@nivo/core.Dimensions */
trait GeoMapPropsDimensions extends js.Object {
  var borderColor: js.UndefOr[String | (FeatureAccessor[_, Double])] = js.undefined
  var borderWidth: js.UndefOr[Double | (FeatureAccessor[_, Double])] = js.undefined
  var enableGraticule: js.UndefOr[Boolean] = js.undefined
  var features: js.Array[_]
  var fillColor: js.UndefOr[String | (FeatureAccessor[_, String])] = js.undefined
  var graticuleLineColor: js.UndefOr[String] = js.undefined
  var graticuleLineWidth: js.UndefOr[Double] = js.undefined
  var height: Double
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[PartialBox] = js.undefined
  var onClick: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[GeoMapEventHandler] = js.undefined
  var onMouseMove: js.UndefOr[GeoMapEventHandler] = js.undefined
  var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  var projectionScale: js.UndefOr[Double] = js.undefined
  var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var projectionType: js.UndefOr[GeoProjectionType] = js.undefined
  var theme: js.UndefOr[PartialTheme] = js.undefined
  var tooltip: js.UndefOr[GeoMapTooltip] = js.undefined
  var width: Double
}

object GeoMapPropsDimensions {
  @scala.inline
  def apply(
    features: js.Array[_],
    height: Double,
    width: Double,
    borderColor: String | (FeatureAccessor[_, Double]) = null,
    borderWidth: Double | (FeatureAccessor[_, Double]) = null,
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    fillColor: String | (FeatureAccessor[_, String]) = null,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: PartialBox = null,
    onClick: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseEnter: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseLeave: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    onMouseMove: (/* feature */ js.Any, /* event */ MouseEvent[js.Any, NativeMouseEvent]) => Unit = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null,
    tooltip: GeoMapTooltip = null
  ): GeoMapPropsDimensions = {
    val __obj = js.Dynamic.literal(features = features, height = height, width = width)
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
    __obj.asInstanceOf[GeoMapPropsDimensions]
  }
}

