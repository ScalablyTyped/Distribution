package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultSharedLinkOperationsAsync extends StObject {
  
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit]
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
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def DeleteSharedLink(AccessKey: String): Unit = js.native
  def DeleteSharedLink(AccessKey: String, successCallback: js.Function0[Unit]): Unit = js.native
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
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: js.Function0[Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def DeleteSharedLink(
    AccessKey: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def DeleteSharedLink(AccessKey: String, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetSharedLink(AccessKey: String): Unit = js.native
  def GetSharedLink(AccessKey: String, successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit]): Unit = js.native
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
  def GetSharedLink(
    AccessKey: String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLink(
    AccessKey: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLink(AccessKey: String, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
  
  def GetSharedLinks(CreatedByUser: Double): Unit = js.native
  def GetSharedLinks(CreatedByUser: Double, successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit]): Unit = js.native
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
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinks(
    CreatedByUser: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetSharedLinksByObject(ObjID: IObjID): Unit = js.native
  def GetSharedLinksByObject(ObjID: IObjID, successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit]): Unit = js.native
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
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSharedLinksByObject(ObjID: IObjID, successCallback: Unit, errorCallback: Unit, finallyCallback: js.Function0[Unit]): Unit = js.native
}
