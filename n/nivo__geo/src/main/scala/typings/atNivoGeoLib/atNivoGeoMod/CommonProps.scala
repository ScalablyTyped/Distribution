package typings
package atNivoGeoLib.atNivoGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var enableGraticule: js.UndefOr[scala.Boolean] = js.undefined
  var features: js.Array[_]
  var graticuleLineColor: js.UndefOr[java.lang.String] = js.undefined
  var graticuleLineWidth: js.UndefOr[scala.Double] = js.undefined
  var isInteractive: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[/* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Box] = js.undefined
  var projectionRotation: js.UndefOr[js.Tuple3[scala.Double, scala.Double, scala.Double]] = js.undefined
  var projectionScale: js.UndefOr[scala.Double] = js.undefined
  var projectionTranslation: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var projectionType: js.UndefOr[GeoProjectionType] = js.undefined
  var theme: js.UndefOr[/* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Theme] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    enableGraticule: js.UndefOr[scala.Boolean] = js.undefined,
    graticuleLineColor: java.lang.String = null,
    graticuleLineWidth: scala.Int | scala.Double = null,
    isInteractive: js.UndefOr[scala.Boolean] = js.undefined,
    margin: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Box = null,
    projectionRotation: js.Tuple3[scala.Double, scala.Double, scala.Double] = null,
    projectionScale: scala.Int | scala.Double = null,
    projectionTranslation: js.Tuple2[scala.Double, scala.Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: stdLib.Partial*/ atNivoCoreLib.atNivoCoreMod.Theme = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal(features = features)
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule)
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor)
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation)
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation)
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CommonProps]
  }
}

