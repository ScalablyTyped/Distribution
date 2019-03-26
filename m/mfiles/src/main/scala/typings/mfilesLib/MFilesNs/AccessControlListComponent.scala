package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlListComponent")
@js.native
class AccessControlListComponent ()
  extends mfilesLib.IAccessControlListComponent {
  /* CompleteClass */
  override var AccessControlEntries: mfilesLib.IAccessControlEntryContainer = js.native
  /* CompleteClass */
  override var CanDeactivate: scala.Boolean = js.native
  /* CompleteClass */
  override val CurrentUserBinding: scala.Double = js.native
  /* CompleteClass */
  override val HasCurrentUser: scala.Boolean = js.native
  /* CompleteClass */
  override val HasCurrentUserBinding: scala.Boolean = js.native
  /* CompleteClass */
  override val HasNamedACLLink: scala.Boolean = js.native
  /* CompleteClass */
  override val HasPseudoUsers: scala.Boolean = js.native
  /* CompleteClass */
  override var IsActive: scala.Boolean = js.native
  /* CompleteClass */
  override val NamedACLLink: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlListComponent = js.native
  /* CompleteClass */
  override def GetACEByUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): mfilesLib.IAccessControlEntryData = js.native
  /* CompleteClass */
  override def GetACEKeyByUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): mfilesLib.IAccessControlEntryKey = js.native
  /* CompleteClass */
  override def ResetCurrentUserBinding(): scala.Unit = js.native
  /* CompleteClass */
  override def ResetNamedACLLink(): scala.Unit = js.native
}

