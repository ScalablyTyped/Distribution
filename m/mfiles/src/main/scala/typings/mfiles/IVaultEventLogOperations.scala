package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEventLogOperations extends js.Object {
  def Clear(): Unit
  def ClearRange(FirstEventID: Double, LastEventID: Double): Unit
  def ClearRange_32bit(FirstEventID: String, LastEventID: String): Unit
  def ExportAll(): String
  def ExportRange(FirstEventID: Double, LastEventID: Double, DeleteEventsAfterExporting: Boolean): String
  def ExportRange_32bit(FirstEventID: String, LastEventID: String, DeleteEventsAfterExporting: Boolean): String
  def GetIDRange(): IIDRange
  def IsLoggingEnabled(): Boolean
  def SetLoggingEnabled(Enabled: Boolean): Unit
}

object IVaultEventLogOperations {
  @scala.inline
  def apply(
    Clear: () => Unit,
    ClearRange: (Double, Double) => Unit,
    ClearRange_32bit: (String, String) => Unit,
    ExportAll: () => String,
    ExportRange: (Double, Double, Boolean) => String,
    ExportRange_32bit: (String, String, Boolean) => String,
    GetIDRange: () => IIDRange,
    IsLoggingEnabled: () => Boolean,
    SetLoggingEnabled: Boolean => Unit
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ClearRange = js.Any.fromFunction2(ClearRange), ClearRange_32bit = js.Any.fromFunction2(ClearRange_32bit), ExportAll = js.Any.fromFunction0(ExportAll), ExportRange = js.Any.fromFunction3(ExportRange), ExportRange_32bit = js.Any.fromFunction3(ExportRange_32bit), GetIDRange = js.Any.fromFunction0(GetIDRange), IsLoggingEnabled = js.Any.fromFunction0(IsLoggingEnabled), SetLoggingEnabled = js.Any.fromFunction1(SetLoggingEnabled))
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
}

