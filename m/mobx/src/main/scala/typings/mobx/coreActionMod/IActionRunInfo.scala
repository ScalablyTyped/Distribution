package typings.mobx.coreActionMod

import typings.mobx.derivationMod.IDerivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionRunInfo extends js.Object {
  var actionId: Double = js.native
  var error: js.UndefOr[js.Any] = js.native
  var notifySpy: Boolean = js.native
  var parentActionId: Double = js.native
  var prevAllowStateChanges: Boolean = js.native
  var prevAllowStateReads: Boolean = js.native
  var prevDerivation: IDerivation | Null = js.native
  var startTime: Double = js.native
}

object IActionRunInfo {
  @scala.inline
  def apply(
    actionId: Double,
    notifySpy: Boolean,
    parentActionId: Double,
    prevAllowStateChanges: Boolean,
    prevAllowStateReads: Boolean,
    startTime: Double
  ): IActionRunInfo = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], notifySpy = notifySpy.asInstanceOf[js.Any], parentActionId = parentActionId.asInstanceOf[js.Any], prevAllowStateChanges = prevAllowStateChanges.asInstanceOf[js.Any], prevAllowStateReads = prevAllowStateReads.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionRunInfo]
  }
  @scala.inline
  implicit class IActionRunInfoOps[Self <: IActionRunInfo] (val x: Self) extends AnyVal {
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
    def setActionId(value: Double): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifySpy(value: Boolean): Self = this.set("notifySpy", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentActionId(value: Double): Self = this.set("parentActionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevAllowStateChanges(value: Boolean): Self = this.set("prevAllowStateChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevAllowStateReads(value: Boolean): Self = this.set("prevAllowStateReads", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setPrevDerivation(value: IDerivation): Self = this.set("prevDerivation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevDerivationNull: Self = this.set("prevDerivation", null)
  }
  
}

