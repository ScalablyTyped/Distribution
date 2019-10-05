package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IVaultConnection
import typings.mfiles.IVaultConnections
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultConnections")
@js.native
class VaultConnections () extends IVaultConnections {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, VaultConnection: IVaultConnection): Unit = js.native
  /* CompleteClass */
  override def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection = js.native
  /* CompleteClass */
  override def GetVaultConnectionIndexByName(VaultConnectionName: String): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IVaultConnection = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.VaultConnections")
@js.native
object VaultConnections extends Instantiable0[IVaultConnections]

