package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompensationFilter extends js.Object {
  
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
  implicit class CompensationFilterOps[Self <: CompensationFilter] (val x: Self) extends AnyVal {
    
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
    def setIncludeJobsWithUnspecifiedCompensationRange(value: Boolean): Self = this.set("includeJobsWithUnspecifiedCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeJobsWithUnspecifiedCompensationRange: Self = this.set("includeJobsWithUnspecifiedCompensationRange", js.undefined)
    
    @scala.inline
    def setRange(value: CompensationRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnitsVarargs(value: String*): Self = this.set("units", js.Array(value :_*))
    
    @scala.inline
    def setUnits(value: js.Array[String]): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
  }
}
