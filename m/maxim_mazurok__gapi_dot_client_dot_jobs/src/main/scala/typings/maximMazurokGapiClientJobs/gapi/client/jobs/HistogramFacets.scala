package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramFacets extends StObject {
  
  /** Optional. Specifies compensation field-based histogram requests. Duplicate values of CompensationHistogramRequest.type are not allowed. */
  var compensationHistogramFacets: js.UndefOr[js.Array[CompensationHistogramRequest]] = js.undefined
  
  /** Optional. Specifies the custom attributes histogram requests. Duplicate values of CustomAttributeHistogramRequest.key are not allowed. */
  var customAttributeHistogramFacets: js.UndefOr[js.Array[CustomAttributeHistogramRequest]] = js.undefined
  
  /** Optional. Specifies the simple type of histogram facets, for example, `COMPANY_SIZE`, `EMPLOYMENT_TYPE` etc. */
  var simpleHistogramFacets: js.UndefOr[js.Array[String]] = js.undefined
}
object HistogramFacets {
  
  inline def apply(): HistogramFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramFacets]
  }
  
  extension [Self <: HistogramFacets](x: Self) {
    
    inline def setCompensationHistogramFacets(value: js.Array[CompensationHistogramRequest]): Self = StObject.set(x, "compensationHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setCompensationHistogramFacetsUndefined: Self = StObject.set(x, "compensationHistogramFacets", js.undefined)
    
    inline def setCompensationHistogramFacetsVarargs(value: CompensationHistogramRequest*): Self = StObject.set(x, "compensationHistogramFacets", js.Array(value :_*))
    
    inline def setCustomAttributeHistogramFacets(value: js.Array[CustomAttributeHistogramRequest]): Self = StObject.set(x, "customAttributeHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setCustomAttributeHistogramFacetsUndefined: Self = StObject.set(x, "customAttributeHistogramFacets", js.undefined)
    
    inline def setCustomAttributeHistogramFacetsVarargs(value: CustomAttributeHistogramRequest*): Self = StObject.set(x, "customAttributeHistogramFacets", js.Array(value :_*))
    
    inline def setSimpleHistogramFacets(value: js.Array[String]): Self = StObject.set(x, "simpleHistogramFacets", value.asInstanceOf[js.Any])
    
    inline def setSimpleHistogramFacetsUndefined: Self = StObject.set(x, "simpleHistogramFacets", js.undefined)
    
    inline def setSimpleHistogramFacetsVarargs(value: String*): Self = StObject.set(x, "simpleHistogramFacets", js.Array(value :_*))
  }
}
