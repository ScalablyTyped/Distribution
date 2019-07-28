package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentState extends js.Object {
  var assignedByGroup: js.UndefOr[String] = js.undefined
  var disabledPlans: js.UndefOr[js.Array[String]] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var skuId: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object LicenseAssignmentState {
  @scala.inline
  def apply(
    assignedByGroup: String = null,
    disabledPlans: js.Array[String] = null,
    error: String = null,
    skuId: String = null,
    state: String = null
  ): LicenseAssignmentState = {
    val __obj = js.Dynamic.literal()
    if (assignedByGroup != null) __obj.updateDynamic("assignedByGroup")(assignedByGroup)
    if (disabledPlans != null) __obj.updateDynamic("disabledPlans")(disabledPlans)
    if (error != null) __obj.updateDynamic("error")(error)
    if (skuId != null) __obj.updateDynamic("skuId")(skuId)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[LicenseAssignmentState]
  }
}

