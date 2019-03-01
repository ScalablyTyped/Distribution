package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataSetExportingStatus extends js.Object {
  val CurrentServerTime: ITimestamp
  val IsExporting: scala.Boolean
  val LatestActivity: ITimestamp
}

object IDataSetExportingStatus {
  @scala.inline
  def apply(CurrentServerTime: ITimestamp, IsExporting: scala.Boolean, LatestActivity: ITimestamp): IDataSetExportingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentServerTime")(CurrentServerTime)
    __obj.updateDynamic("IsExporting")(IsExporting)
    __obj.updateDynamic("LatestActivity")(LatestActivity)
    __obj.asInstanceOf[IDataSetExportingStatus]
  }
}

