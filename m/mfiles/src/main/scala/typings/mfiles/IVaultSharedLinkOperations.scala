package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultSharedLinkOperations extends js.Object {
  def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo
  def DeleteSharedLink(AccessKey: String): Unit
  def GetSharedLink(AccessKey: String): ISharedLinkInfo
  def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos
  def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos
}

object IVaultSharedLinkOperations {
  @scala.inline
  def apply(
    CreateSharedLink: ISharedLinkInfo => ISharedLinkInfo,
    DeleteSharedLink: String => Unit,
    GetSharedLink: String => ISharedLinkInfo,
    GetSharedLinks: Double => ISharedLinkInfos,
    GetSharedLinksByObject: IObjID => ISharedLinkInfos
  ): IVaultSharedLinkOperations = {
    val __obj = js.Dynamic.literal(CreateSharedLink = js.Any.fromFunction1(CreateSharedLink), DeleteSharedLink = js.Any.fromFunction1(DeleteSharedLink), GetSharedLink = js.Any.fromFunction1(GetSharedLink), GetSharedLinks = js.Any.fromFunction1(GetSharedLinks), GetSharedLinksByObject = js.Any.fromFunction1(GetSharedLinksByObject))
  
    __obj.asInstanceOf[IVaultSharedLinkOperations]
  }
}

