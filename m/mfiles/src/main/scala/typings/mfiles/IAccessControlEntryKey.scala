package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryKey extends StObject {
  
  def Clone(): IAccessControlEntryKey
  
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs
  
  val HasConcreteUserOrGroupID: Boolean
  
  val IsGroup: Boolean
  
  val IsPseudoUser: Boolean
  
  var PseudoUserID: IIndirectPropertyID
  
  def ResetResolvedPseudoUserOrGroupIDs(): Unit
  
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit
  
  val UserOrGroupID: Double
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
  implicit class IAccessControlEntryKeyMutableBuilder[Self <: IAccessControlEntryKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAccessControlEntryKey): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResolvedPseudoUserOrGroupIDs(value: () => IUserOrUserGroupIDs): Self = StObject.set(x, "GetResolvedPseudoUserOrGroupIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasConcreteUserOrGroupID(value: Boolean): Self = StObject.set(x, "HasConcreteUserOrGroupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: Boolean): Self = StObject.set(x, "IsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPseudoUser(value: Boolean): Self = StObject.set(x, "IsPseudoUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoUserID(value: IIndirectPropertyID): Self = StObject.set(x, "PseudoUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetResolvedPseudoUserOrGroupIDs(value: () => Unit): Self = StObject.set(x, "ResetResolvedPseudoUserOrGroupIDs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetUserOrGroupID(value: (Double, Boolean) => Unit): Self = StObject.set(x, "SetUserOrGroupID", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
