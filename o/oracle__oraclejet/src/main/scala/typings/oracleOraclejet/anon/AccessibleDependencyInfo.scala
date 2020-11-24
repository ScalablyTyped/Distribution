package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibleDependencyInfo extends js.Object {
  
  var accessibleDependencyInfo: js.UndefOr[String] = js.native
  
  var accessiblePredecessorInfo: js.UndefOr[String] = js.native
  
  var accessibleSuccessorInfo: js.UndefOr[String] = js.native
  
  var accessibleTaskTypeMilestone: js.UndefOr[String] = js.native
  
  var accessibleTaskTypeSummary: js.UndefOr[String] = js.native
  
  var componentName: js.UndefOr[String] = js.native
  
  var finishFinishDependencyAriaDesc: js.UndefOr[String] = js.native
  
  var finishStartDependencyAriaDesc: js.UndefOr[String] = js.native
  
  var labelAndValue: js.UndefOr[String] = js.native
  
  var labelBaselineDate: js.UndefOr[String] = js.native
  
  var labelBaselineEnd: js.UndefOr[String] = js.native
  
  var labelBaselineStart: js.UndefOr[String] = js.native
  
  var labelClearSelection: js.UndefOr[String] = js.native
  
  var labelCountWithTotal: js.UndefOr[String] = js.native
  
  var labelDataVisualization: js.UndefOr[String] = js.native
  
  var labelDate: js.UndefOr[String] = js.native
  
  var labelEnd: js.UndefOr[String] = js.native
  
  var labelInvalidData: js.UndefOr[String] = js.native
  
  var labelLabel: js.UndefOr[String] = js.native
  
  var labelMoveBy: js.UndefOr[String] = js.native
  
  var labelNoData: js.UndefOr[String] = js.native
  
  var labelProgress: js.UndefOr[String] = js.native
  
  var labelRow: js.UndefOr[String] = js.native
  
  var labelStart: js.UndefOr[String] = js.native
  
  var startFinishDependencyAriaDesc: js.UndefOr[String] = js.native
  
  var startStartDependencyAriaDesc: js.UndefOr[String] = js.native
  
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
  
  var taskMoveCancelled: js.UndefOr[String] = js.native
  
  var taskMoveFinalized: js.UndefOr[String] = js.native
  
  var taskMoveInitiated: js.UndefOr[String] = js.native
  
  var taskMoveInitiatedInstruction: js.UndefOr[String] = js.native
  
  var taskMoveSelectionInfo: js.UndefOr[String] = js.native
  
  var tooltipZoomIn: js.UndefOr[String] = js.native
  
  var tooltipZoomOut: js.UndefOr[String] = js.native
}
object AccessibleDependencyInfo {
  
  @scala.inline
  def apply(): AccessibleDependencyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibleDependencyInfo]
  }
  
  @scala.inline
  implicit class AccessibleDependencyInfoOps[Self <: AccessibleDependencyInfo] (val x: Self) extends AnyVal {
    
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
    def setAccessibleDependencyInfo(value: String): Self = this.set("accessibleDependencyInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleDependencyInfo: Self = this.set("accessibleDependencyInfo", js.undefined)
    
    @scala.inline
    def setAccessiblePredecessorInfo(value: String): Self = this.set("accessiblePredecessorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessiblePredecessorInfo: Self = this.set("accessiblePredecessorInfo", js.undefined)
    
    @scala.inline
    def setAccessibleSuccessorInfo(value: String): Self = this.set("accessibleSuccessorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleSuccessorInfo: Self = this.set("accessibleSuccessorInfo", js.undefined)
    
    @scala.inline
    def setAccessibleTaskTypeMilestone(value: String): Self = this.set("accessibleTaskTypeMilestone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleTaskTypeMilestone: Self = this.set("accessibleTaskTypeMilestone", js.undefined)
    
    @scala.inline
    def setAccessibleTaskTypeSummary(value: String): Self = this.set("accessibleTaskTypeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleTaskTypeSummary: Self = this.set("accessibleTaskTypeSummary", js.undefined)
    
    @scala.inline
    def setComponentName(value: String): Self = this.set("componentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentName: Self = this.set("componentName", js.undefined)
    
    @scala.inline
    def setFinishFinishDependencyAriaDesc(value: String): Self = this.set("finishFinishDependencyAriaDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishFinishDependencyAriaDesc: Self = this.set("finishFinishDependencyAriaDesc", js.undefined)
    
    @scala.inline
    def setFinishStartDependencyAriaDesc(value: String): Self = this.set("finishStartDependencyAriaDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishStartDependencyAriaDesc: Self = this.set("finishStartDependencyAriaDesc", js.undefined)
    
    @scala.inline
    def setLabelAndValue(value: String): Self = this.set("labelAndValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelAndValue: Self = this.set("labelAndValue", js.undefined)
    
    @scala.inline
    def setLabelBaselineDate(value: String): Self = this.set("labelBaselineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaselineDate: Self = this.set("labelBaselineDate", js.undefined)
    
    @scala.inline
    def setLabelBaselineEnd(value: String): Self = this.set("labelBaselineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaselineEnd: Self = this.set("labelBaselineEnd", js.undefined)
    
    @scala.inline
    def setLabelBaselineStart(value: String): Self = this.set("labelBaselineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelBaselineStart: Self = this.set("labelBaselineStart", js.undefined)
    
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
    def setLabelDate(value: String): Self = this.set("labelDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDate: Self = this.set("labelDate", js.undefined)
    
    @scala.inline
    def setLabelEnd(value: String): Self = this.set("labelEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelEnd: Self = this.set("labelEnd", js.undefined)
    
    @scala.inline
    def setLabelInvalidData(value: String): Self = this.set("labelInvalidData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInvalidData: Self = this.set("labelInvalidData", js.undefined)
    
    @scala.inline
    def setLabelLabel(value: String): Self = this.set("labelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelLabel: Self = this.set("labelLabel", js.undefined)
    
    @scala.inline
    def setLabelMoveBy(value: String): Self = this.set("labelMoveBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelMoveBy: Self = this.set("labelMoveBy", js.undefined)
    
    @scala.inline
    def setLabelNoData(value: String): Self = this.set("labelNoData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelNoData: Self = this.set("labelNoData", js.undefined)
    
    @scala.inline
    def setLabelProgress(value: String): Self = this.set("labelProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelProgress: Self = this.set("labelProgress", js.undefined)
    
    @scala.inline
    def setLabelRow(value: String): Self = this.set("labelRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelRow: Self = this.set("labelRow", js.undefined)
    
    @scala.inline
    def setLabelStart(value: String): Self = this.set("labelStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStart: Self = this.set("labelStart", js.undefined)
    
    @scala.inline
    def setStartFinishDependencyAriaDesc(value: String): Self = this.set("startFinishDependencyAriaDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFinishDependencyAriaDesc: Self = this.set("startFinishDependencyAriaDesc", js.undefined)
    
    @scala.inline
    def setStartStartDependencyAriaDesc(value: String): Self = this.set("startStartDependencyAriaDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartStartDependencyAriaDesc: Self = this.set("startStartDependencyAriaDesc", js.undefined)
    
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
    def setTaskMoveCancelled(value: String): Self = this.set("taskMoveCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskMoveCancelled: Self = this.set("taskMoveCancelled", js.undefined)
    
    @scala.inline
    def setTaskMoveFinalized(value: String): Self = this.set("taskMoveFinalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskMoveFinalized: Self = this.set("taskMoveFinalized", js.undefined)
    
    @scala.inline
    def setTaskMoveInitiated(value: String): Self = this.set("taskMoveInitiated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskMoveInitiated: Self = this.set("taskMoveInitiated", js.undefined)
    
    @scala.inline
    def setTaskMoveInitiatedInstruction(value: String): Self = this.set("taskMoveInitiatedInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskMoveInitiatedInstruction: Self = this.set("taskMoveInitiatedInstruction", js.undefined)
    
    @scala.inline
    def setTaskMoveSelectionInfo(value: String): Self = this.set("taskMoveSelectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskMoveSelectionInfo: Self = this.set("taskMoveSelectionInfo", js.undefined)
    
    @scala.inline
    def setTooltipZoomIn(value: String): Self = this.set("tooltipZoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipZoomIn: Self = this.set("tooltipZoomIn", js.undefined)
    
    @scala.inline
    def setTooltipZoomOut(value: String): Self = this.set("tooltipZoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipZoomOut: Self = this.set("tooltipZoomOut", js.undefined)
  }
}
