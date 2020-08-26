package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSetExportingStatus extends js.Object {
  val CurrentServerTime: ITimestamp = js.native
  val IsExporting: Boolean = js.native
  val LatestActivity: ITimestamp = js.native
}

object IDataSetExportingStatus {
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime.asInstanceOf[js.Any], IsExporting = IsExporting.asInstanceOf[js.Any], LatestActivity = LatestActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
  @scala.inline
  implicit class IDataSetExportingStatusOps[Self <: IDataSetExportingStatus] (val x: Self) extends AnyVal {
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
    def setCurrentServerTime(value: ITimestamp): Self = this.set("CurrentServerTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsExporting(value: Boolean): Self = this.set("IsExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestActivity(value: ITimestamp): Self = this.set("LatestActivity", value.asInstanceOf[js.Any])
  }
  
}

