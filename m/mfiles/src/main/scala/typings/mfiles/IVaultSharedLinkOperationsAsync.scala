package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultSharedLinkOperationsAsync extends js.Object {
  
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DeleteSharedLink(AccessKey: String): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteSharedLink(AccessKey: String, successCallback: js.Function0[Unit]): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetSharedLink(AccessKey: String): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLink(AccessKey: String, successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit]): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetSharedLinks(CreatedByUser: Double): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinks(CreatedByUser: Double, successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit]): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetSharedLinksByObject(ObjID: IObjID): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(ObjID: IObjID, successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit]): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.UndefOr[scala.Nothing],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
