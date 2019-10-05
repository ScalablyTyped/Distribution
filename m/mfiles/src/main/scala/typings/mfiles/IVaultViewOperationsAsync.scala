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
trait IVaultViewOperationsAsync extends js.Object {
  def AddOfflineFilter(OfflineFilter: IView): Unit = js.native
  def AddOfflineFilter(OfflineFilter: IView, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def AddOfflineFilter(
    OfflineFilter: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddOfflineFilter(
    OfflineFilter: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddTemporarySearchView(View: IView, SearchCriteria: ISearchCriteria, BaseSearchConditions: ISearchConditions): Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, Unit]
  ): Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddView(View: IView): Unit = js.native
  def AddView(View: IView, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def AddView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(View: Double, PropertyFolders: ITypedValues): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(View: MFBuiltInView, PropertyFolders: ITypedValues): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def FindPropertyFolderLocationInView(
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetBuiltInView(BuiltInView: MFBuiltInView): Unit = js.native
  def GetBuiltInView(BuiltInView: MFBuiltInView, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def GetBuiltInView(
    BuiltInView: MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetBuiltInView(
    BuiltInView: MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFolderContents(FolderLocation: IFolderDefs): Unit = js.native
  def GetFolderContents(FolderLocation: IFolderDefs, successCallback: js.Function1[/* result */ IFolderContentItems, Unit]): Unit = js.native
  def GetFolderContents(
    FolderLocation: IFolderDefs,
    successCallback: js.Function1[/* result */ IFolderContentItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFolderContents(
    FolderLocation: IFolderDefs,
    successCallback: js.Function1[/* result */ IFolderContentItems, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean
  ): Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, Unit]
  ): Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFolderUIStateForFolder(CommonState: Boolean, FolderLocation: IFolderDefs, ObjectFolder: Boolean): Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit]
  ): Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFolderUIStateForSpecialLocation(CommonState: Boolean, LocationType: MFFolderUIStateLocationType): Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit]
  ): Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForView(ViewID: Double, PropertyFolders: ITypedValues, SimpleURL: Boolean): Unit = js.native
  def GetMFilesURLForView(
    ViewID: Double,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetMFilesURLForView(
    ViewID: Double,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForView(
    ViewID: Double,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForView(ViewID: MFBuiltInView, PropertyFolders: ITypedValues, SimpleURL: Boolean): Unit = js.native
  def GetMFilesURLForView(
    ViewID: MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetMFilesURLForView(
    ViewID: MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForView(
    ViewID: MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: Double): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: MFBuiltInObjectType): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(Path: String, ObjectType: Double): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(Path: String, ObjectType: MFBuiltInObjectType): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetPropertyValuesOfPath(
    Path: String,
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTemporarySearchByPath(RelativePath: String): Unit = js.native
  def GetTemporarySearchByPath(RelativePath: String, successCallback: js.Function1[/* result */ ITemporarySearchView, Unit]): Unit = js.native
  def GetTemporarySearchByPath(
    RelativePath: String,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetTemporarySearchByPath(
    RelativePath: String,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTemporarySearchView(ViewID: Double): Unit = js.native
  def GetTemporarySearchView(ViewID: Double, successCallback: js.Function1[/* result */ ITemporarySearchView, Unit]): Unit = js.native
  def GetTemporarySearchView(
    ViewID: Double,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetTemporarySearchView(
    ViewID: Double,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetTemporarySearchView(ViewID: MFBuiltInView): Unit = js.native
  def GetTemporarySearchView(ViewID: MFBuiltInView, successCallback: js.Function1[/* result */ ITemporarySearchView, Unit]): Unit = js.native
  def GetTemporarySearchView(
    ViewID: MFBuiltInView,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetTemporarySearchView(
    ViewID: MFBuiltInView,
    successCallback: js.Function1[/* result */ ITemporarySearchView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetView(View: Double): Unit = js.native
  def GetView(View: Double, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def GetView(
    View: Double,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetView(
    View: Double,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetView(View: MFBuiltInView): Unit = js.native
  def GetView(View: MFBuiltInView, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def GetView(
    View: MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetView(
    View: MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetViewIDByGUID(ViewGUID: String): Unit = js.native
  def GetViewIDByGUID(ViewGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetViewIDByGUID(
    ViewGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetViewIDByGUID(
    ViewGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetViewLocationInClient(View: Double, IncludeViewNameInPath: Boolean): Unit = js.native
  def GetViewLocationInClient(
    View: Double,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetViewLocationInClient(
    View: Double,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetViewLocationInClient(
    View: Double,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetViewLocationInClient(View: MFBuiltInView, IncludeViewNameInPath: Boolean): Unit = js.native
  def GetViewLocationInClient(
    View: MFBuiltInView,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetViewLocationInClient(
    View: MFBuiltInView,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetViewLocationInClient(
    View: MFBuiltInView,
    IncludeViewNameInPath: Boolean,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetViews(ViewCategory: MFViewCategory, AllViews: Boolean, ParentView: Double): Unit = js.native
  def GetViews(
    ViewCategory: MFViewCategory,
    AllViews: Boolean,
    ParentView: Double,
    successCallback: js.Function1[/* result */ IViews, Unit]
  ): Unit = js.native
  def GetViews(
    ViewCategory: MFViewCategory,
    AllViews: Boolean,
    ParentView: Double,
    successCallback: js.Function1[/* result */ IViews, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetViews(
    ViewCategory: MFViewCategory,
    AllViews: Boolean,
    ParentView: Double,
    successCallback: js.Function1[/* result */ IViews, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetViewsAdmin(IncludeCommonViews: Boolean, UserID: Double): Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: Boolean,
    UserID: Double,
    successCallback: js.Function1[/* result */ IViews, Unit]
  ): Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: Boolean,
    UserID: Double,
    successCallback: js.Function1[/* result */ IViews, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: Boolean,
    UserID: Double,
    successCallback: js.Function1[/* result */ IViews, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView): Unit = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView, successCallback: js.Function0[Unit]): Unit = js.native
  def ModifyTemporarySearch(
    TemporarySearchView: ITemporarySearchView,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ModifyTemporarySearch(
    TemporarySearchView: ITemporarySearchView,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveView(View: Double): Unit = js.native
  def RemoveView(View: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveView(
    View: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveView(
    View: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveView(View: MFBuiltInView): Unit = js.native
  def RemoveView(View: MFBuiltInView, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveView(
    View: MFBuiltInView,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveView(
    View: MFBuiltInView,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean
  ): Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit]
  ): Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    LocationType: MFFolderUIStateLocationType
  ): Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit]
  ): Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: Boolean,
    ResetToCommonDefaults: Boolean,
    LocationType: MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    State: IFolderUIState
  ): Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    LocationType: MFFolderUIStateLocationType,
    State: IFolderUIState
  ): Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    LocationType: MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    LocationType: MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: Boolean,
    ResetCommonSettingsToAllUsers: Boolean,
    LocationType: MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: Double, View: Double, PropertyFolders: ITypedValues): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: Double, View: MFBuiltInView, PropertyFolders: ITypedValues): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: Double,
    View: MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateView(View: IView): Unit = js.native
  def UpdateView(View: IView, successCallback: js.Function1[/* result */ IView, Unit]): Unit = js.native
  def UpdateView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

