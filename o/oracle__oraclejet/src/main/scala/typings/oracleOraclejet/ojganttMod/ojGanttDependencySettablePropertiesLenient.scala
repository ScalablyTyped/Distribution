package typings.oracleOraclejet.ojganttMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojgantt.ojGanttDependencySettableProperties> */
trait ojGanttDependencySettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var predecessorTaskId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: js.UndefOr[String] = js.undefined
  var successorTaskId: js.UndefOr[js.Any] = js.undefined
  var svgClassName: js.UndefOr[String] = js.undefined
  var svgStyle: js.UndefOr[js.Object] = js.undefined
  var `type`: js.UndefOr[finishStart | finishFinish | startStart | startFinish] = js.undefined
}

object ojGanttDependencySettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    predecessorTaskId: js.Any = null,
    shortDesc: String = null,
    successorTaskId: js.Any = null,
    svgClassName: String = null,
    svgStyle: js.Object = null,
    `type`: finishStart | finishFinish | startStart | startFinish = null
  ): ojGanttDependencySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (predecessorTaskId != null) __obj.updateDynamic("predecessorTaskId")(predecessorTaskId.asInstanceOf[js.Any])
    if (shortDesc != null) __obj.updateDynamic("shortDesc")(shortDesc.asInstanceOf[js.Any])
    if (successorTaskId != null) __obj.updateDynamic("successorTaskId")(successorTaskId.asInstanceOf[js.Any])
    if (svgClassName != null) __obj.updateDynamic("svgClassName")(svgClassName.asInstanceOf[js.Any])
    if (svgStyle != null) __obj.updateDynamic("svgStyle")(svgStyle.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttDependencySettablePropertiesLenient]
  }
}

