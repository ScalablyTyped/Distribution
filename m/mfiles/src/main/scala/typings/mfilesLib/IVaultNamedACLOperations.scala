package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultNamedACLOperations extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: scala.Boolean,
    ActiveAccessControlComponentsOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): INamedACL
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: scala.Boolean,
    RefreshFromServer: scala.Boolean
  ): INamedACL
  def GetNamedACL(NamedACLID: scala.Double): INamedACL
  def GetNamedACLAdmin(NamedACLID: scala.Double): INamedACLAdmin
  def GetNamedACLIDByAlias(Alias: java.lang.String): scala.Double
  def GetNamedACLIDByGUID(NamedACLGUID: java.lang.String): scala.Double
  def GetNamedACLWithRefresh(NamedACLID: scala.Double, RefreshFromServer: scala.Boolean): INamedACL
  def GetNamedACLs(): INamedACLs
  def GetNamedACLsByTypeAdmin(Type: mfilesLib.MFilesNs.MFNamedACLType): INamedACLsAdmin
  def GetNamedACLsWithRefresh(RefreshFromServer: scala.Boolean): INamedACLs
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: scala.Double): scala.Boolean
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: scala.Double, AllowPropagation: scala.Boolean): scala.Unit
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): scala.Unit
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: scala.Boolean, AllowPropagation: scala.Boolean): scala.Unit
}

