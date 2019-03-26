package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultsOnServer")
@js.native
class VaultsOnServer ()
  extends mfilesLib.IVaultsOnServer {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def GetVaultByGUID(GUID: java.lang.String): mfilesLib.IVaultOnServer = js.native
  /* CompleteClass */
  override def GetVaultByName(Name: java.lang.String): mfilesLib.IVaultOnServer = js.native
  /* CompleteClass */
  override def GetVaultIndexByGUID(GUID: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def GetVaultIndexByName(Name: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IVaultOnServer = js.native
}

