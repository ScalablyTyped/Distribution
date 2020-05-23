package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IIDRange
import typings.mfiles.IVaultEventLogOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultEventLogOperations")
@js.native
class VaultEventLogOperations () extends IVaultEventLogOperations {
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def ClearRange(FirstEventID: Double, LastEventID: Double): Unit = js.native
  /* CompleteClass */
  override def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit = js.native
  /* CompleteClass */
  override def ExportAll(): String = js.native
  /* CompleteClass */
  override def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String = js.native
  /* CompleteClass */
  override def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String = js.native
  /* CompleteClass */
  override def GetIDRange(): IIDRange = js.native
  /* CompleteClass */
  override def IsLoggingEnabled(): Boolean = js.native
  /* CompleteClass */
  override def SetLoggingEnabled(Enabled: Boolean): Unit = js.native
}

@JSGlobal("MFiles.VaultEventLogOperations")
@js.native
object VaultEventLogOperations extends Instantiable0[IVaultEventLogOperations]

