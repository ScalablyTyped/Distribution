package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlListComponent extends StObject {
  
  var AccessControlEntries: IAccessControlEntryContainer
  
  var CanDeactivate: Boolean
  
  def Clone(): IAccessControlListComponent
  
  val CurrentUserBinding: Double
  
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData
  
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey
  
  val HasCurrentUser: Boolean
  
  val HasCurrentUserBinding: Boolean
  
  val HasNamedACLLink: Boolean
  
  val HasPseudoUsers: Boolean
  
  var IsActive: Boolean
  
  val NamedACLLink: Double
  
  def ResetCurrentUserBinding(): Unit
  
  def ResetNamedACLLink(): Unit
}
object IAccessControlListComponent {
  
  inline def apply(
    AccessControlEntries: IAccessControlEntryContainer,
    CanDeactivate: Boolean,
    Clone: () => IAccessControlListComponent,
    CurrentUserBinding: Double,
    GetACEByUserOrGroupID: (Double, Boolean) => IAccessControlEntryData,
    GetACEKeyByUserOrGroupID: (Double, Boolean) => IAccessControlEntryKey,
    HasCurrentUser: Boolean,
    HasCurrentUserBinding: Boolean,
    HasNamedACLLink: Boolean,
    HasPseudoUsers: Boolean,
    IsActive: Boolean,
    NamedACLLink: Double,
    ResetCurrentUserBinding: () => Unit,
    ResetNamedACLLink: () => Unit
  ): IAccessControlListComponent = {
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries.asInstanceOf[js.Any], CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CurrentUserBinding = CurrentUserBinding.asInstanceOf[js.Any], GetACEByUserOrGroupID = js.Any.fromFunction2(GetACEByUserOrGroupID), GetACEKeyByUserOrGroupID = js.Any.fromFunction2(GetACEKeyByUserOrGroupID), HasCurrentUser = HasCurrentUser.asInstanceOf[js.Any], HasCurrentUserBinding = HasCurrentUserBinding.asInstanceOf[js.Any], HasNamedACLLink = HasNamedACLLink.asInstanceOf[js.Any], HasPseudoUsers = HasPseudoUsers.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], NamedACLLink = NamedACLLink.asInstanceOf[js.Any], ResetCurrentUserBinding = js.Any.fromFunction0(ResetCurrentUserBinding), ResetNamedACLLink = js.Any.fromFunction0(ResetNamedACLLink))
    __obj.asInstanceOf[IAccessControlListComponent]
  }
  
  extension [Self <: IAccessControlListComponent](x: Self) {
    
    inline def setAccessControlEntries(value: IAccessControlEntryContainer): Self = StObject.set(x, "AccessControlEntries", value.asInstanceOf[js.Any])
    
    inline def setCanDeactivate(value: Boolean): Self = StObject.set(x, "CanDeactivate", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IAccessControlListComponent): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setCurrentUserBinding(value: Double): Self = StObject.set(x, "CurrentUserBinding", value.asInstanceOf[js.Any])
    
    inline def setGetACEByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryData): Self = StObject.set(x, "GetACEByUserOrGroupID", js.Any.fromFunction2(value))
    
    inline def setGetACEKeyByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryKey): Self = StObject.set(x, "GetACEKeyByUserOrGroupID", js.Any.fromFunction2(value))
    
    inline def setHasCurrentUser(value: Boolean): Self = StObject.set(x, "HasCurrentUser", value.asInstanceOf[js.Any])
    
    inline def setHasCurrentUserBinding(value: Boolean): Self = StObject.set(x, "HasCurrentUserBinding", value.asInstanceOf[js.Any])
    
    inline def setHasNamedACLLink(value: Boolean): Self = StObject.set(x, "HasNamedACLLink", value.asInstanceOf[js.Any])
    
    inline def setHasPseudoUsers(value: Boolean): Self = StObject.set(x, "HasPseudoUsers", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    inline def setNamedACLLink(value: Double): Self = StObject.set(x, "NamedACLLink", value.asInstanceOf[js.Any])
    
    inline def setResetCurrentUserBinding(value: () => Unit): Self = StObject.set(x, "ResetCurrentUserBinding", js.Any.fromFunction0(value))
    
    inline def setResetNamedACLLink(value: () => Unit): Self = StObject.set(x, "ResetNamedACLLink", js.Any.fromFunction0(value))
  }
}
