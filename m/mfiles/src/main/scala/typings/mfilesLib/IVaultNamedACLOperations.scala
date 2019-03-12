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
    AddNamedACLAdmin: INamedACLAdmin => INamedACLAdmin,
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, scala.Boolean, scala.Boolean, scala.Boolean) => INamedACL,
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, scala.Boolean, scala.Boolean) => INamedACL,
    GetNamedACL: scala.Double => INamedACL,
    GetNamedACLAdmin: scala.Double => INamedACLAdmin,
    GetNamedACLIDByAlias: java.lang.String => scala.Double,
    GetNamedACLIDByGUID: java.lang.String => scala.Double,
    GetNamedACLWithRefresh: (scala.Double, scala.Boolean) => INamedACL,
    GetNamedACLs: () => INamedACLs,
    GetNamedACLsByTypeAdmin: mfilesLib.MFilesNs.MFNamedACLType => INamedACLsAdmin,
    GetNamedACLsWithRefresh: scala.Boolean => INamedACLs,
    IsNamedACLUsedInAutomaticPermissionsAdmin: scala.Double => scala.Boolean,
    RemoveNamedACLWithPropagationAdmin: (scala.Double, scala.Boolean) => scala.Unit,
    UpdateNamedACLAdmin: INamedACLAdmin => scala.Unit,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, scala.Boolean, scala.Boolean) => scala.Unit
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = js.Any.fromFunction1(AddNamedACLAdmin), GetMatchingNamedACLForAccessControlList = js.Any.fromFunction4(GetMatchingNamedACLForAccessControlList), GetMatchingNamedACLForAccessControlListComponent = js.Any.fromFunction3(GetMatchingNamedACLForAccessControlListComponent), GetNamedACL = js.Any.fromFunction1(GetNamedACL), GetNamedACLAdmin = js.Any.fromFunction1(GetNamedACLAdmin), GetNamedACLIDByAlias = js.Any.fromFunction1(GetNamedACLIDByAlias), GetNamedACLIDByGUID = js.Any.fromFunction1(GetNamedACLIDByGUID), GetNamedACLWithRefresh = js.Any.fromFunction2(GetNamedACLWithRefresh), GetNamedACLs = js.Any.fromFunction0(GetNamedACLs), GetNamedACLsByTypeAdmin = js.Any.fromFunction1(GetNamedACLsByTypeAdmin), GetNamedACLsWithRefresh = js.Any.fromFunction1(GetNamedACLsWithRefresh), IsNamedACLUsedInAutomaticPermissionsAdmin = js.Any.fromFunction1(IsNamedACLUsedInAutomaticPermissionsAdmin), RemoveNamedACLWithPropagationAdmin = js.Any.fromFunction2(RemoveNamedACLWithPropagationAdmin), UpdateNamedACLAdmin = js.Any.fromFunction1(UpdateNamedACLAdmin), UpdateNamedACLWithPropagationAdmin = js.Any.fromFunction3(UpdateNamedACLWithPropagationAdmin))
  
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
}

