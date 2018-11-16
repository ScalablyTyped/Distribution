package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultViewOperations extends js.Object {
  def AddOfflineFilter(OfflineFilter: IView): IView = js.native
  def AddTemporarySearchView(View: IView, SearchCriteria: ISearchCriteria, BaseSearchConditions: ISearchConditions): IView = js.native
  def AddView(View: IView): IView = js.native
  def FindPropertyFolderLocationInView(View: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues): java.lang.String = js.native
  def FindPropertyFolderLocationInView(View: scala.Double, PropertyFolders: ITypedValues): java.lang.String = js.native
  def GetBuiltInView(BuiltInView: mfilesLib.MFilesNs.MFBuiltInView): IView = js.native
  def GetFolderContents(FolderLocation: IFolderDefs): IFolderContentItems = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean
  ): IFolderNameListing = js.native
  def GetFolderUIStateForFolder(CommonState: scala.Boolean, FolderLocation: IFolderDefs, ObjectFolder: scala.Boolean): IFolderUIState = js.native
  def GetFolderUIStateForSpecialLocation(CommonState: scala.Boolean, LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType): IFolderUIState = js.native
  def GetMFilesURLForView(ViewID: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues, SimpleURL: scala.Boolean): java.lang.String = js.native
  def GetMFilesURLForView(ViewID: scala.Double, PropertyFolders: ITypedValues, SimpleURL: scala.Boolean): java.lang.String = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IPropertyValues = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: scala.Double): IPropertyValues = js.native
  def GetPropertyValuesOfPath(Path: java.lang.String, ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): IPropertyValues = js.native
  def GetPropertyValuesOfPath(Path: java.lang.String, ObjectType: scala.Double): IPropertyValues = js.native
  def GetTemporarySearchByPath(RelativePath: java.lang.String): ITemporarySearchView = js.native
  def GetTemporarySearchView(ViewID: mfilesLib.MFilesNs.MFBuiltInView): ITemporarySearchView = js.native
  def GetTemporarySearchView(ViewID: scala.Double): ITemporarySearchView = js.native
  def GetView(View: mfilesLib.MFilesNs.MFBuiltInView): IView = js.native
  def GetView(View: scala.Double): IView = js.native
  def GetViewIDByGUID(ViewGUID: java.lang.String): scala.Double = js.native
  def GetViewLocationInClient(View: mfilesLib.MFilesNs.MFBuiltInView, IncludeViewNameInPath: scala.Boolean): java.lang.String = js.native
  def GetViewLocationInClient(View: scala.Double, IncludeViewNameInPath: scala.Boolean): java.lang.String = js.native
  def GetViews(ViewCategory: mfilesLib.MFilesNs.MFViewCategory, AllViews: scala.Boolean, ParentView: scala.Double): IViews = js.native
  def GetViewsAdmin(IncludeCommonViews: scala.Boolean, UserID: scala.Double): IViews = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView): scala.Unit = js.native
  def RemoveView(View: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def RemoveView(View: scala.Double): scala.Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean
  ): IFolderUIState = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType
  ): IFolderUIState = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    State: IFolderUIState
  ): scala.Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    State: IFolderUIState
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: scala.Double, View: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues): scala.Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: scala.Double, View: scala.Double, PropertyFolders: ITypedValues): scala.Unit = js.native
  def UpdateView(View: IView): IView = js.native
}

