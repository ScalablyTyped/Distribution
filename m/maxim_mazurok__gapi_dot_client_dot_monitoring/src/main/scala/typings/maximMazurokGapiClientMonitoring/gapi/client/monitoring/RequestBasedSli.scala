package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestBasedSli extends js.Object {
  
  /**
    * distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values
    * aggregated in the Distribution.
    */
  var distributionCut: js.UndefOr[DistributionCut] = js.native
  
  /** good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries. */
  var goodTotalRatio: js.UndefOr[TimeSeriesRatio] = js.native
}
object RequestBasedSli {
  
  @scala.inline
  def apply(): RequestBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestBasedSli]
  }
  
  @scala.inline
  implicit class RequestBasedSliOps[Self <: RequestBasedSli] (val x: Self) extends AnyVal {
    
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
    def setDistributionCut(value: DistributionCut): Self = this.set("distributionCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionCut: Self = this.set("distributionCut", js.undefined)
    
    @scala.inline
    def setGoodTotalRatio(value: TimeSeriesRatio): Self = this.set("goodTotalRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoodTotalRatio: Self = this.set("goodTotalRatio", js.undefined)
  }
}
