package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultEventLogOperations extends js.Object {
  def Clear(): scala.Unit
  def ClearRange(FirstEventID: scala.Double, LastEventID: scala.Double): scala.Unit
  def ClearRange_32bit(FirstEventID: java.lang.String, LastEventID: java.lang.String): scala.Unit
  def ExportAll(): java.lang.String
  def ExportRange(FirstEventID: scala.Double, LastEventID: scala.Double, DeleteEventsAfterExporting: scala.Boolean): java.lang.String
  def ExportRange_32bit(
    FirstEventID: java.lang.String,
    LastEventID: java.lang.String,
    DeleteEventsAfterExporting: scala.Boolean
  ): java.lang.String
  def GetIDRange(): IIDRange
  def IsLoggingEnabled(): scala.Boolean
  def SetLoggingEnabled(Enabled: scala.Boolean): scala.Unit
}

object IVaultEventLogOperations {
  @scala.inline
  def apply(
    Clear: js.Function0[scala.Unit],
    ClearRange: js.Function2[scala.Double, scala.Double, scala.Unit],
    ClearRange_32bit: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    ExportAll: js.Function0[java.lang.String],
    ExportRange: js.Function3[scala.Double, scala.Double, scala.Boolean, java.lang.String],
    ExportRange_32bit: js.Function3[java.lang.String, java.lang.String, scala.Boolean, java.lang.String],
    GetIDRange: js.Function0[IIDRange],
    IsLoggingEnabled: js.Function0[scala.Boolean],
    SetLoggingEnabled: js.Function1[scala.Boolean, scala.Unit]
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal(Clear = Clear, ClearRange = ClearRange, ClearRange_32bit = ClearRange_32bit, ExportAll = ExportAll, ExportRange = ExportRange, ExportRange_32bit = ExportRange_32bit, GetIDRange = GetIDRange, IsLoggingEnabled = IsLoggingEnabled, SetLoggingEnabled = SetLoggingEnabled)
  
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
}

