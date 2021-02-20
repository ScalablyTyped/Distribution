package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserOrUserGroupIDEx extends StObject {
  
  def Clone(): IUserOrUserGroupIDEx = js.native
  
  val IndirectProperty: IIndirectPropertyID = js.native
  
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit = js.native
  
  def SetUserAccount(UserAccount: Double): Unit = js.native
  
  def SetUserGroup(UserGroup: Double): Unit = js.native
  
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit = js.native
  
  val UserOrGroupID: Double = js.native
  
  val UserOrGroupType: MFUserOrUserGroupType = js.native
  
  val WorkflowState: Double = js.native
}
object IUserOrUserGroupIDEx {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IUserOrUserGroupIDExMutableBuilder[Self <: IUserOrUserGroupIDEx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IUserOrUserGroupIDEx): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndirectProperty(value: IIndirectPropertyID): Self = StObject.set(x, "IndirectProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIndirectPropertyPseudoUser(value: IIndirectPropertyID => Unit): Self = StObject.set(x, "SetIndirectPropertyPseudoUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserAccount(value: Double => Unit): Self = StObject.set(x, "SetUserAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserGroup(value: Double => Unit): Self = StObject.set(x, "SetUserGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetWorkflowStatePseudoUser(value: Double => Unit): Self = StObject.set(x, "SetWorkflowStatePseudoUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowState(value: Double): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
  }
}
