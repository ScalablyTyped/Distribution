package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassGroupOperationsAsync extends js.Object {
  def AddClassGroup(ClassGroup: IClassGroup): scala.Unit = js.native
  def AddClassGroup(ClassGroup: IClassGroup, successCallback: js.Function1[/* result */ IClassGroup, scala.Unit]): scala.Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroup(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType, ClassGroupID: scala.Double): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroup(ObjectType: scala.Double, ClassGroupID: scala.Double): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: scala.Double,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: scala.Double,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetClassGroup(
    ObjectType: scala.Double,
    ClassGroupID: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroup, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroupIDByGUID(ClassGroupGUID: java.lang.String): scala.Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: java.lang.String,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroups(ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType): scala.Unit = js.native
  def GetClassGroups(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroups(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetClassGroups(
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetClassGroups(ObjectType: scala.Double): scala.Unit = js.native
  def GetClassGroups(ObjectType: scala.Double, successCallback: js.Function1[/* result */ IClassGroups, scala.Unit]): scala.Unit = js.native
  def GetClassGroups(
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetClassGroups(
    ObjectType: scala.Double,
    successCallback: js.Function1[/* result */ IClassGroups, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveClassGroup(ClassGroupID: scala.Double): scala.Unit = js.native
  def RemoveClassGroup(ClassGroupID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup): scala.Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

