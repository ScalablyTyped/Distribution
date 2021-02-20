package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestBasedSli extends StObject {
  
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
  implicit class RequestBasedSliMutableBuilder[Self <: RequestBasedSli] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionCut(value: DistributionCut): Self = StObject.set(x, "distributionCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionCutUndefined: Self = StObject.set(x, "distributionCut", js.undefined)
    
    @scala.inline
    def setGoodTotalRatio(value: TimeSeriesRatio): Self = StObject.set(x, "goodTotalRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoodTotalRatioUndefined: Self = StObject.set(x, "goodTotalRatio", js.undefined)
  }
}
