package typings
package atNivoGeoLib.atNivoGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoMapCanvasProps extends GeoMapCommonProps {
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
}

object GeoMapCanvasProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    borderColor: java.lang.String | (FeatureAccessor[_, scala.Double]) = null,
    borderWidth: scala.Double | (FeatureAccessor[_, scala.Double]) = null,
    enableGraticule: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String | (FeatureAccessor[_, java.lang.String]) = null,
    graticuleLineColor: java.lang.String = null,
    graticuleLineWidth: scala.Int | scala.Double = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    margin: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Box = null,
    onClick: GeoMapEventHandler = null,
    onMouseEnter: GeoMapEventHandler = null,
    onMouseLeave: GeoMapEventHandler = null,
    onMouseMove: GeoMapEventHandler = null,
    pixelRatio: scala.Int | scala.Double = null,
    projectionRotation: js.Tuple3[scala.Double, scala.Double, scala.Double] = null,
    projectionScale: scala.Int | scala.Double = null,
    projectionTranslation: js.Tuple2[scala.Double, scala.Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Theme = null,
    tooltip: GeoMapTooltip = null
  ): GeoMapCanvasProps = {
    val __obj = js.Dynamic.literal(features = features)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor)
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation)
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation)
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[GeoMapCanvasProps]
  }
}

