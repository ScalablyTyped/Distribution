package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppliedConditionalAccessPolicy extends js.Object {
  // Refers to the Name of the conditional access policy (example: 'Require MFA for Salesforce').
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Refers to the grant controls enforced by the conditional access policy (example: 'Require multi-factor
    * authentication').
    */
  var enforcedGrantControls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Refers to the session controls enforced by the conditional access policy (example: 'Require app enforced controls').
  var enforcedSessionControls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // Unique GUID of the conditional access polic.y
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates the result of the CA policy that was triggered. Possible values are:successfailurenotApplied - Policy isn't
    * applied because policy conditions were not met.notEnabled - This is due to the policy in disabled state.
    */
  var result: js.UndefOr[AppliedConditionalAccessPolicyResult] = js.undefined
}

object AppliedConditionalAccessPolicy {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    enforcedGrantControls: js.Array[java.lang.String] = null,
    enforcedSessionControls: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    result: AppliedConditionalAccessPolicyResult = null
  ): AppliedConditionalAccessPolicy = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (enforcedGrantControls != null) __obj.updateDynamic("enforcedGrantControls")(enforcedGrantControls)
    if (enforcedSessionControls != null) __obj.updateDynamic("enforcedSessionControls")(enforcedSessionControls)
    if (id != null) __obj.updateDynamic("id")(id)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[AppliedConditionalAccessPolicy]
  }
}

