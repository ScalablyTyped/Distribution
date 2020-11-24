package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlEntryKey extends js.Object {
  
  def Clone(): IAccessControlEntryKey = js.native
  
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs = js.native
  
  val HasConcreteUserOrGroupID: Boolean = js.native
  
  val IsGroup: Boolean = js.native
  
  val IsPseudoUser: Boolean = js.native
  
  var PseudoUserID: IIndirectPropertyID = js.native
  
  def ResetResolvedPseudoUserOrGroupIDs(): Unit = js.native
  
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit = js.native
  
  val UserOrGroupID: Double = js.native
}
object IAccessControlEntryKey {
  
  @scala.inline
  def apply(
    Clone: () => IAccessControlEntryKey,
    GetResolvedPseudoUserOrGroupIDs: () => IUserOrUserGroupIDs,
    HasConcreteUserOrGroupID: Boolean,
    IsGroup: Boolean,
    IsPseudoUser: Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: () => Unit,
    SetUserOrGroupID: (Double, Boolean) => Unit,
    UserOrGroupID: Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(GetResolvedPseudoUserOrGroupIDs), HasConcreteUserOrGroupID = HasConcreteUserOrGroupID.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], IsPseudoUser = IsPseudoUser.asInstanceOf[js.Any], PseudoUserID = PseudoUserID.asInstanceOf[js.Any], ResetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(ResetResolvedPseudoUserOrGroupIDs), SetUserOrGroupID = js.Any.fromFunction2(SetUserOrGroupID), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
  
  @scala.inline
  implicit class IAccessControlEntryKeyOps[Self <: IAccessControlEntryKey] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IAccessControlEntryKey): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResolvedPseudoUserOrGroupIDs(value: () => IUserOrUserGroupIDs): Self = this.set("GetResolvedPseudoUserOrGroupIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasConcreteUserOrGroupID(value: Boolean): Self = this.set("HasConcreteUserOrGroupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: Boolean): Self = this.set("IsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoUser(value: Boolean): Self = this.set("IsPseudoUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoUserID(value: IIndirectPropertyID): Self = this.set("PseudoUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetResolvedPseudoUserOrGroupIDs(value: () => Unit): Self = this.set("ResetResolvedPseudoUserOrGroupIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUserOrGroupID(value: (Double, Boolean) => Unit): Self = this.set("SetUserOrGroupID", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = this.set("UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
