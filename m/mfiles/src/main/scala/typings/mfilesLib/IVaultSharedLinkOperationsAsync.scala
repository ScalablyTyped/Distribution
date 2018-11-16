package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultSharedLinkOperationsAsync extends js.Object {
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): scala.Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit]
  ): scala.Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CreateSharedLink(
    SharedLinkCreationInfo: ISharedLinkInfo,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def DeleteSharedLink(AccessKey: java.lang.String): scala.Unit = js.native
  def DeleteSharedLink(AccessKey: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def DeleteSharedLink(
    AccessKey: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def DeleteSharedLink(
    AccessKey: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetSharedLink(AccessKey: java.lang.String): scala.Unit = js.native
  def GetSharedLink(
    AccessKey: java.lang.String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit]
  ): scala.Unit = js.native
  def GetSharedLink(
    AccessKey: java.lang.String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetSharedLink(
    AccessKey: java.lang.String,
    successCallback: js.Function1[/* result */ ISharedLinkInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetSharedLinks(CreatedByUser: scala.Double): scala.Unit = js.native
  def GetSharedLinks(
    CreatedByUser: scala.Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit]
  ): scala.Unit = js.native
  def GetSharedLinks(
    CreatedByUser: scala.Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetSharedLinks(
    CreatedByUser: scala.Double,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetSharedLinksByObject(ObjID: IObjID): scala.Unit = js.native
  def GetSharedLinksByObject(ObjID: IObjID, successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit]): scala.Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetSharedLinksByObject(
    ObjID: IObjID,
    successCallback: js.Function1[/* result */ ISharedLinkInfos, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

