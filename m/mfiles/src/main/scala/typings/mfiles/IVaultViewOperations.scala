package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFBuiltInView
import typings.mfiles.MFiles.MFFolderUIStateLocationType
import typings.mfiles.MFiles.MFSearchFlags
import typings.mfiles.MFiles.MFViewCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultViewOperations extends js.Object {
  def AddOfflineFilter(OfflineFilter: IView): IView = js.native
  def AddTemporarySearchView(View: IView, SearchCriteria: ISearchCriteria, BaseSearchConditions: ISearchConditions): IView = js.native
  def AddView(View: IView): IView = js.native
  def FindPropertyFolderLocationInView(View: Double, PropertyFolders: ITypedValues): String = js.native
  def FindPropertyFolderLocationInView(View: MFBuiltInView, PropertyFolders: ITypedValues): String = js.native
  def GetBuiltInView(BuiltInView: MFBuiltInView): IView = js.native
  def GetFolderContents(FolderLocation: IFolderDefs): IFolderContentItems = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean
  ): IFolderNameListing = js.native
  def GetFolderUIStateForFolder(CommonState: Boolean, FolderLocation: IFolderDefs, ObjectFolder: Boolean): IFolderUIState = js.native
  def GetFolderUIStateForSpecialLocation(CommonState: Boolean, LocationType: MFFolderUIStateLocationType): IFolderUIState = js.native
  def GetMFilesURLForView(ViewID: Double, PropertyFolders: ITypedValues, SimpleURL: Boolean): String = js.native
  def GetMFilesURLForView(ViewID: MFBuiltInView, PropertyFolders: ITypedValues, SimpleURL: Boolean): String = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: Double): IPropertyValues = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: MFBuiltInObjectType): IPropertyValues = js.native
  def GetPropertyValuesOfPath(Path: String, ObjectType: Double): IPropertyValues = js.native
  def GetPropertyValuesOfPath(Path: String, ObjectType: MFBuiltInObjectType): IPropertyValues = js.native
  def GetTemporarySearchByPath(RelativePath: String): ITemporarySearchView = js.native
  def GetTemporarySearchView(ViewID: Double): ITemporarySearchView = js.native
  def GetTemporarySearchView(ViewID: MFBuiltInView): ITemporarySearchView = js.native
  def GetView(View: Double): IView = js.native
  def GetView(View: MFBuiltInView): IView = js.native
  def GetViewIDByGUID(ViewGUID: String): Double = js.native
  def GetViewLocationInClient(View: Double, IncludeViewNameInPath: Boolean): String = js.native
  def GetViewLocationInClient(View: MFBuiltInView, IncludeViewNameInPath: Boolean): String = js.native
  def GetViews(ViewCategory: MFViewCategory, AllViews: Boolean, ParentView: Double): IViews = js.native
  def GetViewsAdmin(IncludeCommonViews: Boolean, UserID: Double): IViews = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView): Unit = js.native
  def RemoveView(View: Double): Unit = js.native
  def RemoveView(View: MFBuiltInView): Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean
  ): IFolderUIState = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    LocationType: MFFolderUIStateLocationType
  ): IFolderUIState = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    State: IFolderUIState
  ): Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    LocationType: MFFolderUIStateLocationType,
    State: IFolderUIState
  ): Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: Double, View: Double, PropertyFolders: ITypedValues): Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: Double, View: MFBuiltInView, PropertyFolders: ITypedValues): Unit = js.native
  def UpdateView(View: IView): IView = js.native
}

