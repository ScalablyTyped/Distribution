package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramQuery extends StObject {
  
  /** An expression specifies a histogram request against matching jobs for searches. See SearchJobsRequest.histogram_queries for details about syntax. */
  var histogramQuery: js.UndefOr[String] = js.undefined
}
object HistogramQuery {
  
  inline def apply(): HistogramQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramQuery]
  }
  
  extension [Self <: HistogramQuery](x: Self) {
    
    inline def setHistogramQuery(value: String): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    inline def setHistogramQueryUndefined: Self = StObject.set(x, "histogramQuery", js.undefined)
  }
}
