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
    Clone: js.Function0[IAccessControlList],
    CloneFrom: js.Function1[IAccessControlList, scala.Unit],
    CustomComponent: IAccessControlListComponent,
    EqualTo: js.Function1[IAccessControlList, scala.Boolean],
    HasCheckedOutToUserID: scala.Boolean,
    HasIdenticalPermissions: js.Function1[IAccessControlList, scala.Boolean],
    IsFullyAuthoritative: scala.Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents, CheckedOutToUserID = CheckedOutToUserID, Clone = Clone, CloneFrom = CloneFrom, CustomComponent = CustomComponent, EqualTo = EqualTo, HasCheckedOutToUserID = HasCheckedOutToUserID, HasIdenticalPermissions = HasIdenticalPermissions, IsFullyAuthoritative = IsFullyAuthoritative)
  
    __obj.asInstanceOf[IAccessControlList]
  }
}

