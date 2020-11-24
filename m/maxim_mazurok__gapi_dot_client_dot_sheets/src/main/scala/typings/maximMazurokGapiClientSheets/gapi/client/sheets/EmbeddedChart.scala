package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedChart extends js.Object {
  
  /** The ID of the chart. */
  var chartId: js.UndefOr[Double] = js.native
  
  /** The position of the chart. */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
  
  /** The specification of the chart. */
  var spec: js.UndefOr[ChartSpec] = js.native
}
object EmbeddedChart {
  
  @scala.inline
  def apply(): EmbeddedChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedChart]
  }
  
  @scala.inline
  implicit class EmbeddedChartOps[Self <: EmbeddedChart] (val x: Self) extends AnyVal {
    
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
    def setChartId(value: Double): Self = this.set("chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartId: Self = this.set("chartId", js.undefined)
    
    @scala.inline
    def setPosition(value: EmbeddedObjectPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSpec(value: ChartSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
