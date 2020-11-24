package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlList extends js.Object {
  
  val AutomaticComponents: IAccessControlListComponentContainer = js.native
  
  val CheckedOutToUserID: Double = js.native
  
  def Clone(): IAccessControlList = js.native
  
  def CloneFrom(AccessControlList: IAccessControlList): Unit = js.native
  
  var CustomComponent: IAccessControlListComponent = js.native
  
  def EqualTo(AccessControlList: IAccessControlList): Boolean = js.native
  
  val HasCheckedOutToUserID: Boolean = js.native
  
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean = js.native
  
  var IsFullyAuthoritative: Boolean = js.native
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
  implicit class IAccessControlListOps[Self <: IAccessControlList] (val x: Self) extends AnyVal {
    
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
    def setAutomaticComponents(value: IAccessControlListComponentContainer): Self = this.set("AutomaticComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedOutToUserID(value: Double): Self = this.set("CheckedOutToUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IAccessControlList): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloneFrom(value: IAccessControlList => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomComponent(value: IAccessControlListComponent): Self = this.set("CustomComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualTo(value: IAccessControlList => Boolean): Self = this.set("EqualTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCheckedOutToUserID(value: Boolean): Self = this.set("HasCheckedOutToUserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasIdenticalPermissions(value: IAccessControlList => Boolean): Self = this.set("HasIdenticalPermissions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFullyAuthoritative(value: Boolean): Self = this.set("IsFullyAuthoritative", value.asInstanceOf[js.Any])
  }
}
