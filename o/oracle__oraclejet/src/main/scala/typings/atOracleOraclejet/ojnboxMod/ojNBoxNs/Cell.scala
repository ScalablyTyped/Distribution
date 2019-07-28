package typings.atOracleOraclejet.ojnboxMod.ojNBoxNs

import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
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
    val __obj = js.Dynamic.literal(column = column, row = row)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (maximizedSvgClassName != null) __obj.updateDynamic("maximizedSvgClassName")(maximizedSvgClassName)
    if (maximizedSvgStyle != null) __obj.updateDynamic("maximizedSvgStyle")(maximizedSvgStyle)
    if (minimizedSvgClassName != null) __obj.updateDynamic("minimizedSvgClassName")(minimizedSvgClassName)
    if (minimizedSvgStyle != null) __obj.updateDynamic("minimizedSvgStyle")(minimizedSvgStyle)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    if (showCount != null) __obj.updateDynamic("showCount")(showCount.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName)
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle)
    __obj.asInstanceOf[Cell]
  }
}

