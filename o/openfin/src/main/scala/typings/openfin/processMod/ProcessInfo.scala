package typings.openfin.processMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessInfo extends js.Object {
  var cpuUsage: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nonPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var pageFaultCount: js.UndefOr[Double] = js.undefined
  var pagedPoolUsage: js.UndefOr[Double] = js.undefined
  var pagefileUsage: js.UndefOr[Double] = js.undefined
  var peakNonPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var peakPagedPoolUsage: js.UndefOr[Double] = js.undefined
  var peakPagefileUsage: js.UndefOr[Double] = js.undefined
  var peakWorkingSetSize: js.UndefOr[Double] = js.undefined
  var processId: js.UndefOr[Double] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
  var workingSetSize: js.UndefOr[Double] = js.undefined
}

object ProcessInfo {
  @scala.inline
  def apply(
    cpuUsage: js.UndefOr[Double] = js.undefined,
    name: String = null,
    nonPagedPoolUsage: js.UndefOr[Double] = js.undefined,
    pageFaultCount: js.UndefOr[Double] = js.undefined,
    pagedPoolUsage: js.UndefOr[Double] = js.undefined,
    pagefileUsage: js.UndefOr[Double] = js.undefined,
    peakNonPagedPoolUsage: js.UndefOr[Double] = js.undefined,
    peakPagedPoolUsage: js.UndefOr[Double] = js.undefined,
    peakPagefileUsage: js.UndefOr[Double] = js.undefined,
    peakWorkingSetSize: js.UndefOr[Double] = js.undefined,
    processId: js.UndefOr[Double] = js.undefined,
    uuid: String = null,
    workingSetSize: js.UndefOr[Double] = js.undefined
  ): ProcessInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cpuUsage)) __obj.updateDynamic("cpuUsage")(cpuUsage.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPagedPoolUsage)) __obj.updateDynamic("nonPagedPoolUsage")(nonPagedPoolUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageFaultCount)) __obj.updateDynamic("pageFaultCount")(pageFaultCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagedPoolUsage)) __obj.updateDynamic("pagedPoolUsage")(pagedPoolUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pagefileUsage)) __obj.updateDynamic("pagefileUsage")(pagefileUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakNonPagedPoolUsage)) __obj.updateDynamic("peakNonPagedPoolUsage")(peakNonPagedPoolUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakPagedPoolUsage)) __obj.updateDynamic("peakPagedPoolUsage")(peakPagedPoolUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakPagefileUsage)) __obj.updateDynamic("peakPagefileUsage")(peakPagefileUsage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peakWorkingSetSize)) __obj.updateDynamic("peakWorkingSetSize")(peakWorkingSetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processId)) __obj.updateDynamic("processId")(processId.get.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(workingSetSize)) __obj.updateDynamic("workingSetSize")(workingSetSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessInfo]
  }
}

