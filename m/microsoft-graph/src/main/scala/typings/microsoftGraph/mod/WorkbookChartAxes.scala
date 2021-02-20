package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartAxes extends Entity {
  
  // Represents the category axis in a chart. Read-only.
  var categoryAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.native
  
  // Represents the series axis of a 3-dimensional chart. Read-only.
  var seriesAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.native
  
  // Represents the value axis in an axis. Read-only.
  var valueAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.native
}
object WorkbookChartAxes {
  
  @scala.inline
  def apply(): WorkbookChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxes]
  }
  
  @scala.inline
  implicit class WorkbookChartAxesMutableBuilder[Self <: WorkbookChartAxes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisNull: Self = StObject.set(x, "categoryAxis", null)
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setSeriesAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesAxisNull: Self = StObject.set(x, "seriesAxis", null)
    
    @scala.inline
    def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    @scala.inline
    def setValueAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAxisNull: Self = StObject.set(x, "valueAxis", null)
    
    @scala.inline
    def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
