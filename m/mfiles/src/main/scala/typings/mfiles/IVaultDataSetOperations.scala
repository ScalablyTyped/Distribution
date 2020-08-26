package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultDataSetOperations extends js.Object {
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus = js.native
  def GetDataSets(): IDataSets = js.native
  def GetReportAccessCredentials(): IReportAccessCredentials = js.native
  def StartDataSetExport(ID: Double): Unit = js.native
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
  @scala.inline
  implicit class IVaultDataSetOperationsOps[Self <: IVaultDataSetOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDataSetExportingStatus(value: Double => IDataSetExportingStatus): Self = this.set("GetDataSetExportingStatus", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDataSets(value: () => IDataSets): Self = this.set("GetDataSets", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReportAccessCredentials(value: () => IReportAccessCredentials): Self = this.set("GetReportAccessCredentials", js.Any.fromFunction0(value))
    @scala.inline
    def setStartDataSetExport(value: Double => Unit): Self = this.set("StartDataSetExport", js.Any.fromFunction1(value))
  }
  
}

