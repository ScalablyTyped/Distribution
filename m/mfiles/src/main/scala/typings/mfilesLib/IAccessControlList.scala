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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticComponents")(AutomaticComponents)
    __obj.updateDynamic("CheckedOutToUserID")(CheckedOutToUserID)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("CustomComponent")(CustomComponent)
    __obj.updateDynamic("EqualTo")(EqualTo)
    __obj.updateDynamic("HasCheckedOutToUserID")(HasCheckedOutToUserID)
    __obj.updateDynamic("HasIdenticalPermissions")(HasIdenticalPermissions)
    __obj.updateDynamic("IsFullyAuthoritative")(IsFullyAuthoritative)
    __obj.asInstanceOf[IAccessControlList]
  }
}

