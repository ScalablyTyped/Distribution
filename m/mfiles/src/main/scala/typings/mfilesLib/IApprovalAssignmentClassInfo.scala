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
    Clone: () => IApprovalAssignmentClassInfo,
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeApproves = AnyAssigneeApproves, Clone = js.Any.fromFunction0(Clone), SignatureForApproval = SignatureForApproval, SignatureForRejection = SignatureForRejection)
  
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
}

