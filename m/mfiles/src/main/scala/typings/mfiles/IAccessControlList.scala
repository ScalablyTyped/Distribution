package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlList extends StObject {
  
  val AutomaticComponents: IAccessControlListComponentContainer
  
  val CheckedOutToUserID: Double
  
  def Clone(): IAccessControlList
  
  def CloneFrom(AccessControlList: IAccessControlList): Unit
  
  var CustomComponent: IAccessControlListComponent
  
  def EqualTo(AccessControlList: IAccessControlList): Boolean
  
  val HasCheckedOutToUserID: Boolean
  
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean
  
  var IsFullyAuthoritative: Boolean
}
object IAccessControlList {
  
  @scala.inline
  def apply(
    AutomaticComponents: IAccessControlListComponentContainer,
    CheckedOutToUserID: Double,
    Clone: () => IAccessControlList,
    CloneFrom: IAccessControlList => Unit,
    CustomComponent: IAccessControlListComponent,
    EqualTo: IAccessControlList => Boolean,
    HasCheckedOutToUserID: Boolean,
    HasIdenticalPermissions: IAccessControlList => Boolean,
    IsFullyAuthoritative: Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents.asInstanceOf[js.Any], CheckedOutToUserID = CheckedOutToUserID.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CustomComponent = CustomComponent.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), HasCheckedOutToUserID = HasCheckedOutToUserID.asInstanceOf[js.Any], HasIdenticalPermissions = js.Any.fromFunction1(HasIdenticalPermissions), IsFullyAuthoritative = IsFullyAuthoritative.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlList]
  }
  
  @scala.inline
  implicit class IAccessControlListMutableBuilder[Self <: IAccessControlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticComponents(value: IAccessControlListComponentContainer): Self = StObject.set(x, "AutomaticComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutToUserID(value: Double): Self = StObject.set(x, "CheckedOutToUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlList): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IAccessControlList => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomComponent(value: IAccessControlListComponent): Self = StObject.set(x, "CustomComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualTo(value: IAccessControlList => Boolean): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCheckedOutToUserID(value: Boolean): Self = StObject.set(x, "HasCheckedOutToUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasIdenticalPermissions(value: IAccessControlList => Boolean): Self = StObject.set(x, "HasIdenticalPermissions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFullyAuthoritative(value: Boolean): Self = StObject.set(x, "IsFullyAuthoritative", value.asInstanceOf[js.Any])
  }
}
