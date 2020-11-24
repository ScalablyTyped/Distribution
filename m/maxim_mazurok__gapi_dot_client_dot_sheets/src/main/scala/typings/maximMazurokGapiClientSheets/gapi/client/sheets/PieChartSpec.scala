package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieChartSpec extends js.Object {
  
  /** The data that covers the domain of the pie chart. */
  var domain: js.UndefOr[ChartData] = js.native
  
  /** Where the legend of the pie chart should be drawn. */
  var legendPosition: js.UndefOr[String] = js.native
  
  /** The size of the hole in the pie chart. */
  var pieHole: js.UndefOr[Double] = js.native
  
  /** The data that covers the one and only series of the pie chart. */
  var series: js.UndefOr[ChartData] = js.native
  
  /** True if the pie is three dimensional. */
  var threeDimensional: js.UndefOr[Boolean] = js.native
}
object PieChartSpec {
  
  @scala.inline
  def apply(): PieChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartSpec]
  }
  
  @scala.inline
  implicit class PieChartSpecOps[Self <: PieChartSpec] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: ChartData): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setPieHole(value: Double): Self = this.set("pieHole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieHole: Self = this.set("pieHole", js.undefined)
    
    @scala.inline
    def setSeries(value: ChartData): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = this.set("threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreeDimensional: Self = this.set("threeDimensional", js.undefined)
  }
}
