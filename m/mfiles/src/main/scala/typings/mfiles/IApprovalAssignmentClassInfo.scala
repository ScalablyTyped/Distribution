package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApprovalAssignmentClassInfo extends StObject {
  
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
  implicit class IApprovalAssignmentClassInfoMutableBuilder[Self <: IApprovalAssignmentClassInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyAssigneeApproves(value: Boolean): Self = StObject.set(x, "AnyAssigneeApproves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IApprovalAssignmentClassInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureForApproval(value: ISignatureSettings): Self = StObject.set(x, "SignatureForApproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureForRejection(value: ISignatureSettings): Self = StObject.set(x, "SignatureForRejection", value.asInstanceOf[js.Any])
  }
}
