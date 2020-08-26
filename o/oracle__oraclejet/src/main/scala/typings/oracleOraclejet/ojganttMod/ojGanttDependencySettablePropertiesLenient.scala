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
@js.native
trait ojGanttDependencySettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var predecessorTaskId: js.UndefOr[js.Any] = js.native
  var shortDesc: js.UndefOr[String | Null] = js.native
  var successorTaskId: js.UndefOr[js.Any] = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var `type`: js.UndefOr[finishStart | finishFinish | startStart | startFinish] = js.native
}

object ojGanttDependencySettablePropertiesLenient {
  @scala.inline
  def apply(): ojGanttDependencySettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojGanttDependencySettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojGanttDependencySettablePropertiesLenientOps[Self <: ojGanttDependencySettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPredecessorTaskId(value: js.Any): Self = this.set("predecessorTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredecessorTaskId: Self = this.set("predecessorTaskId", js.undefined)
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    @scala.inline
    def setShortDescNull: Self = this.set("shortDesc", null)
    @scala.inline
    def setSuccessorTaskId(value: js.Any): Self = this.set("successorTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessorTaskId: Self = this.set("successorTaskId", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setType(value: finishStart | finishFinish | startStart | startFinish): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

