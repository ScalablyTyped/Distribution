package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponent extends StObject {
  
  var AccessControlEntries: IAccessControlEntryContainer = js.native
  
  var CanDeactivate: Boolean = js.native
  
  def Clone(): IAccessControlListComponent = js.native
  
  val CurrentUserBinding: Double = js.native
  
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData = js.native
  
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey = js.native
  
  val HasCurrentUser: Boolean = js.native
  
  val HasCurrentUserBinding: Boolean = js.native
  
  val HasNamedACLLink: Boolean = js.native
  
  val HasPseudoUsers: Boolean = js.native
  
  var IsActive: Boolean = js.native
  
  val NamedACLLink: Double = js.native
  
  def ResetCurrentUserBinding(): Unit = js.native
  
  def ResetNamedACLLink(): Unit = js.native
}
object IAccessControlListComponent {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IAccessControlListComponentMutableBuilder[Self <: IAccessControlListComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlEntries(value: IAccessControlEntryContainer): Self = StObject.set(x, "AccessControlEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeactivate(value: Boolean): Self = StObject.set(x, "CanDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlListComponent): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurrentUserBinding(value: Double): Self = StObject.set(x, "CurrentUserBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetACEByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryData): Self = StObject.set(x, "GetACEByUserOrGroupID", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetACEKeyByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryKey): Self = StObject.set(x, "GetACEKeyByUserOrGroupID", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasCurrentUser(value: Boolean): Self = StObject.set(x, "HasCurrentUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCurrentUserBinding(value: Boolean): Self = StObject.set(x, "HasCurrentUserBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasNamedACLLink(value: Boolean): Self = StObject.set(x, "HasNamedACLLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPseudoUsers(value: Boolean): Self = StObject.set(x, "HasPseudoUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedACLLink(value: Double): Self = StObject.set(x, "NamedACLLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetCurrentUserBinding(value: () => Unit): Self = StObject.set(x, "ResetCurrentUserBinding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetNamedACLLink(value: () => Unit): Self = StObject.set(x, "ResetNamedACLLink", js.Any.fromFunction0(value))
  }
}
