package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartLegend extends Entity {
  
  // Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartLegendFormat]] = js.native
  
  // Boolean value for whether the chart legend should overlap with the main body of the chart.
  var overlay: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Represents the position of the legend on the chart. The possible values are: Top, Bottom, Left, Right, Corner, Custom.
  var position: js.UndefOr[NullableOption[String]] = js.native
  
  // A boolean value the represents the visibility of a ChartLegend object.
  var visible: js.UndefOr[Boolean] = js.native
}
object WorkbookChartLegend {
  
  @scala.inline
  def apply(): WorkbookChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLegend]
  }
  
  @scala.inline
  implicit class WorkbookChartLegendOps[Self <: WorkbookChartLegend] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: NullableOption[WorkbookChartLegendFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setOverlay(value: NullableOption[Boolean]): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayNull: Self = this.set("overlay", null)
    
    @scala.inline
    def setPosition(value: NullableOption[String]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
