package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultDataSetOperations extends js.Object {
  def GetDataSetExportingStatus(ID: scala.Double): IDataSetExportingStatus
  def GetDataSets(): IDataSets
  def GetReportAccessCredentials(): IReportAccessCredentials
  def StartDataSetExport(ID: scala.Double): scala.Unit
}

