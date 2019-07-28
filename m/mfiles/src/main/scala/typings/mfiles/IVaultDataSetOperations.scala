package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultDataSetOperations extends js.Object {
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus
  def GetDataSets(): IDataSets
  def GetReportAccessCredentials(): IReportAccessCredentials
  def StartDataSetExport(ID: Double): Unit
}

object IVaultDataSetOperations {
  @scala.inline
  def apply(
    GetDataSetExportingStatus: Double => IDataSetExportingStatus,
    GetDataSets: () => IDataSets,
    GetReportAccessCredentials: () => IReportAccessCredentials,
    StartDataSetExport: Double => Unit
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal(GetDataSetExportingStatus = js.Any.fromFunction1(GetDataSetExportingStatus), GetDataSets = js.Any.fromFunction0(GetDataSets), GetReportAccessCredentials = js.Any.fromFunction0(GetReportAccessCredentials), StartDataSetExport = js.Any.fromFunction1(StartDataSetExport))
  
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
}

