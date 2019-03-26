package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlList")
@js.native
class AccessControlList ()
  extends mfilesLib.IAccessControlList {
  /* CompleteClass */
  override val AutomaticComponents: mfilesLib.IAccessControlListComponentContainer = js.native
  /* CompleteClass */
  override val CheckedOutToUserID: scala.Double = js.native
  /* CompleteClass */
  override var CustomComponent: mfilesLib.IAccessControlListComponent = js.native
  /* CompleteClass */
  override val HasCheckedOutToUserID: scala.Boolean = js.native
  /* CompleteClass */
  override var IsFullyAuthoritative: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlList = js.native
  /* CompleteClass */
  override def CloneFrom(AccessControlList: mfilesLib.IAccessControlList): scala.Unit = js.native
  /* CompleteClass */
  override def EqualTo(AccessControlList: mfilesLib.IAccessControlList): scala.Boolean = js.native
  /* CompleteClass */
  override def HasIdenticalPermissions(AccessControlList: mfilesLib.IAccessControlList): scala.Boolean = js.native
}

