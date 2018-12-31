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

