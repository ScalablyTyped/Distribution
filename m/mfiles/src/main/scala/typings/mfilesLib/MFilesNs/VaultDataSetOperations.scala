package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultDataSetOperations")
@js.native
class VaultDataSetOperations ()
  extends mfilesLib.IVaultDataSetOperations {
  /* CompleteClass */
  override def GetDataSetExportingStatus(ID: scala.Double): mfilesLib.IDataSetExportingStatus = js.native
  /* CompleteClass */
  override def GetDataSets(): mfilesLib.IDataSets = js.native
  /* CompleteClass */
  override def GetReportAccessCredentials(): mfilesLib.IReportAccessCredentials = js.native
  /* CompleteClass */
  override def StartDataSetExport(ID: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.VaultDataSetOperations")
@js.native
object VaultDataSetOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultDataSetOperations]

