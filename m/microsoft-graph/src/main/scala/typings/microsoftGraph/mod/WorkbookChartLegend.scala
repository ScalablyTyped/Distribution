package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartLegend
  extends StObject
     with Entity {
  
  // Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartLegendFormat]] = js.undefined
  
  // Boolean value for whether the chart legend should overlap with the main body of the chart.
  var overlay: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
  var position: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A boolean value the represents the visibility of a ChartLegend object.
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WorkbookChartLegend {
  
  inline def apply(): WorkbookChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLegend]
  }
  
  extension [Self <: WorkbookChartLegend](x: Self) {
    
    inline def setFormat(value: NullableOption[WorkbookChartLegendFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setOverlay(value: NullableOption[Boolean]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
    
    inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
    
    inline def setPosition(value: NullableOption[String]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
