package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.Anon_BorderRadiusEnd
import typings.atOracleOraclejet.Anon_BorderRadiusHeightSvgClassName
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerCenter
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerEnd
import typings.atOracleOraclejet.atOracleOraclejetStrings.innerStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.milestone
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.normal
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttTaskSettableProperties extends JetSettableProperties {
  var baseline: Anon_BorderRadiusEnd
  var borderRadius: String
  var end: String
  var height: Double | Null
  var label: String
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none
  var labelStyle: js.Object
  var progress: Anon_BorderRadiusHeightSvgClassName
  var rowId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: String | Null
  var start: String
  var svgClassName: String
  var svgStyle: js.Object
  var `type`: normal | milestone | summary | auto
}

object ojGanttTaskSettableProperties {
  @scala.inline
  def apply(
    baseline: Anon_BorderRadiusEnd,
    borderRadius: String,
    end: String,
    label: String,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none,
    labelStyle: js.Object,
    progress: Anon_BorderRadiusHeightSvgClassName,
    start: String,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: normal | milestone | summary | auto,
    height: Int | Double = null,
    rowId: js.Any = null,
    shortDesc: String = null
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline, borderRadius = borderRadius, end = end, label = label, labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle, progress = progress, start = start, svgClassName = svgClassName, svgStyle = svgStyle)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
}

