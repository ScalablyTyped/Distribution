package typings.mfiles

import typings.mfiles.MFiles.MFBuiltInObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultClassGroupOperationsAsync extends js.Object {
  def AddClassGroup(ClassGroup: IClassGroup): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddClassGroup(ClassGroup: IClassGroup, successCallback: js.Function1[/* result */ IClassGroup, Unit]): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(ObjectType: Double, ClassGroupID: Double): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: Double,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(ObjectType: MFBuiltInObjectType, ClassGroupID: Double): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroup(
    ObjectType: MFBuiltInObjectType,
    ClassGroupID: Double,
    successCallback: js.Function1[/* result */ IClassGroup, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(ClassGroupGUID: String): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(ClassGroupGUID: String, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroupIDByGUID(
    ClassGroupGUID: String,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(ObjectType: Double): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(ObjectType: Double, successCallback: js.Function1[/* result */ IClassGroups, Unit]): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: Double,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(ObjectType: MFBuiltInObjectType): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(ObjectType: MFBuiltInObjectType, successCallback: js.Function1[/* result */ IClassGroups, Unit]): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetClassGroups(
    ObjectType: MFBuiltInObjectType,
    successCallback: js.Function1[/* result */ IClassGroups, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveClassGroup(ClassGroupID: Double): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveClassGroup(ClassGroupID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveClassGroup(
    ClassGroupID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateClassGroup(ClassGroup: IClassGroup, successCallback: js.Function0[Unit]): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def UpdateClassGroup(
    ClassGroup: IClassGroup,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

