package typings.atNivoGeo.atNivoGeoMod

import typings.atNivoCore.atNivoCoreMod.Box
import typings.atNivoCore.atNivoCoreMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var enableGraticule: js.UndefOr[Boolean] = js.undefined
  var features: js.Array[_]
  var graticuleLineColor: js.UndefOr[String] = js.undefined
  var graticuleLineWidth: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[/* InlineNestedIdentityAlias: typings.std.Partial*/ Box] = js.undefined
  var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  var projectionScale: js.UndefOr[Double] = js.undefined
  var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var projectionType: js.UndefOr[GeoProjectionType] = js.undefined
  var theme: js.UndefOr[/* InlineNestedIdentityAlias: typings.std.Partial*/ Theme] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: /* InlineNestedIdentityAlias: typings.std.Partial*/ Box = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: /* InlineNestedIdentityAlias: typings.std.Partial*/ Theme = null
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

