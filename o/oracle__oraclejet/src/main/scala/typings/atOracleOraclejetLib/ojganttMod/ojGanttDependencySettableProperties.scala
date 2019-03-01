package typings
package atOracleOraclejetLib.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttDependencySettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var predecessorTaskId: js.Any
  var shortDesc: java.lang.String | scala.Null
  var successorTaskId: js.Any
  var svgClassName: java.lang.String
  var svgStyle: js.Object
  var `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.finishStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.startStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.startFinish
}

object ojGanttDependencySettableProperties {
  @scala.inline
  def apply(
    predecessorTaskId: js.Any,
    successorTaskId: js.Any,
    svgClassName: java.lang.String,
    svgStyle: js.Object,
    `type`: atOracleOraclejetLib.atOracleOraclejetLibStrings.finishStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.finishFinish | atOracleOraclejetLib.atOracleOraclejetLibStrings.startStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.startFinish,
    shortDesc: java.lang.String = null
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("predecessorTaskId")(predecessorTaskId)
    __obj.updateDynamic("successorTaskId")(successorTaskId)
    __obj.updateDynamic("svgClassName")(svgClassName)
    __obj.updateDynamic("svgStyle")(svgStyle)
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc)
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
}

