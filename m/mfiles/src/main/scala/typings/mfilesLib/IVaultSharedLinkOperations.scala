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

