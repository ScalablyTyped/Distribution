package typings.node.inspectorMod.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartPreciseCoverageParameterType extends js.Object {
  /**
    * Collect accurate call counts beyond simple 'covered' or 'not covered'.
    */
  var callCount: js.UndefOr[Boolean] = js.native
  /**
    * Collect block-based coverage.
    */
  var detailed: js.UndefOr[Boolean] = js.native
}

object StartPreciseCoverageParameterType {
  @scala.inline
  def apply(): StartPreciseCoverageParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPreciseCoverageParameterType]
  }
  @scala.inline
  implicit class StartPreciseCoverageParameterTypeOps[Self <: StartPreciseCoverageParameterType] (val x: Self) extends AnyVal {
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
    def setCallCount(value: Boolean): Self = this.set("callCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallCount: Self = this.set("callCount", js.undefined)
    @scala.inline
    def setDetailed(value: Boolean): Self = this.set("detailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailed: Self = this.set("detailed", js.undefined)
  }
  
}

