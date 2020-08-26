package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightedCount extends js.Object {
  var componentName: js.UndefOr[String] = js.native
  var highlightedCount: js.UndefOr[String] = js.native
  var labelAdditionalData: js.UndefOr[String] = js.native
  var labelAndValue: js.UndefOr[String] = js.native
  var labelClearSelection: js.UndefOr[String] = js.native
  var labelCountWithTotal: js.UndefOr[String] = js.native
  var labelDataVisualization: js.UndefOr[String] = js.native
  var labelGroup: js.UndefOr[String] = js.native
  var labelInvalidData: js.UndefOr[String] = js.native
  var labelNoData: js.UndefOr[String] = js.native
  var labelOther: js.UndefOr[String] = js.native
  var labelSize: js.UndefOr[String] = js.native
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
}

object HighlightedCount {
  @scala.inline
  def apply(): HighlightedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightedCount]
  }
  @scala.inline
  implicit class HighlightedCountOps[Self <: HighlightedCount] (val x: Self) extends AnyVal {
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
    def setHighlightedCount(value: String): Self = this.set("highlightedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedCount: Self = this.set("highlightedCount", js.undefined)
    @scala.inline
    def setLabelAdditionalData(value: String): Self = this.set("labelAdditionalData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAdditionalData: Self = this.set("labelAdditionalData", js.undefined)
    @scala.inline
    def setLabelAndValue(value: String): Self = this.set("labelAndValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelAndValue: Self = this.set("labelAndValue", js.undefined)
    @scala.inline
    def setLabelClearSelection(value: String): Self = this.set("labelClearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelClearSelection: Self = this.set("labelClearSelection", js.undefined)
    @scala.inline
    def setLabelCountWithTotal(value: String): Self = this.set("labelCountWithTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelCountWithTotal: Self = this.set("labelCountWithTotal", js.undefined)
    @scala.inline
    def setLabelDataVisualization(value: String): Self = this.set("labelDataVisualization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDataVisualization: Self = this.set("labelDataVisualization", js.undefined)
    @scala.inline
    def setLabelGroup(value: String): Self = this.set("labelGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelGroup: Self = this.set("labelGroup", js.undefined)
    @scala.inline
    def setLabelInvalidData(value: String): Self = this.set("labelInvalidData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelInvalidData: Self = this.set("labelInvalidData", js.undefined)
    @scala.inline
    def setLabelNoData(value: String): Self = this.set("labelNoData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelNoData: Self = this.set("labelNoData", js.undefined)
    @scala.inline
    def setLabelOther(value: String): Self = this.set("labelOther", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelOther: Self = this.set("labelOther", js.undefined)
    @scala.inline
    def setLabelSize(value: String): Self = this.set("labelSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelSize: Self = this.set("labelSize", js.undefined)
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
  }
  
}

