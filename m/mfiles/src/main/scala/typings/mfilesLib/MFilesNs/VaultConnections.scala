package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultConnections")
@js.native
class VaultConnections ()
  extends mfilesLib.IVaultConnections {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, VaultConnection: mfilesLib.IVaultConnection): scala.Unit = js.native
  /* CompleteClass */
  override def GetVaultConnectionByName(VaultConnectionName: java.lang.String): mfilesLib.IVaultConnection = js.native
  /* CompleteClass */
  override def GetVaultConnectionIndexByName(VaultConnectionName: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IVaultConnection = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

