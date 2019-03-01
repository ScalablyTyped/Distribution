package typings
package atOracleOraclejetLib.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait Cell extends js.Object {
  var column: java.lang.String
  var label: js.UndefOr[java.lang.String] = js.undefined
  var labelHalign: js.UndefOr[java.lang.String] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var maximizedSvgClassName: js.UndefOr[java.lang.String] = js.undefined
  var maximizedSvgStyle: js.UndefOr[js.Object] = js.undefined
  var minimizedSvgClassName: js.UndefOr[java.lang.String] = js.undefined
  var minimizedSvgStyle: js.UndefOr[js.Object] = js.undefined
  var row: java.lang.String
  var shortDesc: js.UndefOr[java.lang.String] = js.undefined
  var showCount: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String
  ] = js.undefined
  var svgClassName: js.UndefOr[java.lang.String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
}

object Cell {
  @scala.inline
  def apply(
    column: java.lang.String,
    row: java.lang.String,
    label: java.lang.String = null,
    labelHalign: java.lang.String = null,
    labelStyle: js.Object = null,
    maximizedSvgClassName: java.lang.String = null,
    maximizedSvgStyle: js.Object = null,
    minimizedSvgClassName: java.lang.String = null,
    minimizedSvgStyle: js.Object = null,
    shortDesc: java.lang.String = null,
    showCount: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | java.lang.String = null,
    svgClassName: java.lang.String = null,
    svgStyle: js.Object = null
  ): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("row")(row)
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

