package typings.oracleOraclejet.ojnboxMod

import typings.oracleOraclejet.anon.BorderRadiusBorderWidth
import typings.oracleOraclejet.anon.BorderWidthColor
import typings.oracleOraclejet.mod.JetSettableProperties
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
  var icon: js.UndefOr[BorderRadiusBorderWidth] = js.undefined
  var indicatorColor: js.UndefOr[String] = js.undefined
  var indicatorIcon: js.UndefOr[BorderWidthColor] = js.undefined
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
    icon: BorderRadiusBorderWidth = null,
    indicatorColor: String = null,
    indicatorIcon: BorderWidthColor = null,
    svgStyle: js.Object = null,
    xPercentage: js.UndefOr[Null | Double] = js.undefined,
    yPercentage: js.UndefOr[Null | Double] = js.undefined
  ): ojNBoxNodeSettableProperties = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], secondaryLabel = secondaryLabel.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (groupCategory != null) __obj.updateDynamic("groupCategory")(groupCategory.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (indicatorColor != null) __obj.updateDynamic("indicatorColor")(indicatorColor.asInstanceOf[js.Any])
    if (indicatorIcon != null) __obj.updateDynamic("indicatorIcon")(indicatorIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(xPercentage)) __obj.updateDynamic("xPercentage")(xPercentage.asInstanceOf[js.Any])
    if (!js.isUndefined(yPercentage)) __obj.updateDynamic("yPercentage")(yPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeSettableProperties]
  }
}

