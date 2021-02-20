package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationFilter extends StObject {
  
  /** Optional. If set to true, jobs with unspecified compensation range fields are included. */
  var includeJobsWithUnspecifiedCompensationRange: js.UndefOr[Boolean] = js.native
  
  /** Optional. Compensation range. */
  var range: js.UndefOr[CompensationRange] = js.native
  
  /** Required. Type of filter. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Required. Specify desired `base compensation entry's` CompensationInfo.CompensationUnit. */
  var units: js.UndefOr[js.Array[String]] = js.native
}
object CompensationFilter {
  
  @scala.inline
  def apply(): CompensationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompensationFilter]
  }
  
  @scala.inline
  implicit class CompensationFilterMutableBuilder[Self <: CompensationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeJobsWithUnspecifiedCompensationRangeUndefined: Self = StObject.set(x, "includeJobsWithUnspecifiedCompensationRange", js.undefined)
    
    @scala.inline
    def setRange(value: CompensationRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnits(value: js.Array[String]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    
    @scala.inline
    def setUnitsVarargs(value: String*): Self = StObject.set(x, "units", js.Array(value :_*))
  }
}
