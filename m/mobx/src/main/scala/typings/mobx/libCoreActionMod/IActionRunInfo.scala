package typings.mobx.libCoreActionMod

import typings.mobx.libCoreDerivationMod.IDerivation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionRunInfo extends js.Object {
  var actionId: Double
  var error: js.UndefOr[js.Any] = js.undefined
  var notifySpy: Boolean
  var parentActionId: Double
  var prevAllowStateChanges: Boolean
  var prevAllowStateReads: Boolean
  var prevDerivation: IDerivation | Null
  var startTime: Double
}

object IActionRunInfo {
  @scala.inline
  def apply(
    actionId: Double,
    notifySpy: Boolean,
    parentActionId: Double,
    prevAllowStateChanges: Boolean,
    prevAllowStateReads: Boolean,
    startTime: Double,
    error: js.Any = null,
    prevDerivation: IDerivation = null
  ): IActionRunInfo = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any], notifySpy = notifySpy.asInstanceOf[js.Any], parentActionId = parentActionId.asInstanceOf[js.Any], prevAllowStateChanges = prevAllowStateChanges.asInstanceOf[js.Any], prevAllowStateReads = prevAllowStateReads.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (prevDerivation != null) __obj.updateDynamic("prevDerivation")(prevDerivation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionRunInfo]
  }
}

