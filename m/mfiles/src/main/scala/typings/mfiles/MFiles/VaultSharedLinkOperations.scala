package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IObjID
import typings.mfiles.ISharedLinkInfo
import typings.mfiles.ISharedLinkInfos
import typings.mfiles.IVaultSharedLinkOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultSharedLinkOperations")
@js.native
class VaultSharedLinkOperations () extends IVaultSharedLinkOperations {
  /* CompleteClass */
  override def CreateSharedLink(SharedLinkCreationInfo: ISharedLinkInfo): ISharedLinkInfo = js.native
  /* CompleteClass */
  override def DeleteSharedLink(AccessKey: String): Unit = js.native
  /* CompleteClass */
  override def GetSharedLink(AccessKey: String): ISharedLinkInfo = js.native
  /* CompleteClass */
  override def GetSharedLinks(CreatedByUser: Double): ISharedLinkInfos = js.native
  /* CompleteClass */
  override def GetSharedLinksByObject(ObjID: IObjID): ISharedLinkInfos = js.native
}

@JSGlobal("MFiles.VaultSharedLinkOperations")
@js.native
object VaultSharedLinkOperations extends Instantiable0[IVaultSharedLinkOperations]

