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

