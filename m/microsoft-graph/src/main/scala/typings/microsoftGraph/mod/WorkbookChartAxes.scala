package typings.microsoftGraph.mod

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
  implicit class WorkbookChartAxesOps[Self <: WorkbookChartAxes] (val x: Self) extends AnyVal {
    
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
    def setCategoryAxis(value: NullableOption[WorkbookChartAxis]): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    
    @scala.inline
    def setCategoryAxisNull: Self = this.set("categoryAxis", null)
    
    @scala.inline
    def setSeriesAxis(value: NullableOption[WorkbookChartAxis]): Self = this.set("seriesAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesAxis: Self = this.set("seriesAxis", js.undefined)
    
    @scala.inline
    def setSeriesAxisNull: Self = this.set("seriesAxis", null)
    
    @scala.inline
    def setValueAxis(value: NullableOption[WorkbookChartAxis]): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAxis: Self = this.set("valueAxis", js.undefined)
    
    @scala.inline
    def setValueAxisNull: Self = this.set("valueAxis", null)
  }
}
