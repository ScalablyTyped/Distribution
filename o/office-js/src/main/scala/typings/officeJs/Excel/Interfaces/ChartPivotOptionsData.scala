package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartPivotOptions.toJSON()`. */
trait ChartPivotOptionsData extends StObject {
  
  /**
    * Specifies whether to display the axis field buttons on a PivotChart. The `showAxisFieldButtons` property corresponds to the "Show Axis Field Buttons" command on the "Field Buttons" drop-down list of the "Analyze" tab, which is available when a PivotChart is selected.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showAxisFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the legend field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showLegendFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the report filter field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showReportFilterFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to display the show value field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var showValueFieldButtons: js.UndefOr[Boolean] = js.undefined
}
object ChartPivotOptionsData {
  
  inline def apply(): ChartPivotOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPivotOptionsData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartPivotOptionsData] (val x: Self) extends AnyVal {
    
    inline def setShowAxisFieldButtons(value: Boolean): Self = StObject.set(x, "showAxisFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowAxisFieldButtonsUndefined: Self = StObject.set(x, "showAxisFieldButtons", js.undefined)
    
    inline def setShowLegendFieldButtons(value: Boolean): Self = StObject.set(x, "showLegendFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowLegendFieldButtonsUndefined: Self = StObject.set(x, "showLegendFieldButtons", js.undefined)
    
    inline def setShowReportFilterFieldButtons(value: Boolean): Self = StObject.set(x, "showReportFilterFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowReportFilterFieldButtonsUndefined: Self = StObject.set(x, "showReportFilterFieldButtons", js.undefined)
    
    inline def setShowValueFieldButtons(value: Boolean): Self = StObject.set(x, "showValueFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowValueFieldButtonsUndefined: Self = StObject.set(x, "showValueFieldButtons", js.undefined)
  }
}
