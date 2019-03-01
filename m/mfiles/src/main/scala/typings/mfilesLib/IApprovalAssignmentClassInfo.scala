package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApprovalAssignmentClassInfo extends js.Object {
  var AnyAssigneeApproves: scala.Boolean
  var SignatureForApproval: ISignatureSettings
  var SignatureForRejection: ISignatureSettings
  def Clone(): IApprovalAssignmentClassInfo
}

object IApprovalAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeApproves: scala.Boolean,
    Clone: js.Function0[IApprovalAssignmentClassInfo],
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnyAssigneeApproves")(AnyAssigneeApproves)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("SignatureForApproval")(SignatureForApproval)
    __obj.updateDynamic("SignatureForRejection")(SignatureForRejection)
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
}

