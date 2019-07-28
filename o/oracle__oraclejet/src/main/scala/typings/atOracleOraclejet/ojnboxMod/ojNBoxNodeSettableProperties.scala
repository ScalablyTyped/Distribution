package typings.atOracleOraclejet.ojnboxMod

import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColor
import typings.atOracleOraclejet.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxNodeSettableProperties extends JetSettableProperties {
  var borderColor: String
  var borderWidth: Double
  var categories: js.Array[String]
  var color: js.UndefOr[String] = js.undefined
  var column: String
  var groupCategory: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColor] = js.undefined
  var indicatorColor: js.UndefOr[String] = js.undefined
  var indicatorIcon: js.UndefOr[Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond] = js.undefined
  var label: String
  var row: String
  var secondaryLabel: String
  var shortDesc: String
  var svgClassName: String
  var svgStyle: js.Object | Null
  var xPercentage: js.UndefOr[Double | Null] = js.undefined
  var yPercentage: js.UndefOr[Double | Null] = js.undefined
}

object ojNBoxNodeSettableProperties {
  @scala.inline
  def apply(
    borderColor: String,
    borderWidth: Double,
    categories: js.Array[String],
    column: String,
    label: String,
    row: String,
    secondaryLabel: String,
    shortDesc: String,
    svgClassName: String,
    color: String = null,
    groupCategory: String = null,
    icon: Anon_BorderColorBorderRadiusBorderWidthCircleColor = null,
    indicatorColor: String = null,
    indicatorIcon: Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond = null,
    svgStyle: js.Object = null,
    xPercentage: Int | Double = null,
    yPercentage: Int | Double = null
  ): ojNBoxNodeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, borderWidth = borderWidth, categories = categories, column = column, label = label, row = row, secondaryLabel = secondaryLabel, shortDesc = shortDesc, svgClassName = svgClassName)
    if (color != null) __obj.updateDynamic("color")(color)
    if (groupCategory != null) __obj.updateDynamic("groupCategory")(groupCategory)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (indicatorColor != null) __obj.updateDynamic("indicatorColor")(indicatorColor)
    if (indicatorIcon != null) __obj.updateDynamic("indicatorIcon")(indicatorIcon)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    if (xPercentage != null) __obj.updateDynamic("xPercentage")(xPercentage.asInstanceOf[js.Any])
    if (yPercentage != null) __obj.updateDynamic("yPercentage")(yPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeSettableProperties]
  }
}

