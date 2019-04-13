package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultEventLogOperations")
@js.native
class VaultEventLogOperations ()
  extends mfilesLib.IVaultEventLogOperations {
  /* CompleteClass */
  override def Clear(): scala.Unit = js.native
  /* CompleteClass */
  override def ClearRange(FirstEventID: scala.Double, LastEventID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def ClearRange_32bit(FirstEventID: java.lang.String, LastEventID: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def ExportAll(): java.lang.String = js.native
  /* CompleteClass */
  override def ExportRange(FirstEventID: scala.Double, LastEventID: scala.Double, DeleteEventsAfterExporting: scala.Boolean): java.lang.String = js.native
  /* CompleteClass */
  override def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean
  ): java.lang.String = js.native
  /* CompleteClass */
  override def GetIDRange(): mfilesLib.IIDRange = js.native
  /* CompleteClass */
  override def IsLoggingEnabled(): scala.Boolean = js.native
  /* CompleteClass */
  override def SetLoggingEnabled(Enabled: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.VaultEventLogOperations")
@js.native
object VaultEventLogOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultEventLogOperations]

