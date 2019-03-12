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
    CreateSharedLink: ISharedLinkInfo => ISharedLinkInfo,
    DeleteSharedLink: java.lang.String => scala.Unit,
    GetSharedLink: java.lang.String => ISharedLinkInfo,
    GetSharedLinks: scala.Double => ISharedLinkInfos,
    GetSharedLinksByObject: IObjID => ISharedLinkInfos
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal(CreateSharedLink = js.Any.fromFunction1(CreateSharedLink), DeleteSharedLink = js.Any.fromFunction1(DeleteSharedLink), GetSharedLink = js.Any.fromFunction1(GetSharedLink), GetSharedLinks = js.Any.fromFunction1(GetSharedLinks), GetSharedLinksByObject = js.Any.fromFunction1(GetSharedLinksByObject))
  
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
}

