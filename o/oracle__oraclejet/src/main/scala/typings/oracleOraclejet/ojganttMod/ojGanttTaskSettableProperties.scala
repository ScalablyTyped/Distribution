package typings.oracleOraclejet.ojganttMod

import typings.oracleOraclejet.AnonEnd
import typings.oracleOraclejet.AnonValue
import typings.oracleOraclejet.mod.JetSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typings.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typings.oracleOraclejet.oracleOraclejetStrings.innerStart
import typings.oracleOraclejet.oracleOraclejetStrings.milestone
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.normal
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttTaskSettableProperties extends JetSettableProperties {
  var baseline: AnonEnd
  var borderRadius: String
  var end: String
  var height: Double | Null
  var label: String
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none
  var labelStyle: js.Object
  var progress: AnonValue
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
    baseline: AnonEnd,
    borderRadius: String,
    end: String,
    label: String,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none,
    labelStyle: js.Object,
    progress: AnonValue,
    start: String,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: normal | milestone | summary | auto,
    height: Int | Double = null,
    rowId: js.Any = null,
    shortDesc: String = null
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
}

