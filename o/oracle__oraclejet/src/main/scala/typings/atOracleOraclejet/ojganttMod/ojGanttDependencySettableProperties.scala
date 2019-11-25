package typings.atOracleOraclejet.ojganttMod

import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import typings.atOracleOraclejet.atOracleOraclejetStrings.finishFinish
import typings.atOracleOraclejet.atOracleOraclejetStrings.finishStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.startFinish
import typings.atOracleOraclejet.atOracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttDependencySettableProperties extends JetSettableProperties {
  var predecessorTaskId: js.Any
  var shortDesc: String | Null
  var successorTaskId: js.Any
  var svgClassName: String
  var svgStyle: js.Object
  var `type`: finishStart | finishFinish | startStart | startFinish
}

object ojGanttDependencySettableProperties {
  @scala.inline
  def apply(
    predecessorTaskId: js.Any,
    successorTaskId: js.Any,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: finishStart | finishFinish | startStart | startFinish,
    shortDesc: String = null
  ): ojGanttDependencySettableProperties = {
    val __obj = js.Dynamic.literal(predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettableProperties]
  }
}

