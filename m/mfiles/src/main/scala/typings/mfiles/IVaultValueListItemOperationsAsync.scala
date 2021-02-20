package typings.mfiles

import typings.mfiles.MFiles.MFAutomaticPermissionsOperationOptions
import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import typings.mfiles.MFiles.MFExternalDBRefreshType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultValueListItemOperationsAsync extends StObject {
  
  def AddValueListItem(ValueList: Double, ValueListItem: IValueListItem, AdministrativeOperation: Boolean): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: Double,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(ValueList: MFBuiltInValueList, ValueListItem: IValueListItem, AdministrativeOperation: Boolean): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItem: IValueListItem,
    AdministrativeOperation: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    NameForAutomaticPermissions: String,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ChangePermissionsToACL(ValueList: Double, ValueListItemID: Double, AccessControlList: IAccessControlList): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: Double,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(ValueList: MFBuiltInValueList, ValueListItemID: Double, AccessControlList: IAccessControlList): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    AccessControlList: IAccessControlList,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ChangePermissionsToNamedACL(ValueList: Double, ValueListItemID: Double, NamedACL: Double): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(ValueList: Double, ValueListItemID: Double, NamedACL: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: Double,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(ValueList: MFBuiltInValueList, ValueListItemID: Double, NamedACL: Double): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    NamedACL: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def ClearAutomaticPermissions(ValueList: Double, ValueListItemID: Double): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(ValueList: Double, ValueListItemID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(ValueList: MFBuiltInValueList, ValueListItemID: Double): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(ValueList: MFBuiltInValueList, ValueListItemID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ClearAutomaticPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemByDisplayID(ValueList: Double, ValueListItemDisplayID: String): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: Double,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(ValueList: MFBuiltInValueList, ValueListItemDisplayID: String): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayID(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemByDisplayIDEx(ValueList: Double, ValueListItemDisplayID: String, ReplaceCurrentUserWithCallersIdentity: Boolean): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: Double,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemByID(ValueList: Double, ValueListItemID: Double): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(ValueList: MFBuiltInValueList, ValueListItemID: Double): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByID(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemByIDEx(ValueList: Double, ValueListItemID: Double, ReplaceCurrentUserWithCallersIdentity: Boolean): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: Double,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItem, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemIDByGUID(ValueList: Double, ItemGUID: String, AllowDeletedItems: Boolean): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(ValueList: MFBuiltInValueList, ItemGUID: String, AllowDeletedItems: Boolean): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemIDByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    successCallback: js.Function1[/* result */ IValueListItemsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def RemoveValueListItem(ValueList: Double, Item: Double): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(ValueList: Double, Item: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: Double,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(ValueList: MFBuiltInValueList, Item: Double): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(ValueList: MFBuiltInValueList, Item: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveValueListItem(
    ValueList: MFBuiltInValueList,
    Item: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double,
    successCallback: js.Function1[/* result */ IValueListItemSearchResultsWithPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UndeleteValueListItem(ValueList: Double, ValueListItemID: Double): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(ValueList: Double, ValueListItemID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: Double,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(ValueList: MFBuiltInValueList, ValueListItemID: Double): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(ValueList: MFBuiltInValueList, ValueListItemID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteValueListItem(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def UpdateValueListItem(ValueListItem: IValueListItem): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateValueListItem(ValueListItem: IValueListItem, successCallback: js.Function0[Unit]): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateValueListItem(
    ValueListItem: IValueListItem,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
