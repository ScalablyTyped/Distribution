package typings.mfiles

import typings.mfiles.MFilesNs.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultNamedACLOperations extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL
  def GetNamedACL(NamedACLID: Double): INamedACL
  def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin
  def GetNamedACLIDByAlias(Alias: String): Double
  def GetNamedACLIDByGUID(NamedACLGUID: String): Double
  def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL
  def GetNamedACLs(): INamedACLs
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit
}

object IVaultNamedACLOperations {
  @scala.inline
  def apply(
    AddNamedACLAdmin: INamedACLAdmin => INamedACLAdmin,
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL,
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, Boolean, Boolean) => INamedACL,
    GetNamedACL: Double => INamedACL,
    GetNamedACLAdmin: Double => INamedACLAdmin,
    GetNamedACLIDByAlias: String => Double,
    GetNamedACLIDByGUID: String => Double,
    GetNamedACLWithRefresh: (Double, Boolean) => INamedACL,
    GetNamedACLs: () => INamedACLs,
    GetNamedACLsByTypeAdmin: MFNamedACLType => INamedACLsAdmin,
    GetNamedACLsWithRefresh: Boolean => INamedACLs,
    IsNamedACLUsedInAutomaticPermissionsAdmin: Double => Boolean,
    RemoveNamedACLWithPropagationAdmin: (Double, Boolean) => Unit,
    UpdateNamedACLAdmin: INamedACLAdmin => Unit,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, Boolean, Boolean) => Unit
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = js.Any.fromFunction1(AddNamedACLAdmin), GetMatchingNamedACLForAccessControlList = js.Any.fromFunction4(GetMatchingNamedACLForAccessControlList), GetMatchingNamedACLForAccessControlListComponent = js.Any.fromFunction3(GetMatchingNamedACLForAccessControlListComponent), GetNamedACL = js.Any.fromFunction1(GetNamedACL), GetNamedACLAdmin = js.Any.fromFunction1(GetNamedACLAdmin), GetNamedACLIDByAlias = js.Any.fromFunction1(GetNamedACLIDByAlias), GetNamedACLIDByGUID = js.Any.fromFunction1(GetNamedACLIDByGUID), GetNamedACLWithRefresh = js.Any.fromFunction2(GetNamedACLWithRefresh), GetNamedACLs = js.Any.fromFunction0(GetNamedACLs), GetNamedACLsByTypeAdmin = js.Any.fromFunction1(GetNamedACLsByTypeAdmin), GetNamedACLsWithRefresh = js.Any.fromFunction1(GetNamedACLsWithRefresh), IsNamedACLUsedInAutomaticPermissionsAdmin = js.Any.fromFunction1(IsNamedACLUsedInAutomaticPermissionsAdmin), RemoveNamedACLWithPropagationAdmin = js.Any.fromFunction2(RemoveNamedACLWithPropagationAdmin), UpdateNamedACLAdmin = js.Any.fromFunction1(UpdateNamedACLAdmin), UpdateNamedACLWithPropagationAdmin = js.Any.fromFunction3(UpdateNamedACLWithPropagationAdmin))
  
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
}

