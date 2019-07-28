package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IVaultOnServer
import typings.mfiles.IVaultsOnServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultsOnServer")
@js.native
class VaultsOnServer () extends IVaultsOnServer {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def GetVaultByGUID(GUID: String): IVaultOnServer = js.native
  /* CompleteClass */
  override def GetVaultByName(Name: String): IVaultOnServer = js.native
  /* CompleteClass */
  override def GetVaultIndexByGUID(GUID: String): Double = js.native
  /* CompleteClass */
  override def GetVaultIndexByName(Name: String): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IVaultOnServer = js.native
}

@JSGlobal("MFiles.VaultsOnServer")
@js.native
object VaultsOnServer extends Instantiable0[IVaultsOnServer]

