package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApprovalAssignmentClassInfo extends js.Object {
  
  var AnyAssigneeApproves: Boolean = js.native
  
  def Clone(): IApprovalAssignmentClassInfo = js.native
  
  var SignatureForApproval: ISignatureSettings = js.native
  
  var SignatureForRejection: ISignatureSettings = js.native
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
  
  @scala.inline
  implicit class IApprovalAssignmentClassInfoOps[Self <: IApprovalAssignmentClassInfo] (val x: Self) extends AnyVal {
    
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
    def setAnyAssigneeApproves(value: Boolean): Self = this.set("AnyAssigneeApproves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IApprovalAssignmentClassInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureForApproval(value: ISignatureSettings): Self = this.set("SignatureForApproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureForRejection(value: ISignatureSettings): Self = this.set("SignatureForRejection", value.asInstanceOf[js.Any])
  }
}
