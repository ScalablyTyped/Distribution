package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultViewOperationsAsync extends js.Object {
  def AddOfflineFilter(OfflineFilter: IView): scala.Unit = js.native
  def AddOfflineFilter(OfflineFilter: IView, successCallback: js.Function1[/* result */ IView, scala.Unit]): scala.Unit = js.native
  def AddOfflineFilter(
    OfflineFilter: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddOfflineFilter(
    OfflineFilter: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddTemporarySearchView(View: IView, SearchCriteria: ISearchCriteria, BaseSearchConditions: ISearchConditions): scala.Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, scala.Unit]
  ): scala.Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddTemporarySearchView(
    View: IView,
    SearchCriteria: ISearchCriteria,
    BaseSearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddView(View: IView): scala.Unit = js.native
  def AddView(View: IView, successCallback: js.Function1[/* result */ IView, scala.Unit]): scala.Unit = js.native
  def AddView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(View: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(View: scala.Double, PropertyFolders: ITypedValues): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def FindPropertyFolderLocationInView(
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetBuiltInView(BuiltInView: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def GetBuiltInView(
    BuiltInView: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit]
  ): scala.Unit = js.native
  def GetBuiltInView(
    BuiltInView: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetBuiltInView(
    BuiltInView: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFolderContents(FolderLocation: IFolderDefs): scala.Unit = js.native
  def GetFolderContents(
    FolderLocation: IFolderDefs,
    successCallback: js.Function1[/* result */ IFolderContentItems, scala.Unit]
  ): scala.Unit = js.native
  def GetFolderContents(
    FolderLocation: IFolderDefs,
    successCallback: js.Function1[/* result */ IFolderContentItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFolderContents(
    FolderLocation: IFolderDefs,
    successCallback: js.Function1[/* result */ IFolderContentItems, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean
  ): scala.Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, scala.Unit]
  ): scala.Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFolderNameListing(
    ExpressionEx: IExpressionEx,
    SearchConditions: ISearchConditions,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags,
    SortResults: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderNameListing, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFolderUIStateForFolder(CommonState: scala.Boolean, FolderLocation: IFolderDefs, ObjectFolder: scala.Boolean): scala.Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit]
  ): scala.Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFolderUIStateForFolder(
    CommonState: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetFolderUIStateForSpecialLocation(CommonState: scala.Boolean, LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType): scala.Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit]
  ): scala.Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetFolderUIStateForSpecialLocation(
    CommonState: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForView(ViewID: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues, SimpleURL: scala.Boolean): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForView(ViewID: scala.Double, PropertyFolders: ITypedValues, SimpleURL: scala.Boolean): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: scala.Double,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: scala.Double,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMFilesURLForView(
    ViewID: scala.Double,
    PropertyFolders: ITypedValues,
    SimpleURL: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(FolderLocation: IFolderDefs, ObjectType: scala.Double): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertyValuesOfFolder(
    FolderLocation: IFolderDefs,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(Path: java.lang.String, ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(Path: java.lang.String, ObjectType: scala.Double): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetPropertyValuesOfPath(
    Path: java.lang.String,
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IPropertyValues, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetTemporarySearchByPath(RelativePath: java.lang.String): scala.Unit = js.native
  def GetTemporarySearchByPath(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit]
  ): scala.Unit = js.native
  def GetTemporarySearchByPath(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetTemporarySearchByPath(
    RelativePath: java.lang.String,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetTemporarySearchView(ViewID: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def GetTemporarySearchView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit]
  ): scala.Unit = js.native
  def GetTemporarySearchView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetTemporarySearchView(
    ViewID: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetTemporarySearchView(ViewID: scala.Double): scala.Unit = js.native
  def GetTemporarySearchView(ViewID: scala.Double, successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit]): scala.Unit = js.native
  def GetTemporarySearchView(
    ViewID: scala.Double,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetTemporarySearchView(
    ViewID: scala.Double,
    successCallback: js.Function1[/* result */ ITemporarySearchView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetView(View: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def GetView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit]
  ): scala.Unit = js.native
  def GetView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetView(View: scala.Double): scala.Unit = js.native
  def GetView(View: scala.Double, successCallback: js.Function1[/* result */ IView, scala.Unit]): scala.Unit = js.native
  def GetView(
    View: scala.Double,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetView(
    View: scala.Double,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetViewIDByGUID(ViewGUID: java.lang.String): scala.Unit = js.native
  def GetViewIDByGUID(ViewGUID: java.lang.String, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def GetViewIDByGUID(
    ViewGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetViewIDByGUID(
    ViewGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetViewLocationInClient(View: mfilesLib.MFilesNs.MFBuiltInView, IncludeViewNameInPath: scala.Boolean): scala.Unit = js.native
  def GetViewLocationInClient(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetViewLocationInClient(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetViewLocationInClient(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetViewLocationInClient(View: scala.Double, IncludeViewNameInPath: scala.Boolean): scala.Unit = js.native
  def GetViewLocationInClient(
    View: scala.Double,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetViewLocationInClient(
    View: scala.Double,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetViewLocationInClient(
    View: scala.Double,
    IncludeViewNameInPath: scala.Boolean,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetViews(ViewCategory: mfilesLib.MFilesNs.MFViewCategory, AllViews: scala.Boolean, ParentView: scala.Double): scala.Unit = js.native
  def GetViews(
    ViewCategory: mfilesLib.MFilesNs.MFViewCategory,
    AllViews: scala.Boolean,
    ParentView: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit]
  ): scala.Unit = js.native
  def GetViews(
    ViewCategory: mfilesLib.MFilesNs.MFViewCategory,
    AllViews: scala.Boolean,
    ParentView: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetViews(
    ViewCategory: mfilesLib.MFilesNs.MFViewCategory,
    AllViews: scala.Boolean,
    ParentView: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetViewsAdmin(IncludeCommonViews: scala.Boolean, UserID: scala.Double): scala.Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit]
  ): scala.Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetViewsAdmin(
    IncludeCommonViews: scala.Boolean,
    UserID: scala.Double,
    successCallback: js.Function1[/* result */ IViews, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView): scala.Unit = js.native
  def ModifyTemporarySearch(TemporarySearchView: ITemporarySearchView, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ModifyTemporarySearch(
    TemporarySearchView: ITemporarySearchView,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ModifyTemporarySearch(
    TemporarySearchView: ITemporarySearchView,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveView(View: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def RemoveView(View: mfilesLib.MFilesNs.MFBuiltInView, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveView(View: scala.Double): scala.Unit = js.native
  def RemoveView(View: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveView(
    View: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveView(
    View: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean
  ): scala.Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit]
  ): scala.Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ResetFolderUIStateForFolder(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType
  ): scala.Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit]
  ): scala.Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ResetFolderUIStateForSpecialLocation(
    ResetToProgramDefaults: scala.Boolean,
    ResetToCommonDefaults: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    successCallback: js.Function1[/* result */ IFolderUIState, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    State: IFolderUIState
  ): scala.Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SaveFolderUIStateForFolder(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    FolderLocation: IFolderDefs,
    ObjectFolder: scala.Boolean,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    State: IFolderUIState
  ): scala.Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SaveFolderUIStateForSpecialLocation(
    SaveAsCommonSettings: scala.Boolean,
    ResetCommonSettingsToAllUsers: scala.Boolean,
    LocationType: mfilesLib.MFilesNs.MFFolderUIStateLocationType,
    State: IFolderUIState,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: scala.Double, View: mfilesLib.MFilesNs.MFBuiltInView, PropertyFolders: ITypedValues): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: mfilesLib.MFilesNs.MFBuiltInView,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(ParentWindow: scala.Double, View: scala.Double, PropertyFolders: ITypedValues): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowViewOrPropertyFolder(
    ParentWindow: scala.Double,
    View: scala.Double,
    PropertyFolders: ITypedValues,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateView(View: IView): scala.Unit = js.native
  def UpdateView(View: IView, successCallback: js.Function1[/* result */ IView, scala.Unit]): scala.Unit = js.native
  def UpdateView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateView(
    View: IView,
    successCallback: js.Function1[/* result */ IView, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

