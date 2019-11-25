package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlList extends js.Object {
  val AutomaticComponents: IAccessControlListComponentContainer
  val CheckedOutToUserID: Double
  var CustomComponent: IAccessControlListComponent
  val HasCheckedOutToUserID: Boolean
  var IsFullyAuthoritative: Boolean
  def Clone(): IAccessControlList
  def CloneFrom(AccessControlList: IAccessControlList): Unit
  def EqualTo(AccessControlList: IAccessControlList): Boolean
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean
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
}

