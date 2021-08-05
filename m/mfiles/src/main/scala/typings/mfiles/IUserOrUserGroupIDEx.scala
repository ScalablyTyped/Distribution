package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDEx extends StObject {
  
  def Clone(): IUserOrUserGroupIDEx
  
  val IndirectProperty: IIndirectPropertyID
  
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit
  
  def SetUserAccount(UserAccount: Double): Unit
  
  def SetUserGroup(UserGroup: Double): Unit
  
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit
  
  val UserOrGroupID: Double
  
  val UserOrGroupType: MFUserOrUserGroupType
  
  val WorkflowState: Double
}
object IUserOrUserGroupIDEx {
  
  inline def apply(
    Clone: () => IUserOrUserGroupIDEx,
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => Unit,
    SetUserAccount: Double => Unit,
    SetUserGroup: Double => Unit,
    SetWorkflowStatePseudoUser: Double => Unit,
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType,
    WorkflowState: Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IndirectProperty = IndirectProperty.asInstanceOf[js.Any], SetIndirectPropertyPseudoUser = js.Any.fromFunction1(SetIndirectPropertyPseudoUser), SetUserAccount = js.Any.fromFunction1(SetUserAccount), SetUserGroup = js.Any.fromFunction1(SetUserGroup), SetWorkflowStatePseudoUser = js.Any.fromFunction1(SetWorkflowStatePseudoUser), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any], WorkflowState = WorkflowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
  
  extension [Self <: IUserOrUserGroupIDEx](x: Self) {
    
    inline def setClone(value: () => IUserOrUserGroupIDEx): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setIndirectProperty(value: IIndirectPropertyID): Self = StObject.set(x, "IndirectProperty", value.asInstanceOf[js.Any])
    
    inline def setSetIndirectPropertyPseudoUser(value: IIndirectPropertyID => Unit): Self = StObject.set(x, "SetIndirectPropertyPseudoUser", js.Any.fromFunction1(value))
    
    inline def setSetUserAccount(value: Double => Unit): Self = StObject.set(x, "SetUserAccount", js.Any.fromFunction1(value))
    
    inline def setSetUserGroup(value: Double => Unit): Self = StObject.set(x, "SetUserGroup", js.Any.fromFunction1(value))
    
    inline def setSetWorkflowStatePseudoUser(value: Double => Unit): Self = StObject.set(x, "SetWorkflowStatePseudoUser", js.Any.fromFunction1(value))
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    inline def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowState(value: Double): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
  }
}
