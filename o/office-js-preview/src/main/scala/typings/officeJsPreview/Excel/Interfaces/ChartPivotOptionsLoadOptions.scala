package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the options for the pivot chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartPivotOptionsLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to display the axis field buttons on a PivotChart. The ShowAxisFieldButtons property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to display the legend field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to display the report filter field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies whether to display the show value field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.native
}
object ChartPivotOptionsLoadOptions {
  
  @scala.inline
  def apply(): ChartPivotOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPivotOptionsLoadOptions]
  }
  
  @scala.inline
  implicit class ChartPivotOptionsLoadOptionsMutableBuilder[Self <: ChartPivotOptionsLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setShowAxisFieldButtons(value: Boolean): Self = StObject.set(x, "showAxisFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisFieldButtonsUndefined: Self = StObject.set(x, "showAxisFieldButtons", js.undefined)
    
    @scala.inline
    def setShowLegendFieldButtons(value: Boolean): Self = StObject.set(x, "showLegendFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLegendFieldButtonsUndefined: Self = StObject.set(x, "showLegendFieldButtons", js.undefined)
    
    @scala.inline
    def setShowReportFilterFieldButtons(value: Boolean): Self = StObject.set(x, "showReportFilterFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowReportFilterFieldButtonsUndefined: Self = StObject.set(x, "showReportFilterFieldButtons", js.undefined)
    
    @scala.inline
    def setShowValueFieldButtons(value: Boolean): Self = StObject.set(x, "showValueFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueFieldButtonsUndefined: Self = StObject.set(x, "showValueFieldButtons", js.undefined)
  }
}
