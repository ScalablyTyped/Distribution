package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultObjectOperationsAsync extends js.Object {
  def AddFavorite(ObjID: IObjID): scala.Unit = js.native
  def AddFavorite(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]): scala.Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def AddFavorites(ObjIDs: IObjIDs): scala.Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(ObjVer: IObjVer, AccessControlList: IAccessControlList, ChangeAllVersions: scala.Boolean): scala.Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToACL(
    ObjVer: IObjVer,
    AccessControlList: IAccessControlList,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(ObjVer: IObjVer, NamedACL: scala.Double, ChangeAllVersions: scala.Boolean): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: scala.Double,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: scala.Double,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ChangePermissionsToNamedACL(
    ObjVer: IObjVer,
    NamedACL: scala.Double,
    ChangeAllVersions: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CheckIn(ObjVer: IObjVer): scala.Unit = js.native
  def CheckIn(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers): scala.Unit = js.native
  def CheckInMultipleObjects(ObjVers: IObjVers, successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]): scala.Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CheckInMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CheckOut(ObjID: IObjID): scala.Unit = js.native
  def CheckOut(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CheckOut(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs): scala.Unit = js.native
  def CheckOutMultipleObjects(ObjIDs: IObjIDs, successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]): scala.Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CheckOutMultipleObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewAssignment(
    AssignmentName: java.lang.String,
    AssignmentDescription: java.lang.String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewAssignment(
    AssignmentName: java.lang.String,
    AssignmentDescription: java.lang.String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewAssignment(
    AssignmentName: java.lang.String,
    AssignmentDescription: java.lang.String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewAssignment(
    AssignmentName: java.lang.String,
    AssignmentDescription: java.lang.String,
    AssignedToUser: ITypedValue,
    Deadline: ITypedValue,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: java.lang.String,
    Extension: java.lang.String,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: java.lang.String,
    Extension: java.lang.String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: java.lang.String,
    Extension: java.lang.String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewEmptySingleFileDocument(
    PropertyValues: IPropertyValues,
    Title: java.lang.String,
    Extension: java.lang.String,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: scala.Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: scala.Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: scala.Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObject(
    ObjectType: scala.Double,
    PropertyValues: IPropertyValues,
    SourceObjectFiles: ISourceObjectFiles,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObjectEx(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewObjectExQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFiles: ISourceObjectFiles,
    SFD: scala.Boolean,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewSFDObject(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateNewSFDObjectQuick(
    ObjectType: scala.Double,
    Properties: IPropertyValues,
    SourceFile: ISourceObjectFile,
    CheckIn: scala.Boolean,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DelayedCheckIn(ObjVer: IObjVer): scala.Unit = js.native
  def DelayedCheckIn(ObjVer: IObjVer, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DelayedCheckIn(
    ObjVer: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DeleteObject(ObjID: IObjID): scala.Unit = js.native
  def DeleteObject(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DestroyObject(ObjID: IObjID, DestroyAllVersions: scala.Boolean, ObjectVersion: scala.Double): scala.Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: scala.Boolean,
    ObjectVersion: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: scala.Boolean,
    ObjectVersion: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DestroyObject(
    ObjID: IObjID,
    DestroyAllVersions: scala.Boolean,
    ObjectVersion: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs): scala.Unit = js.native
  def DestroyObjects(ObjIDs: IObjIDs, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DestroyObjects(
    ObjIDs: IObjIDs,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: scala.Boolean): scala.Unit = js.native
  def FollowObject(ObjID: IObjID, Follow: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def FollowObject(
    ObjID: IObjID,
    Follow: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer): scala.Unit = js.native
  def ForceUndoCheckout(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ForceUndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetCollectionMembers(ObjVer: IObjVer): scala.Unit = js.native
  def GetCollectionMembers(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]): scala.Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetCollectionMembers(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetHistory(ObjID: IObjID): scala.Unit = js.native
  def GetHistory(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]): scala.Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetHistory(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjVer(ObjID: IObjID, AllowCheckedOut: scala.Boolean, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLatestObjVer(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean
  ): scala.Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLatestObjVerEx(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjectVersionAndProperties(ObjID: IObjID, AllowCheckedOut: scala.Boolean, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetLatestObjectVersionAndProperties(
    ObjID: IObjID,
    AllowCheckedOut: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    URLType: mfilesLib.MFilesNs.MFilesURLType
  ): scala.Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMFilesURLForObject(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    File: scala.Double,
    URLType: mfilesLib.MFilesNs.MFilesURLType
  ): scala.Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    File: scala.Double,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    File: scala.Double,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetMFilesURLForObjectOrFile(
    ObjID: IObjID,
    TargetVersion: scala.Double,
    SpecificVersion: scala.Boolean,
    File: scala.Double,
    URLType: mfilesLib.MFilesNs.MFilesURLType,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjIDByGUID(ObjectGUID: java.lang.String): scala.Unit = js.native
  def GetObjIDByGUID(ObjectGUID: java.lang.String, successCallback: js.Function1[/* result */ IObjID, scala.Unit]): scala.Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: java.lang.String,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjIDByGUID(
    ObjectGUID: java.lang.String,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjIDByOriginalObjID(OriginalVaultGUID: java.lang.String, OriginalObjID: IObjID): scala.Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: java.lang.String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit]
  ): scala.Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: java.lang.String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjIDByOriginalObjID(
    OriginalVaultGUID: java.lang.String,
    OriginalObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjID, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectGUID(ObjID: IObjID): scala.Unit = js.native
  def GetObjectGUID(ObjID: IObjID, successCallback: js.Function1[/* result */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectGUID(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ java.lang.String, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectInfo(ObjVer: IObjVer, LatestVersion: scala.Boolean, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectInfo(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean
  ): scala.Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectInfoEx(
    ObjVer: IObjVer,
    LatestVersion: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    NotifyViews: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: mfilesLib.MFilesNs.MFBuiltInView,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectLocationsInView(
    View: scala.Double,
    LatestSpecificBehavior: mfilesLib.MFilesNs.MFLatestSpecificBehavior,
    ObjectVersion: IObjVer,
    successCallback: js.Function1[/* result */ IStrings, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectPermissions(ObjVer: IObjVer): scala.Unit = js.native
  def GetObjectPermissions(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersionPermissions, scala.Unit]): scala.Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectPermissions(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersionPermissions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectVersionAndProperties(ObjVer: IObjVer, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectVersionAndProperties(
    ObjVer: IObjVer,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: scala.Boolean,
    AllowCheckedOut: scala.Boolean,
    AllowMissingObjectVersions: scala.Boolean,
    UpdateFromServer: scala.Boolean
  ): scala.Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: scala.Boolean,
    AllowCheckedOut: scala.Boolean,
    AllowMissingObjectVersions: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: scala.Boolean,
    AllowCheckedOut: scala.Boolean,
    AllowMissingObjectVersions: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetObjectVersionAndPropertiesOfMultipleObjects(
    ObjVers: IObjVers,
    LatestVersions: scala.Boolean,
    AllowCheckedOut: scala.Boolean,
    AllowMissingObjectVersions: scala.Boolean,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetOfflineAvailability(ObjID: IObjID): scala.Unit = js.native
  def GetOfflineAvailability(ObjID: IObjID, successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetOfflineAvailability(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetOfflineObjIDs(): scala.Unit = js.native
  def GetOfflineObjIDs(successCallback: js.Function1[/* result */ IObjIDs, scala.Unit]): scala.Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.Function1[/* result */ IObjIDs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetOfflineObjIDs(
    successCallback: js.Function1[/* result */ IObjIDs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetRelationships(ObjVer: IObjVer, Mode: mfilesLib.MFilesNs.MFRelationshipsMode): scala.Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: mfilesLib.MFilesNs.MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]
  ): scala.Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: mfilesLib.MFilesNs.MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetRelationships(
    ObjVer: IObjVer,
    Mode: mfilesLib.MFilesNs.MFRelationshipsMode,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: scala.Double,
    Height: scala.Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: scala.Boolean
  ): scala.Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: scala.Double,
    Height: scala.Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: scala.Boolean,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: scala.Double,
    Height: scala.Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: scala.Boolean,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetThumbnailAsBytes(
    ObjVer: IObjVer,
    FileVer: IFileVer,
    Width: scala.Double,
    Height: scala.Double,
    GetFileIconThumbnailIfRealThumbnailNotAvailable: scala.Boolean,
    successCallback: js.Function1[/* result */ js.Array[scala.Double], scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsObjectCheckedOut(ObjID: IObjID, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsObjectCheckedOut(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(ObjID: IObjID, UpdateFromServer: scala.Boolean): scala.Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsObjectCheckedOutToThisUserOnThisComputer(
    ObjID: IObjID,
    UpdateFromServer: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsObjectFollowed(ObjID: IObjID): scala.Unit = js.native
  def IsObjectFollowed(ObjID: IObjID, successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsObjectFollowed(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsSingleFileObject(ObjVer: IObjVer): scala.Unit = js.native
  def IsSingleFileObject(ObjVer: IObjVer, successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsSingleFileObject(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def MatchesSearchConditions(pIObjVer: IObjVer, pISearchConditions: ISearchConditions): scala.Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def MatchesSearchConditions(
    pIObjVer: IObjVer,
    pISearchConditions: ISearchConditions,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects
  ): scala.Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def MatchesSearchConditionsEx(
    pIObjectVersion: IObjectVersion,
    pISearchConditions: ISearchConditions,
    pIPropertyValues: IPropertyValues,
    pIObjectVersionAndPropertiesOfMultipleObjects: IObjectVersionAndPropertiesOfMultipleObjects,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def NotifyObjectAccess(ObjID: IObjID): scala.Unit = js.native
  def NotifyObjectAccess(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]): scala.Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def NotifyObjectAccess(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ProposeCheckOutForFile(ParentWindow: scala.Double, ObjVersionFile: IObjectFileAndVersion, CanCancel: scala.Boolean): scala.Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: scala.Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: scala.Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ProposeCheckOutForFile(
    ParentWindow: scala.Double,
    ObjVersionFile: IObjectFileAndVersion,
    CanCancel: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RejectCheckInReminder(ObjVer: IObjVer): scala.Unit = js.native
  def RejectCheckInReminder(ObjVer: IObjVer, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RejectCheckInReminder(
    ObjVer: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveFavorite(ObjID: IObjID): scala.Unit = js.native
  def RemoveFavorite(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit]): scala.Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveFavorite(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveFavorites(ObjIDs: IObjIDs): scala.Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit]
  ): scala.Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveFavorites(
    ObjIDs: IObjIDs,
    successCallback: js.Function1[/* result */ IObjectVersionAndPropertiesOfMultipleObjects, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ResolveConflict(ParticipantObjID: IObjID, KeepThis: scala.Boolean): scala.Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]
  ): scala.Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ResolveConflict(
    ParticipantObjID: IObjID,
    KeepThis: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def Rollback(ObjID: IObjID, RollbackToVersion: scala.Double): scala.Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def Rollback(
    ObjID: IObjID,
    RollbackToVersion: scala.Double,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetExternalID(ObjID: IObjID, ExtID: java.lang.String): scala.Unit = js.native
  def SetExternalID(ObjID: IObjID, ExtID: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetExternalID(
    ObjID: IObjID,
    ExtID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: java.lang.String): scala.Unit = js.native
  def SetObjectGUID(ObjID: IObjID, ObjectGUID: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetObjectGUID(
    ObjID: IObjID,
    ObjectGUID: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: scala.Boolean): scala.Unit = js.native
  def SetOfflineAvailability(ObjID: IObjID, AvailableInOfflineMode: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetOfflineAvailability(
    ObjID: IObjID,
    AvailableInOfflineMode: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: scala.Boolean): scala.Unit = js.native
  def SetSingleFileObject(ObjVer: IObjVer, SingleFile: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetSingleFileObject(
    ObjVer: IObjVer,
    SingleFile: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowBasicEditObjectWindow(ParentWindow: scala.Double, ObjVer: IObjVer): scala.Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit]
  ): scala.Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowBasicEditObjectWindow(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowBasicNewObjectWindow(ParentWindow: scala.Double, ObjectType: IObjectType): scala.Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: scala.Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit]
  ): scala.Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: scala.Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowBasicNewObjectWindow(
    ParentWindow: scala.Double,
    ObjectType: IObjectType,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowChangeStateDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowChangeStateDialogModal(ParentWindow: scala.Double, ObjectID: IObjID, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowChangeStateDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckInReminder(ParentWindow: scala.Double, ObjVer: IObjVer, Asynchronous: scala.Boolean): scala.Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    Asynchronous: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    Asynchronous: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowCheckInReminder(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    Asynchronous: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckInReminderDialogModal(ParentWindow: scala.Double, ObjVer: IObjVer, ApplyEnvironmentConditions: scala.Boolean): scala.Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowCheckInReminderDialogModal(
    ParentWindow: scala.Double,
    ObjVer: IObjVer,
    ApplyEnvironmentConditions: scala.Boolean,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: scala.Double,
    Message: java.lang.String,
    ObjID: IObjID,
    ShowCancel: scala.Boolean,
    AutoRejectConsequentPrompts: scala.Boolean
  ): scala.Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: scala.Double,
    Message: java.lang.String,
    ObjID: IObjID,
    ShowCancel: scala.Boolean,
    AutoRejectConsequentPrompts: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]
  ): scala.Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: scala.Double,
    Message: java.lang.String,
    ObjID: IObjID,
    ShowCancel: scala.Boolean,
    AutoRejectConsequentPrompts: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowCheckoutPrompt(
    ParentWindow: scala.Double,
    Message: java.lang.String,
    ObjID: IObjID,
    ShowCancel: scala.Boolean,
    AutoRejectConsequentPrompts: scala.Boolean,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCollectionMembersDialog(ParentWindow: scala.Double, ObjectVersion: IObjVer, Modeless: scala.Boolean): scala.Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowCollectionMembersDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowCommentsDialogModal(ParentWindow: scala.Double, ObjectID: IObjID, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowCommentsDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowEditObjectWindow(ParentWindow: scala.Double, Mode: mfilesLib.MFilesNs.MFObjectWindowMode, ObjVer: IObjVer): scala.Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit]
  ): scala.Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowEditObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowHistoryDialogModal(ParentWindow: scala.Double, ObjectID: IObjID): scala.Unit = js.native
  def ShowHistoryDialogModal(ParentWindow: scala.Double, ObjectID: IObjID, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowHistoryDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo
  ): scala.Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit]
  ): scala.Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList
  ): scala.Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit]
  ): scala.Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowPrefilledNewObjectWindow(
    ParentWindow: scala.Double,
    Mode: mfilesLib.MFilesNs.MFObjectWindowMode,
    ObjectCreationInfo: IObjectCreationInfo,
    PrefilledPropertyValues: IPropertyValues,
    AccessControlList: IAccessControlList,
    successCallback: js.Function1[/* result */ IObjectWindowResult, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: scala.Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: java.lang.String
  ): scala.Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: scala.Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: scala.Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowRelatedObjects(
    ParentWindow: scala.Double,
    SourceObject: IObjID,
    ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing,
    ViewSelectionDialogInfoText: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowRelationshipsDialog(ParentWindow: scala.Double, ObjectVersion: IObjVer, Modeless: scala.Boolean): scala.Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowRelationshipsDialog(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    Modeless: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowSelectObjectHistoryDialogModal(ParentWindow: scala.Double, ObjectID: IObjID, WindowTitle: java.lang.String): scala.Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    WindowTitle: java.lang.String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, scala.Unit]
  ): scala.Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    WindowTitle: java.lang.String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowSelectObjectHistoryDialogModal(
    ParentWindow: scala.Double,
    ObjectID: IObjID,
    WindowTitle: java.lang.String,
    successCallback: js.Function1[/* result */ IObjOrFileVer, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ShowSubObjectsDialogModal(ParentWindow: scala.Double, ObjectVersion: IObjVer): scala.Unit = js.native
  def ShowSubObjectsDialogModal(ParentWindow: scala.Double, ObjectVersion: IObjVer, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ShowSubObjectsDialogModal(
    ParentWindow: scala.Double,
    ObjectVersion: IObjVer,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndeleteObject(ObjID: IObjID): scala.Unit = js.native
  def UndeleteObject(ObjID: IObjID, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UndeleteObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndoCheckout(ObjVer: IObjVer): scala.Unit = js.native
  def UndoCheckout(ObjVer: IObjVer, successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit]): scala.Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UndoCheckout(
    ObjVer: IObjVer,
    successCallback: js.Function1[/* result */ IObjectVersion, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers): scala.Unit = js.native
  def UndoCheckoutMultipleObjects(ObjVers: IObjVers, successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit]): scala.Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UndoCheckoutMultipleObjects(
    ObjVers: IObjVers,
    successCallback: js.Function1[/* result */ IObjectVersions, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

