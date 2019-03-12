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
    Clear: () => scala.Unit,
    ClearRange: (scala.Double, scala.Double) => scala.Unit,
    ClearRange_32bit: (java.lang.String, java.lang.String) => scala.Unit,
    ExportAll: () => java.lang.String,
    ExportRange: (scala.Double, scala.Double, scala.Boolean) => java.lang.String,
    ExportRange_32bit: (java.lang.String, java.lang.String, scala.Boolean) => java.lang.String,
    GetIDRange: () => IIDRange,
    IsLoggingEnabled: () => scala.Boolean,
    SetLoggingEnabled: scala.Boolean => scala.Unit
  ): IVaultEventLogOperations = {
    val __obj = js.Dynamic.literal(Clear = js.Any.fromFunction0(Clear), ClearRange = js.Any.fromFunction2(ClearRange), ClearRange_32bit = js.Any.fromFunction2(ClearRange_32bit), ExportAll = js.Any.fromFunction0(ExportAll), ExportRange = js.Any.fromFunction3(ExportRange), ExportRange_32bit = js.Any.fromFunction3(ExportRange_32bit), GetIDRange = js.Any.fromFunction0(GetIDRange), IsLoggingEnabled = js.Any.fromFunction0(IsLoggingEnabled), SetLoggingEnabled = js.Any.fromFunction1(SetLoggingEnabled))
  
    __obj.asInstanceOf[IVaultEventLogOperations]
  }
}

