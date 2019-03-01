package typings
package atOracleOraclejetLib.ojnboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojNBoxNodeSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var borderColor: java.lang.String
  var borderWidth: scala.Double
  var categories: js.Array[java.lang.String]
  var color: js.UndefOr[java.lang.String] = js.undefined
  var column: java.lang.String
  var groupCategory: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColor] = js.undefined
  var indicatorColor: js.UndefOr[java.lang.String] = js.undefined
  var indicatorIcon: js.UndefOr[atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond] = js.undefined
  var label: java.lang.String
  var row: java.lang.String
  var secondaryLabel: java.lang.String
  var shortDesc: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object | scala.Null
  var xPercentage: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var yPercentage: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object ojNBoxNodeSettableProperties {
  @scala.inline
  def apply(
    borderColor: java.lang.String,
    borderWidth: scala.Double,
    categories: js.Array[java.lang.String],
    column: java.lang.String,
    label: java.lang.String,
    row: java.lang.String,
    secondaryLabel: java.lang.String,
    shortDesc: java.lang.String,
    svgClassName: java.lang.String,
    color: java.lang.String = null,
    groupCategory: java.lang.String = null,
    icon: atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColor = null,
    indicatorColor: java.lang.String = null,
    indicatorIcon: atOracleOraclejetLib.Anon_BorderColorBorderRadiusBorderWidthCircleColorDiamond = null,
    svgStyle: js.Object = null,
    xPercentage: scala.Int | scala.Double = null,
    yPercentage: scala.Int | scala.Double = null
  ): ojNBoxNodeSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("borderWidth")(borderWidth)
    __obj.updateDynamic("categories")(categories)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("secondaryLabel")(secondaryLabel)
    __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.updateDynamic("svgClassName")(svgClassName)
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

