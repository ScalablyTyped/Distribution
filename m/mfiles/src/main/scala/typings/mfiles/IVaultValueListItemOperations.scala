package typings.mfiles

import typings.mfiles.MFiles.MFAutomaticPermissionsOperationOptions
import typings.mfiles.MFiles.MFBuiltInPropertyDef
import typings.mfiles.MFiles.MFBuiltInValueList
import typings.mfiles.MFiles.MFExternalDBRefreshType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultValueListItemOperations extends StObject {
  
  def AddValueListItem(ValueList: Double, ValueListItem: IValueListItem, AdministrativeOperation: Boolean): IValueListItem = js.native
  def AddValueListItem(ValueList: MFBuiltInValueList, ValueListItem: IValueListItem, AdministrativeOperation: Boolean): IValueListItem = js.native
  
  def ChangeAutomaticPermissionsToACL(
    ValueList: Double,
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
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: Double,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  def ChangeAutomaticPermissionsToItemsOwnPermissions(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    CanDeactivate: Boolean,
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  
  def ChangeAutomaticPermissionsToNamedACL(
    ValueList: Double,
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
    AutomaticPermissionsOperationOptions: MFAutomaticPermissionsOperationOptions
  ): Unit = js.native
  
  def ChangePermissionsToACL(ValueList: Double, ValueListItemID: Double, AccessControlList: IAccessControlList): Unit = js.native
  def ChangePermissionsToACL(ValueList: MFBuiltInValueList, ValueListItemID: Double, AccessControlList: IAccessControlList): Unit = js.native
  
  def ChangePermissionsToNamedACL(ValueList: Double, ValueListItemID: Double, NamedACL: Double): Unit = js.native
  def ChangePermissionsToNamedACL(ValueList: MFBuiltInValueList, ValueListItemID: Double, NamedACL: Double): Unit = js.native
  
  def ClearAutomaticPermissions(ValueList: Double, ValueListItemID: Double): Unit = js.native
  def ClearAutomaticPermissions(ValueList: MFBuiltInValueList, ValueListItemID: Double): Unit = js.native
  
  def GetValueListItemByDisplayID(ValueList: Double, ValueListItemDisplayID: String): IValueListItem = js.native
  def GetValueListItemByDisplayID(ValueList: MFBuiltInValueList, ValueListItemDisplayID: String): IValueListItem = js.native
  
  def GetValueListItemByDisplayIDEx(ValueList: Double, ValueListItemDisplayID: String, ReplaceCurrentUserWithCallersIdentity: Boolean): IValueListItem = js.native
  def GetValueListItemByDisplayIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemDisplayID: String,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItem = js.native
  
  def GetValueListItemByGUID(
    ValueList: Double,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItem = js.native
  def GetValueListItemByGUID(
    ValueList: MFBuiltInValueList,
    ItemGUID: String,
    AllowDeletedItems: Boolean,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItem = js.native
  
  def GetValueListItemByID(ValueList: Double, ValueListItemID: Double): IValueListItem = js.native
  def GetValueListItemByID(ValueList: MFBuiltInValueList, ValueListItemID: Double): IValueListItem = js.native
  
  def GetValueListItemByIDEx(ValueList: Double, ValueListItemID: Double, ReplaceCurrentUserWithCallersIdentity: Boolean): IValueListItem = js.native
  def GetValueListItemByIDEx(
    ValueList: MFBuiltInValueList,
    ValueListItemID: Double,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItem = js.native
  
  def GetValueListItemIDByGUID(ValueList: Double, ItemGUID: String, AllowDeletedItems: Boolean): Double = js.native
  def GetValueListItemIDByGUID(ValueList: MFBuiltInValueList, ItemGUID: String, AllowDeletedItems: Boolean): Double = js.native
  
  def GetValueListItems(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType
  ): IValueListItems = js.native
  def GetValueListItems(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType
  ): IValueListItems = js.native
  
  def GetValueListItemsEx(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItems = js.native
  def GetValueListItemsEx(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItems = js.native
  
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): IValueListItems = js.native
  def GetValueListItemsEx2(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): IValueListItems = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): IValueListItems = js.native
  def GetValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): IValueListItems = js.native
  
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): IValueListItemsWithPermissions = js.native
  def GetValueListItemsWithPermissions(
    ValueList: Double,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): IValueListItemsWithPermissions = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double
  ): IValueListItemsWithPermissions = js.native
  def GetValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef
  ): IValueListItemsWithPermissions = js.native
  
  def RemoveValueListItem(ValueList: Double, Item: Double): Unit = js.native
  def RemoveValueListItem(ValueList: MFBuiltInValueList, Item: Double): Unit = js.native
  
  def SearchForValueListItemsEx(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItemSearchResults = js.native
  def SearchForValueListItemsEx(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean
  ): IValueListItemSearchResults = js.native
  
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): IValueListItemSearchResults = js.native
  def SearchForValueListItemsEx2(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): IValueListItemSearchResults = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): IValueListItemSearchResults = js.native
  def SearchForValueListItemsEx2(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): IValueListItemSearchResults = js.native
  
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): IValueListItemSearchResultsWithPermissions = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: Double,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): IValueListItemSearchResultsWithPermissions = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: Double,
    MaxResults: Double
  ): IValueListItemSearchResultsWithPermissions = js.native
  def SearchForValueListItemsWithPermissions(
    ValueList: MFBuiltInValueList,
    SearchConditions: ISearchConditions,
    UpdateFromServer: Boolean,
    RefreshTypeIfExternalValueList: MFExternalDBRefreshType,
    ReplaceCurrentUserWithCallersIdentity: Boolean,
    PropertyDef: MFBuiltInPropertyDef,
    MaxResults: Double
  ): IValueListItemSearchResultsWithPermissions = js.native
  
  def UndeleteValueListItem(ValueList: Double, ValueListItemID: Double): Unit = js.native
  def UndeleteValueListItem(ValueList: MFBuiltInValueList, ValueListItemID: Double): Unit = js.native
  
  def UpdateValueListItem(ValueListItem: IValueListItem): Unit = js.native
}
