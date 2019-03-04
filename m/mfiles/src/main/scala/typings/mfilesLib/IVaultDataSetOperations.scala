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

object IVaultDataSetOperations {
  @scala.inline
  def apply(
    GetDataSetExportingStatus: js.Function1[scala.Double, IDataSetExportingStatus],
    GetDataSets: js.Function0[IDataSets],
    GetReportAccessCredentials: js.Function0[IReportAccessCredentials],
    StartDataSetExport: js.Function1[scala.Double, scala.Unit]
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal(GetDataSetExportingStatus = GetDataSetExportingStatus, GetDataSets = GetDataSets, GetReportAccessCredentials = GetReportAccessCredentials, StartDataSetExport = StartDataSetExport)
  
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
}

