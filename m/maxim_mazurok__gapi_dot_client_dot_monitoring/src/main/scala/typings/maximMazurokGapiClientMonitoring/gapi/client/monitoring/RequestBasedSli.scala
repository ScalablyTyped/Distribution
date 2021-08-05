package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBasedSli extends StObject {
  
  /**
    * distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values
    * aggregated in the Distribution.
    */
  var distributionCut: js.UndefOr[DistributionCut] = js.undefined
  
  /** good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries. */
  var goodTotalRatio: js.UndefOr[TimeSeriesRatio] = js.undefined
}
object RequestBasedSli {
  
  inline def apply(): RequestBasedSli = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestBasedSli]
  }
  
  extension [Self <: RequestBasedSli](x: Self) {
    
    inline def setDistributionCut(value: DistributionCut): Self = StObject.set(x, "distributionCut", value.asInstanceOf[js.Any])
    
    inline def setDistributionCutUndefined: Self = StObject.set(x, "distributionCut", js.undefined)
    
    inline def setGoodTotalRatio(value: TimeSeriesRatio): Self = StObject.set(x, "goodTotalRatio", value.asInstanceOf[js.Any])
    
    inline def setGoodTotalRatioUndefined: Self = StObject.set(x, "goodTotalRatio", js.undefined)
  }
}
