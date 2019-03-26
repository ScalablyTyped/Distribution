package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNamedACLOperations")
@js.native
class VaultNamedACLOperations ()
  extends mfilesLib.IVaultNamedACLOperations {
  /* CompleteClass */
  override def AddNamedACLAdmin(NamedACLAdmin: mfilesLib.INamedACLAdmin): mfilesLib.INamedACLAdmin = js.native
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlList(
    AccessControlList: mfilesLib.IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): mfilesLib.INamedACL = js.native
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: mfilesLib.IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): mfilesLib.INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACL(NamedACLID: scala.Double): mfilesLib.INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACLAdmin(NamedACLID: scala.Double): mfilesLib.INamedACLAdmin = js.native
  /* CompleteClass */
  override def GetNamedACLIDByAlias(Alias: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetNamedACLIDByGUID(NamedACLGUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetNamedACLWithRefresh(NamedACLID: scala.Double, RefreshFromServer: scala.Boolean): mfilesLib.INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACLs(): mfilesLib.INamedACLs = js.native
  /* CompleteClass */
  override def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): mfilesLib.INamedACLsAdmin = js.native
  /* CompleteClass */
  override def GetNamedACLsWithRefresh(RefreshFromServer: scala.Boolean): mfilesLib.INamedACLs = js.native
  /* CompleteClass */
  override def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def RemoveNamedACLWithPropagationAdmin(NamedACLID: scala.Double, AllowPropagation: scala.Boolean): scala.Unit = js.native
  /* CompleteClass */
  override def UpdateNamedACLAdmin(NamedACLAdmin: mfilesLib.INamedACLAdmin): scala.Unit = js.native
  /* CompleteClass */
  override def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: mfilesLib.INamedACLAdmin,
    MaintainLinks: scala.Boolean,
    AllowPropagation: scala.Boolean
  ): scala.Unit = js.native
}

