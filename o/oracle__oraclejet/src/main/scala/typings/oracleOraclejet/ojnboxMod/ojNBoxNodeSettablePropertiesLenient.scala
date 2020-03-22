package typings.oracleOraclejet.ojnboxMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonBorderRadiusBorderWidth
import typings.oracleOraclejet.AnonBorderWidthColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnbox.ojNBoxNodeSettableProperties> */
trait ojNBoxNodeSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var column: js.UndefOr[String] = js.undefined
  var groupCategory: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[AnonBorderRadiusBorderWidth] = js.undefined
  var indicatorColor: js.UndefOr[String] = js.undefined
  var indicatorIcon: js.UndefOr[AnonBorderWidthColor] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var row: js.UndefOr[String] = js.undefined
  var secondaryLabel: js.UndefOr[String] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var xPercentage: js.UndefOr[Double] = js.undefined
  var yPercentage: js.UndefOr[Double] = js.undefined
}

object ojNBoxNodeSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    borderWidth: Int | Double = null,
    categories: js.Array[String] = null,
    color: String = null,
    column: String = null,
    groupCategory: String = null,
    icon: AnonBorderRadiusBorderWidth = null,
    indicatorColor: String = null,
    indicatorIcon: AnonBorderWidthColor = null,
    label: String = null,
    row: String = null,
    secondaryLabel: String = null,
    shortDesc: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    xPercentage: Int | Double = null,
    yPercentage: Int | Double = null
  ): ojNBoxNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (groupCategory != null) __obj.updateDynamic("groupCategory")(groupCategory.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (indicatorColor != null) __obj.updateDynamic("indicatorColor")(indicatorColor.asInstanceOf[js.Any])
    if (indicatorIcon != null) __obj.updateDynamic("indicatorIcon")(indicatorIcon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (secondaryLabel != null) __obj.updateDynamic("secondaryLabel")(secondaryLabel.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (xPercentage != null) __obj.updateDynamic("xPercentage")(xPercentage.asInstanceOf[js.Any])
    if (yPercentage != null) __obj.updateDynamic("yPercentage")(yPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojNBoxNodeSettablePropertiesLenient]
  }
}

