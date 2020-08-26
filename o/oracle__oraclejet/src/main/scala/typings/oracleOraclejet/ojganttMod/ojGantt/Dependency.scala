package typings.oracleOraclejet.ojganttMod.ojGantt

import typings.oracleOraclejet.oracleOraclejetStrings.finishFinish
import typings.oracleOraclejet.oracleOraclejetStrings.finishStart
import typings.oracleOraclejet.oracleOraclejetStrings.startFinish
import typings.oracleOraclejet.oracleOraclejetStrings.startStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait Dependency[K1, K2] extends js.Object {
  var id: K1 = js.native
  var predecessorTaskId: K2 = js.native
  var shortDesc: js.UndefOr[String] = js.native
  var successorTaskId: K2 = js.native
  var svgClassName: js.UndefOr[String] = js.native
  var svgStyle: js.UndefOr[js.Object] = js.native
  var `type`: js.UndefOr[startStart | startFinish | finishFinish | finishStart] = js.native
}

object Dependency {
  @scala.inline
  def apply[K1, K2](id: K1, predecessorTaskId: K2, successorTaskId: K2): Dependency[K1, K2] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], predecessorTaskId = predecessorTaskId.asInstanceOf[js.Any], successorTaskId = successorTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency[K1, K2]]
  }
  @scala.inline
  implicit class DependencyOps[Self <: Dependency[_, _], K1, K2] (val x: Self with (Dependency[K1, K2])) extends AnyVal {
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
    def setId(value: K1): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredecessorTaskId(value: K2): Self = this.set("predecessorTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessorTaskId(value: K2): Self = this.set("successorTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDesc(value: String): Self = this.set("shortDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortDesc: Self = this.set("shortDesc", js.undefined)
    @scala.inline
    def setSvgClassName(value: String): Self = this.set("svgClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgClassName: Self = this.set("svgClassName", js.undefined)
    @scala.inline
    def setSvgStyle(value: js.Object): Self = this.set("svgStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgStyle: Self = this.set("svgStyle", js.undefined)
    @scala.inline
    def setType(value: startStart | startFinish | finishFinish | finishStart): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

