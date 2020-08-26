package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentName extends js.Object {
  var componentName: js.UndefOr[String] = js.native
  var labelAndValue: js.UndefOr[String] = js.native
  var labelClearSelection: js.UndefOr[String] = js.native
  var labelClose: js.UndefOr[String] = js.native
  var labelCountWithTotal: js.UndefOr[String] = js.native
  var labelDataVisualization: js.UndefOr[String] = js.native
  var labelDate: js.UndefOr[String] = js.native
  var labelDefaultGroupName: js.UndefOr[String] = js.native
  var labelGroup: js.UndefOr[String] = js.native
  var labelHigh: js.UndefOr[String] = js.native
  var labelInvalidData: js.UndefOr[String] = js.native
  var labelLow: js.UndefOr[String] = js.native
  var labelNoData: js.UndefOr[String] = js.native
  var labelOpen: js.UndefOr[String] = js.native
  var labelOther: js.UndefOr[String] = js.native
  var labelPercentage: js.UndefOr[String] = js.native
  var labelQ1: js.UndefOr[String] = js.native
  var labelQ2: js.UndefOr[String] = js.native
  var labelQ3: js.UndefOr[String] = js.native
  var labelSeries: js.UndefOr[String] = js.native
  var labelTargetValue: js.UndefOr[String] = js.native
  var labelValue: js.UndefOr[String] = js.native
  var labelVolume: js.UndefOr[String] = js.native
  var labelX: js.UndefOr[String] = js.native
  var labelY: js.UndefOr[String] = js.native
  var labelZ: js.UndefOr[String] = js.native
  var stateCollapsed: js.UndefOr[String] = js.native
  var stateDrillable: js.UndefOr[String] = js.native
  var stateExpanded: js.UndefOr[String] = js.native
  var stateHidden: js.UndefOr[String] = js.native
  var stateIsolated: js.UndefOr[String] = js.native
  var stateMaximized: js.UndefOr[String] = js.native
  var stateMinimized: js.UndefOr[String] = js.native
  var stateSelected: js.UndefOr[String] = js.native
  var stateUnselected: js.UndefOr[String] = js.native
  var stateVisible: js.UndefOr[String] = js.native
  var tooltipPan: js.UndefOr[String] = js.native
  var tooltipSelect: js.UndefOr[String] = js.native
  var tooltipZoom: js.UndefOr[String] = js.native
}

object ComponentName {
  @scala.inline
  def apply(): ComponentName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentName]
  }
  @scala.inline
  implicit class ComponentNameOps[Self <: ComponentName] (val x: Self) extends AnyVal {
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
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentName: Self = this.set("componentName", js.undefined)
    @scala.inline
    def setLabelAndValue(value: String): Self = this.set("labelAndValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAndValue: Self = this.set("labelAndValue", js.undefined)
    @scala.inline
    def setLabelClearSelection(value: String): Self = this.set("labelClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClearSelection: Self = this.set("labelClearSelection", js.undefined)
    @scala.inline
    def setLabelClose(value: String): Self = this.set("labelClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClose: Self = this.set("labelClose", js.undefined)
    @scala.inline
    def setLabelCountWithTotal(value: String): Self = this.set("labelCountWithTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCountWithTotal: Self = this.set("labelCountWithTotal", js.undefined)
    @scala.inline
    def setLabelDataVisualization(value: String): Self = this.set("labelDataVisualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDataVisualization: Self = this.set("labelDataVisualization", js.undefined)
    @scala.inline
    def setLabelDate(value: String): Self = this.set("labelDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDate: Self = this.set("labelDate", js.undefined)
    @scala.inline
    def setLabelDefaultGroupName(value: String): Self = this.set("labelDefaultGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDefaultGroupName: Self = this.set("labelDefaultGroupName", js.undefined)
    @scala.inline
    def setLabelGroup(value: String): Self = this.set("labelGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelGroup: Self = this.set("labelGroup", js.undefined)
    @scala.inline
    def setLabelHigh(value: String): Self = this.set("labelHigh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelHigh: Self = this.set("labelHigh", js.undefined)
    @scala.inline
    def setLabelInvalidData(value: String): Self = this.set("labelInvalidData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInvalidData: Self = this.set("labelInvalidData", js.undefined)
    @scala.inline
    def setLabelLow(value: String): Self = this.set("labelLow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelLow: Self = this.set("labelLow", js.undefined)
    @scala.inline
    def setLabelNoData(value: String): Self = this.set("labelNoData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelNoData: Self = this.set("labelNoData", js.undefined)
    @scala.inline
    def setLabelOpen(value: String): Self = this.set("labelOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOpen: Self = this.set("labelOpen", js.undefined)
    @scala.inline
    def setLabelOther(value: String): Self = this.set("labelOther", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOther: Self = this.set("labelOther", js.undefined)
    @scala.inline
    def setLabelPercentage(value: String): Self = this.set("labelPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPercentage: Self = this.set("labelPercentage", js.undefined)
    @scala.inline
    def setLabelQ1(value: String): Self = this.set("labelQ1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelQ1: Self = this.set("labelQ1", js.undefined)
    @scala.inline
    def setLabelQ2(value: String): Self = this.set("labelQ2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelQ2: Self = this.set("labelQ2", js.undefined)
    @scala.inline
    def setLabelQ3(value: String): Self = this.set("labelQ3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelQ3: Self = this.set("labelQ3", js.undefined)
    @scala.inline
    def setLabelSeries(value: String): Self = this.set("labelSeries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSeries: Self = this.set("labelSeries", js.undefined)
    @scala.inline
    def setLabelTargetValue(value: String): Self = this.set("labelTargetValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelTargetValue: Self = this.set("labelTargetValue", js.undefined)
    @scala.inline
    def setLabelValue(value: String): Self = this.set("labelValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelValue: Self = this.set("labelValue", js.undefined)
    @scala.inline
    def setLabelVolume(value: String): Self = this.set("labelVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelVolume: Self = this.set("labelVolume", js.undefined)
    @scala.inline
    def setLabelX(value: String): Self = this.set("labelX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelX: Self = this.set("labelX", js.undefined)
    @scala.inline
    def setLabelY(value: String): Self = this.set("labelY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelY: Self = this.set("labelY", js.undefined)
    @scala.inline
    def setLabelZ(value: String): Self = this.set("labelZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelZ: Self = this.set("labelZ", js.undefined)
    @scala.inline
    def setStateCollapsed(value: String): Self = this.set("stateCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateCollapsed: Self = this.set("stateCollapsed", js.undefined)
    @scala.inline
    def setStateDrillable(value: String): Self = this.set("stateDrillable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateDrillable: Self = this.set("stateDrillable", js.undefined)
    @scala.inline
    def setStateExpanded(value: String): Self = this.set("stateExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateExpanded: Self = this.set("stateExpanded", js.undefined)
    @scala.inline
    def setStateHidden(value: String): Self = this.set("stateHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateHidden: Self = this.set("stateHidden", js.undefined)
    @scala.inline
    def setStateIsolated(value: String): Self = this.set("stateIsolated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateIsolated: Self = this.set("stateIsolated", js.undefined)
    @scala.inline
    def setStateMaximized(value: String): Self = this.set("stateMaximized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMaximized: Self = this.set("stateMaximized", js.undefined)
    @scala.inline
    def setStateMinimized(value: String): Self = this.set("stateMinimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateMinimized: Self = this.set("stateMinimized", js.undefined)
    @scala.inline
    def setStateSelected(value: String): Self = this.set("stateSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateSelected: Self = this.set("stateSelected", js.undefined)
    @scala.inline
    def setStateUnselected(value: String): Self = this.set("stateUnselected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateUnselected: Self = this.set("stateUnselected", js.undefined)
    @scala.inline
    def setStateVisible(value: String): Self = this.set("stateVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateVisible: Self = this.set("stateVisible", js.undefined)
    @scala.inline
    def setTooltipPan(value: String): Self = this.set("tooltipPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipPan: Self = this.set("tooltipPan", js.undefined)
    @scala.inline
    def setTooltipSelect(value: String): Self = this.set("tooltipSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipSelect: Self = this.set("tooltipSelect", js.undefined)
    @scala.inline
    def setTooltipZoom(value: String): Self = this.set("tooltipZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipZoom: Self = this.set("tooltipZoom", js.undefined)
  }
  
}

