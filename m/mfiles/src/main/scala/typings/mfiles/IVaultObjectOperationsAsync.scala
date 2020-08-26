package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import typings.mfiles.MFiles.MFBuiltInView
import typings.mfiles.MFiles.MFLatestSpecificBehavior
import typings.mfiles.MFiles.MFObjectWindowMode
import typings.mfiles.MFiles.MFRelationshipsMode
import typings.mfiles.MFiles.MFilesURLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectOperationsAsync extends js.Object {
  def AddFavorite(ObjID: IObjID): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorite(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorites(ObjIDs: IObjIDs): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(ObjVer: IObjVer, AccessControlList: IAccessControlList, ChangeAllVersions: Boolean): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(ObjVer: IObjVer, NamedACL: Double, ChangeAllVersions: Boolean): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: Double,
    ChangeAllVersions: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckIn(ObjVer: IObjVer): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckIn(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers, successCallback: js.Function1[/* result */ IObjectVersions, Unit]): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOut(ObjID: IObjID): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOut(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs, successCallback: js.Function1[/* result */ IObjectVersions, Unit]): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewAssignment(
    AssignmentName: String,
    AssignmentDescription: String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: String,
    Extension: String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObject(
    ObjectType: MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectEx(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: Boolean,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObject(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DelayedCheckIn(ObjVer: IObjVer): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DelayedCheckIn(ObjVer: IObjVer, successCallback: js.Function0[Unit]): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteObject(ObjID: IObjID): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteObject(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObject(ObjID: IObjID, DestroyAllVersions: Boolean, ObjectVersion: Double): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: Boolean,
    ObjectVersion: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs, successCallback: js.Function0[Unit]): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: Boolean): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCollectionMembers(ObjVer: IObjVer): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCollectionMembers(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersions, Unit]): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetHistory(ObjID: IObjID): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetHistory(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersions, Unit]): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVer(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean, NotifyViews: Boolean): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(ObjID: IObjID, AllowCheckedOut: Boolean, UpdateFromServer: Boolean): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(ObjID: IObjID, TargetVersion: Double, SpecificVersion: Boolean, URLType: MFilesURLType): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: Double,
    SpecificVersion: Boolean,
    File: Double,
    URLType: MFilesURLType,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByGUID(ObjectGUID: String): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByGUID(ObjectGUID: String, successCallback: js.Function1[/* result */ IObjID, Unit]): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: String,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(OriginalVaultGUID: String, OriginalObjID: IObjID): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectGUID(ObjID: IObjID): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectGUID(ObjID: IObjID, successCallback: js.Function1[/* result */ String, Unit]): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ String, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfo(ObjVer: IObjVer, LatestVersion: Boolean, UpdateFromServer: Boolean): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfoEx(ObjVer: IObjVer, LatestVersion: Boolean, UpdateFromServer: Boolean, NotifyViews: Boolean): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: Boolean,
    UpdateFromServer: Boolean,
    NotifyViews: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(View: Double, LatestSpecificBehavior: MFLatestSpecificBehavior, ObjectVersion: IObjVer): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: Double,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(View: MFBuiltInView, LatestSpecificBehavior: MFLatestSpecificBehavior, ObjectVersion: IObjVer): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectLocationsInView(
    View: MFBuiltInView,
    LatestSpecificBehavior: MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectPermissions(ObjVer: IObjVer): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectPermissions(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersionPermissions, Unit]): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionPermissions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionPermissions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(ObjVer: IObjVer, UpdateFromServer: Boolean): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: Boolean,
    AllowCheckedOut: Boolean,
    AllowMissingObjectVersions: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineAvailability(ObjID: IObjID): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineAvailability(ObjID: IObjID, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(successCallback: js.Function1[/* result */ IObjIDs, Unit]): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.Function1[/* result */ IObjIDs, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.Function1[/* result */ IObjIDs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.Function1[/* result */ IObjIDs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetRelationships(ObjVer: IObjVer, Mode: MFRelationshipsMode): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: Double,
    Height: Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: Boolean,
    successCallback: js.Function1[/* result */ js.Array[Double], Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(ObjID: IObjID, UpdateFromServer: Boolean): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(ObjID: IObjID, UpdateFromServer: Boolean): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectFollowed(ObjID: IObjID): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectFollowed(ObjID: IObjID, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsSingleFileObject(ObjVer: IObjVer): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsSingleFileObject(ObjVer: IObjVer, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditions(pIObjVer: IObjVer, pISearchConditions: ISearchConditions): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def NotifyObjectAccess(ObjID: IObjID): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def NotifyObjectAccess(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(ParentWindow: Double, ObjVersionFile: IObjectFileAndVersion, CanCancel: Boolean): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RejectCheckInReminder(ObjVer: IObjVer): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RejectCheckInReminder(ObjVer: IObjVer, successCallback: js.Function0[Unit]): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorite(ObjID: IObjID): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorite(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorites(ObjIDs: IObjIDs): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResolveConflict(ParticipantObjID: IObjID, KeepThis: Boolean): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Rollback(ObjID: IObjID, RollbackToVersion: Double): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: Double,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetExternalID(ObjID: IObjID, ExtID: String): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetExternalID(ObjID: IObjID, ExtID: String, successCallback: js.Function0[Unit]): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: String): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: String, successCallback: js.Function0[Unit]): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: Boolean): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: Boolean): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: Boolean, successCallback: js.Function0[Unit]): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(ParentWindow: Double, ObjVer: IObjVer): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(ParentWindow: Double, ObjectType: IObjectType): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(ParentWindow: Double, ObjectID: IObjID, successCallback: js.Function0[Unit]): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminder(ParentWindow: Double, ObjVer: IObjVer, Asynchronous: Boolean): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: Double,
    ObjVer: IObjVer,
    Asynchronous: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(ParentWindow: Double, ObjVer: IObjVer, ApplyEnvironmentConditions: Boolean): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: Boolean,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: Double,
    Message: String,
    ObjID: IObjID,
    ShowCancel: Boolean,
    AutoRejectConsequentPrompts: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(ParentWindow: Double, ObjectVersion: IObjVer, Modeless: Boolean): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: Double, ObjectID: IObjID, successCallback: js.Function0[Unit]): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(ParentWindow: Double, Mode: MFObjectWindowMode, ObjVer: IObjVer): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(ParentWindow: Double, ObjectID: IObjID): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(ParentWindow: Double, ObjectID: IObjID, successCallback: js.Function0[Unit]): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(ParentWindow: Double, Mode: MFObjectWindowMode, ObjectCreationInfo: IObjectCreationInfo): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: Double,
    Mode: MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(ParentWindow: Double, ObjectVersion: IObjVer, Modeless: Boolean): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    Modeless: Boolean,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(ParentWindow: Double, ObjectID: IObjID, WindowTitle: String): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: Double,
    ObjectID: IObjID,
    WindowTitle: String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(ParentWindow: Double, ObjectVersion: IObjVer): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(ParentWindow: Double, ObjectVersion: IObjVer, successCallback: js.Function0[Unit]): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: Double,
    ObjectVersion: IObjVer,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteObject(ObjID: IObjID): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteObject(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckout(ObjVer: IObjVer): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckout(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, Unit]): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers, successCallback: js.Function1[/* result */ IObjectVersions, Unit]): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

