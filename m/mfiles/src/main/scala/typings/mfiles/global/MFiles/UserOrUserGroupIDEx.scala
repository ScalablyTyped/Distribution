package typings.mfiles.global.MFiles

import typings.mfiles.IIndirectPropertyID
import typings.mfiles.IUserOrUserGroupIDEx
import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.UserOrUserGroupIDEx")
@js.native
class UserOrUserGroupIDEx ()
  extends StObject
     with IUserOrUserGroupIDEx {
  
  /* CompleteClass */
  override def Clone(): IUserOrUserGroupIDEx = js.native
  
  /* CompleteClass */
  override val IndirectProperty: IIndirectPropertyID = js.native
  
  /* CompleteClass */
  override def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit = js.native
  
  /* CompleteClass */
  override def SetUserAccount(UserAccount: Double): Unit = js.native
  
  /* CompleteClass */
  override def SetUserGroup(UserGroup: Double): Unit = js.native
  
  /* CompleteClass */
  override def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit = js.native
  
  /* CompleteClass */
  override val UserOrGroupID: Double = js.native
  
  /* CompleteClass */
  override val UserOrGroupType: MFUserOrUserGroupType = js.native
  
  /* CompleteClass */
  override val WorkflowState: Double = js.native
}
