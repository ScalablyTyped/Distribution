package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompensationFilter extends StObject {
  
  /** Optional. If set to true, jobs with unspecified compensation range fields are included. */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.undefined
  
  /** Optional. Compensation range. */
  var range: js.UndefOr[CompensationRange] = js.undefined
  
  /** Required. Type of filter. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Required. Specify desired `base compensation entry's` CompensationInfo.CompensationUnit. */
  var units: js.UndefOr[js.Array[String]] = js.undefined
}
object CompensationFilter {
  
  inline def apply(): CompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationFilter]
  }
  
  extension [Self <: CompensationFilter](x: Self) {
    
    inline def setIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    inline def setIncludeJobsWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", js.undefined)
    
    inline def setRange(value: CompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnits(value: js.Array[String]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    inline def setUnitsVarargs(value: String*): Self = StObject.set(x, "units", js.Array(value :_*))
  }
}
