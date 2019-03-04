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

object IVaultNamedACLOperations {
  @scala.inline
  def apply(
    AddNamedACLAdmin: js.Function1[INamedACLAdmin, INamedACLAdmin],
    GetMatchingNamedACLForAccessControlList: js.Function4[IAccessControlList, scala.Boolean, scala.Boolean, scala.Boolean, INamedACL],
    GetMatchingNamedACLForAccessControlListComponent: js.Function3[IAccessControlListComponent, scala.Boolean, scala.Boolean, INamedACL],
    GetNamedACL: js.Function1[scala.Double, INamedACL],
    GetNamedACLAdmin: js.Function1[scala.Double, INamedACLAdmin],
    GetNamedACLIDByAlias: js.Function1[java.lang.String, scala.Double],
    GetNamedACLIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetNamedACLWithRefresh: js.Function2[scala.Double, scala.Boolean, INamedACL],
    GetNamedACLs: js.Function0[INamedACLs],
    GetNamedACLsByTypeAdmin: js.Function1[mfilesLib.MFilesNs.MFNamedACLType, INamedACLsAdmin],
    GetNamedACLsWithRefresh: js.Function1[scala.Boolean, INamedACLs],
    IsNamedACLUsedInAutomaticPermissionsAdmin: js.Function1[scala.Double, scala.Boolean],
    RemoveNamedACLWithPropagationAdmin: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    UpdateNamedACLAdmin: js.Function1[INamedACLAdmin, scala.Unit],
    UpdateNamedACLWithPropagationAdmin: js.Function3[INamedACLAdmin, scala.Boolean, scala.Boolean, scala.Unit]
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = AddNamedACLAdmin, GetMatchingNamedACLForAccessControlList = GetMatchingNamedACLForAccessControlList, GetMatchingNamedACLForAccessControlListComponent = GetMatchingNamedACLForAccessControlListComponent, GetNamedACL = GetNamedACL, GetNamedACLAdmin = GetNamedACLAdmin, GetNamedACLIDByAlias = GetNamedACLIDByAlias, GetNamedACLIDByGUID = GetNamedACLIDByGUID, GetNamedACLWithRefresh = GetNamedACLWithRefresh, GetNamedACLs = GetNamedACLs, GetNamedACLsByTypeAdmin = GetNamedACLsByTypeAdmin, GetNamedACLsWithRefresh = GetNamedACLsWithRefresh, IsNamedACLUsedInAutomaticPermissionsAdmin = IsNamedACLUsedInAutomaticPermissionsAdmin, RemoveNamedACLWithPropagationAdmin = RemoveNamedACLWithPropagationAdmin, UpdateNamedACLAdmin = UpdateNamedACLAdmin, UpdateNamedACLWithPropagationAdmin = UpdateNamedACLWithPropagationAdmin)
  
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
}

