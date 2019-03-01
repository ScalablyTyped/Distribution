package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultSharedLinkOperations extends js.Object {
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo
  def DeleteSharedLink(AccessKey: java.lang.String): scala.Unit
  def GetSharedLink(AccessKey: java.lang.String): ISharedLinkInfo
  def GetSharedLinks(CreatedByUser: scala.Double): ISharedLinkInfos
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos
}

object IVaultSharedLinkOperations {
  @scala.inline
  def apply(
    CreateSharedLink: js.Function1[ISharedLinkInfo, ISharedLinkInfo],
    DeleteSharedLink: js.Function1[java.lang.String, scala.Unit],
    GetSharedLink: js.Function1[java.lang.String, ISharedLinkInfo],
    GetSharedLinks: js.Function1[scala.Double, ISharedLinkInfos],
    GetSharedLinksByObject: js.Function1[IObjID, ISharedLinkInfos]
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CreateSharedLink")(CreateSharedLink)
    __obj.updateDynamic("DeleteSharedLink")(DeleteSharedLink)
    __obj.updateDynamic("GetSharedLink")(GetSharedLink)
    __obj.updateDynamic("GetSharedLinks")(GetSharedLinks)
    __obj.updateDynamic("GetSharedLinksByObject")(GetSharedLinksByObject)
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
}

