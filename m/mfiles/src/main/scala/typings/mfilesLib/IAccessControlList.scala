package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlList extends js.Object {
  val AutomaticComponents: IAccessControlListComponentContainer
  val CheckedOutToUserID: scala.Double
  var CustomComponent: IAccessControlListComponent
  val HasCheckedOutToUserID: scala.Boolean
  var IsFullyAuthoritative: scala.Boolean
  def Clone(): IAccessControlList
  def CloneFrom(AccessControlList: IAccessControlList): scala.Unit
  def EqualTo(AccessControlList: IAccessControlList): scala.Boolean
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): scala.Boolean
}

object IAccessControlList {
  @scala.inline
  def apply(
    AutomaticComponents: IAccessControlListComponentContainer,
    CheckedOutToUserID: scala.Double,
    Clone: () => IAccessControlList,
    CloneFrom: IAccessControlList => scala.Unit,
    CustomComponent: IAccessControlListComponent,
    EqualTo: IAccessControlList => scala.Boolean,
    HasCheckedOutToUserID: scala.Boolean,
    HasIdenticalPermissions: IAccessControlList => scala.Boolean,
    IsFullyAuthoritative: scala.Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents, CheckedOutToUserID = CheckedOutToUserID, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), CustomComponent = CustomComponent, EqualTo = js.Any.fromFunction1(EqualTo), HasCheckedOutToUserID = HasCheckedOutToUserID, HasIdenticalPermissions = js.Any.fromFunction1(HasIdenticalPermissions), IsFullyAuthoritative = IsFullyAuthoritative)
  
    __obj.asInstanceOf[IAccessControlList]
  }
}

