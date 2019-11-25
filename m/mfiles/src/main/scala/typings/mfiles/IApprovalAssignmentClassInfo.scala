package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApprovalAssignmentClassInfo extends js.Object {
  var AnyAssigneeApproves: Boolean
  var SignatureForApproval: ISignatureSettings
  var SignatureForRejection: ISignatureSettings
  def Clone(): IApprovalAssignmentClassInfo
}

object IApprovalAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeApproves: Boolean,
    Clone: () => IApprovalAssignmentClassInfo,
    SignatureForApproval: ISignatureSettings,
    SignatureForRejection: ISignatureSettings
  ): IApprovalAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeApproves = AnyAssigneeApproves.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), SignatureForApproval = SignatureForApproval.asInstanceOf[js.Any], SignatureForRejection = SignatureForRejection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IApprovalAssignmentClassInfo]
  }
}

