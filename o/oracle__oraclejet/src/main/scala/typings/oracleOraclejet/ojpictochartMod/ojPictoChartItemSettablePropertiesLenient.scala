package typings.oracleOraclejet.ojpictochartMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.circle
import typings.oracleOraclejet.oracleOraclejetStrings.diamond
import typings.oracleOraclejet.oracleOraclejetStrings.human
import typings.oracleOraclejet.oracleOraclejetStrings.inherit
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.plus
import typings.oracleOraclejet.oracleOraclejetStrings.rectangle
import typings.oracleOraclejet.oracleOraclejetStrings.square
import typings.oracleOraclejet.oracleOraclejetStrings.star
import typings.oracleOraclejet.oracleOraclejetStrings.triangleDown
import typings.oracleOraclejet.oracleOraclejetStrings.triangleUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojpictochart.ojPictoChartItemSettableProperties> */
trait ojPictoChartItemSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var borderColor: js.UndefOr[String] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var columnSpan: js.UndefOr[Double] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var drilling: js.UndefOr[inherit | off | on] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[
    circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String
  ] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourceHover: js.UndefOr[String] = js.undefined
  var sourceHoverSelected: js.UndefOr[String] = js.undefined
  var sourceSelected: js.UndefOr[String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object ojPictoChartItemSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    borderColor: String = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    categories: js.Array[String] = null,
    color: String = null,
    columnSpan: js.UndefOr[Double] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    drilling: inherit | off | on = null,
    name: String = null,
    rowSpan: js.UndefOr[Double] = js.undefined,
    shape: circle | diamond | human | plus | rectangle | square | star | triangleDown | triangleUp | none | String = null,
    shortDesc: String = null,
    source: String = null,
    sourceHover: String = null,
    sourceHoverSelected: String = null,
    sourceSelected: String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): ojPictoChartItemSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSpan)) __obj.updateDynamic("columnSpan")(columnSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceHover != null) __obj.updateDynamic("sourceHover")(sourceHover.asInstanceOf[js.Any])
    if (sourceHoverSelected != null) __obj.updateDynamic("sourceHoverSelected")(sourceHoverSelected.asInstanceOf[js.Any])
    if (sourceSelected != null) __obj.updateDynamic("sourceSelected")(sourceSelected.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartItemSettablePropertiesLenient]
  }
}

