package typings.mfiles

import typings.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedACLOperationsAsync extends js.Object {
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin, successCallback: js.Function1[/* result */ INamedACLAdmin, Unit]): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACL(NamedACLID: Double): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACL(NamedACLID: Double, successCallback: js.Function1[/* result */ INamedACL, Unit]): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACL(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(NamedACLID: Double): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(NamedACLID: Double, successCallback: js.Function1[/* result */ INamedACLAdmin, Unit]): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ INamedACLAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(Alias: String): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(Alias: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLIDByAlias(
    Alias: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(NamedACLGUID: String): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(NamedACLGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLIDByGUID(
    NamedACLGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLWithRefresh(
    NamedACLID: Double,
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACL, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLs(): Unit = js.native
  def GetNamedACLs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLs(successCallback: js.Function1[/* result */ INamedACLs, Unit]): Unit = js.native
  def GetNamedACLs(
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLs(
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLs(
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType, successCallback: js.Function1[/* result */ INamedACLsAdmin, Unit]): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLsByTypeAdmin(
    Type: MFNamedACLType,
    successCallback: js.Function1[/* result */ INamedACLsAdmin, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean, successCallback: js.Function1[/* result */ INamedACLs, Unit]): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetNamedACLsWithRefresh(
    RefreshFromServer: Boolean,
    successCallback: js.Function1[/* result */ INamedACLs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsNamedACLUsedInAutomaticPermissionsAdmin(
    NamedACLID: Double,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveNamedACLWithPropagationAdmin(
    NamedACLID: Double,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin, successCallback: js.Function0[Unit]): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateNamedACLAdmin(
    NamedACLAdmin: INamedACLAdmin,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateNamedACLWithPropagationAdmin(
    NamedACLAdmin: INamedACLAdmin,
    MaintainLinks: Boolean,
    AllowPropagation: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

