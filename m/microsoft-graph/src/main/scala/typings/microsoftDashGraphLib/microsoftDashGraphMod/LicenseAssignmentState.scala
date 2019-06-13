package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentState extends js.Object {
  var assignedByGroup: js.UndefOr[java.lang.String] = js.undefined
  var disabledPlans: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var skuId: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseAssignmentState {
  @scala.inline
  def apply(
    assignedByGroup: java.lang.String = null,
    disabledPlans: js.Array[java.lang.String] = null,
    error: java.lang.String = null,
    skuId: java.lang.String = null,
    state: java.lang.String = null
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

