package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttTaskSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var baseline: atOracleOraclejetLib.Anon_BorderRadiusEnd
  var borderRadius: java.lang.String
  var end: java.lang.String
  var height: scala.Double | scala.Null
  var label: java.lang.String
  var labelPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerCenter | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var labelStyle: js.Object
  var progress: atOracleOraclejetLib.Anon_BorderRadiusHeightSvgClassName
  var rowId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: java.lang.String | scala.Null
  var start: java.lang.String
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.normal | atOracleOraclejetLib.atOracleOraclejetLibStrings.milestone | atOracleOraclejetLib.atOracleOraclejetLibStrings.summary | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
}

object ojGanttTaskSettableProperties {
  @scala.inline
  def apply(
    baseline: atOracleOraclejetLib.Anon_BorderRadiusEnd,
    borderRadius: java.lang.String,
    end: java.lang.String,
    label: java.lang.String,
    labelPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerCenter | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.innerEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    labelStyle: js.Object,
    progress: atOracleOraclejetLib.Anon_BorderRadiusHeightSvgClassName,
    start: java.lang.String,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.normal | atOracleOraclejetLib.atOracleOraclejetLibStrings.milestone | atOracleOraclejetLib.atOracleOraclejetLibStrings.summary | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    height: scala.Int | scala.Double = null,
    rowId: js.Any = null,
    shortDesc: java.lang.String = null
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline, borderRadius = borderRadius, end = end, label = label, labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle, progress = progress, start = start, svgClassName = svgClassName, svgStyle = svgStyle)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
}

