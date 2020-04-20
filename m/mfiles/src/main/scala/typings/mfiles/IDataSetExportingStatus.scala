package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSetExportingStatus extends js.Object {
  val CurrentServerTime: ITimestamp
  val IsExporting: Boolean
  val LatestActivity: ITimestamp
}

object IDataSetExportingStatus {
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal(CurrentServerTime = CurrentServerTime.asInstanceOf[js.Any], IsExporting = IsExporting.asInstanceOf[js.Any], LatestActivity = LatestActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
}

