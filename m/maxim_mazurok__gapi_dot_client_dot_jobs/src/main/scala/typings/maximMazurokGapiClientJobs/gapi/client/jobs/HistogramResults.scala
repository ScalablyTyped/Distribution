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
  
  @scala.inline
  def apply(): HistogramResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramResults]
  }
  
  @scala.inline
  implicit class HistogramResultsMutableBuilder[Self <: HistogramResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompensationHistogramResults(value: js.Array[CompensationHistogramResult]): Self = StObject.set(x, "compensationHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompensationHistogramResultsUndefined: Self = StObject.set(x, "compensationHistogramResults", js.undefined)
    
    @scala.inline
    def setCompensationHistogramResultsVarargs(value: CompensationHistogramResult*): Self = StObject.set(x, "compensationHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributeHistogramResults(value: js.Array[CustomAttributeHistogramResult]): Self = StObject.set(x, "customAttributeHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributeHistogramResultsUndefined: Self = StObject.set(x, "customAttributeHistogramResults", js.undefined)
    
    @scala.inline
    def setCustomAttributeHistogramResultsVarargs(value: CustomAttributeHistogramResult*): Self = StObject.set(x, "customAttributeHistogramResults", js.Array(value :_*))
    
    @scala.inline
    def setSimpleHistogramResults(value: js.Array[HistogramResult]): Self = StObject.set(x, "simpleHistogramResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleHistogramResultsUndefined: Self = StObject.set(x, "simpleHistogramResults", js.undefined)
    
    @scala.inline
    def setSimpleHistogramResultsVarargs(value: HistogramResult*): Self = StObject.set(x, "simpleHistogramResults", js.Array(value :_*))
  }
}
