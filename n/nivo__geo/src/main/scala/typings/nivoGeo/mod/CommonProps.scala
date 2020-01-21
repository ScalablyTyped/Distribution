package typings.nivoGeo.mod

import typings.nivoGeo.PartialBox
import typings.nivoGeo.PartialTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  var enableGraticule: js.UndefOr[Boolean] = js.undefined
  var features: js.Array[_]
  var graticuleLineColor: js.UndefOr[String] = js.undefined
  var graticuleLineWidth: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[PartialBox] = js.undefined
  var projectionRotation: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
  var projectionScale: js.UndefOr[Double] = js.undefined
  var projectionTranslation: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var projectionType: js.UndefOr[GeoProjectionType] = js.undefined
  var theme: js.UndefOr[PartialTheme] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    features: js.Array[_],
    enableGraticule: js.UndefOr[Boolean] = js.undefined,
    graticuleLineColor: String = null,
    graticuleLineWidth: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: PartialBox = null,
    projectionRotation: js.Tuple3[Double, Double, Double] = null,
    projectionScale: Int | Double = null,
    projectionTranslation: js.Tuple2[Double, Double] = null,
    projectionType: GeoProjectionType = null,
    theme: PartialTheme = null
  ): CommonProps = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGraticule)) __obj.updateDynamic("enableGraticule")(enableGraticule.asInstanceOf[js.Any])
    if (graticuleLineColor != null) __obj.updateDynamic("graticuleLineColor")(graticuleLineColor.asInstanceOf[js.Any])
    if (graticuleLineWidth != null) __obj.updateDynamic("graticuleLineWidth")(graticuleLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (projectionRotation != null) __obj.updateDynamic("projectionRotation")(projectionRotation.asInstanceOf[js.Any])
    if (projectionScale != null) __obj.updateDynamic("projectionScale")(projectionScale.asInstanceOf[js.Any])
    if (projectionTranslation != null) __obj.updateDynamic("projectionTranslation")(projectionTranslation.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

