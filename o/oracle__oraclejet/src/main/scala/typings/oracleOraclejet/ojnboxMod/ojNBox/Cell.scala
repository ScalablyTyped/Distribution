package typings.oracleOraclejet.ojnboxMod.ojNBox

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Cell extends js.Object {
  var column: String
  var label: js.UndefOr[String] = js.undefined
  var labelHalign: js.UndefOr[String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var maximizedSvgClassName: js.UndefOr[String] = js.undefined
  var maximizedSvgStyle: js.UndefOr[js.Object] = js.undefined
  var minimizedSvgClassName: js.UndefOr[String] = js.undefined
  var minimizedSvgStyle: js.UndefOr[js.Object] = js.undefined
  var row: String
  var shortDesc: js.UndefOr[String] = js.undefined
  var showCount: js.UndefOr[on | off | auto | String] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Cell {
  @scala.inline
  def apply(
    column: String,
    row: String,
    label: String = null,
    labelHalign: String = null,
    labelStyle: js.Object = null,
    maximizedSvgClassName: String = null,
    maximizedSvgStyle: js.Object = null,
    minimizedSvgClassName: String = null,
    minimizedSvgStyle: js.Object = null,
    shortDesc: String = null,
    showCount: on | off | auto | String = null,
    svgClassName: String = null,
    svgStyle: js.Object = null
  ): Cell = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (maximizedSvgClassName != null) __obj.updateDynamic("maximizedSvgClassName")(maximizedSvgClassName.asInstanceOf[js.Any])
    if (maximizedSvgStyle != null) __obj.updateDynamic("maximizedSvgStyle")(maximizedSvgStyle.asInstanceOf[js.Any])
    if (minimizedSvgClassName != null) __obj.updateDynamic("minimizedSvgClassName")(minimizedSvgClassName.asInstanceOf[js.Any])
    if (minimizedSvgStyle != null) __obj.updateDynamic("minimizedSvgStyle")(minimizedSvgStyle.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (showCount != null) __obj.updateDynamic("showCount")(showCount.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

