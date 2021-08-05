package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramResults extends StObject {
  
  /** Specifies compensation field-based histogram results that match HistogramFacets.compensation_histogram_requests. */
  var compensationHistogramResults: js.UndefOr[js.Array[CompensationHistogramResult]] = js.undefined
  
  /** Specifies histogram results for custom attributes that match HistogramFacets.custom_attribute_histogram_facets. */
  var customAttributeHistogramResults: js.UndefOr[js.Array[CustomAttributeHistogramResult]] = js.undefined
  
  /** Specifies histogram results that matches HistogramFacets.simple_histogram_facets. */
  var simpleHistogramResults: js.UndefOr[js.Array[HistogramResult]] = js.undefined
}
object HistogramResults {
  
  inline def apply(): HistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramResults]
  }
  
  extension [Self <: HistogramResults](x: Self) {
    
    inline def setCompensationHistogramResults(value: js.Array[CompensationHistogramResult]): Self = StObject.set(x, "compensationHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setCompensationHistogramResultsUndefined: Self = StObject.set(x, "compensationHistogramResults", js.undefined)
    
    inline def setCompensationHistogramResultsVarargs(value: CompensationHistogramResult*): Self = StObject.set(x, "compensationHistogramResults", js.Array(value :_*))
    
    inline def setCustomAttributeHistogramResults(value: js.Array[CustomAttributeHistogramResult]): Self = StObject.set(x, "customAttributeHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeHistogramResultsUndefined: Self = StObject.set(x, "customAttributeHistogramResults", js.undefined)
    
    inline def setCustomAttributeHistogramResultsVarargs(value: CustomAttributeHistogramResult*): Self = StObject.set(x, "customAttributeHistogramResults", js.Array(value :_*))
    
    inline def setSimpleHistogramResults(value: js.Array[HistogramResult]): Self = StObject.set(x, "simpleHistogramResults", value.asInstanceOf[js.Any])
    
    inline def setSimpleHistogramResultsUndefined: Self = StObject.set(x, "simpleHistogramResults", js.undefined)
    
    inline def setSimpleHistogramResultsVarargs(value: HistogramResult*): Self = StObject.set(x, "simpleHistogramResults", js.Array(value :_*))
  }
}
