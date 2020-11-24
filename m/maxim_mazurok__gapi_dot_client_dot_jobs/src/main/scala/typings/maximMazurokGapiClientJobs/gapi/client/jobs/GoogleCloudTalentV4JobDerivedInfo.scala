package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4JobDerivedInfo extends js.Object {
  
  /** Job categories derived from Job.title and Job.description. */
  var jobCategories: js.UndefOr[js.Array[String]] = js.native
  
  /** Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order. */
  var locations: js.UndefOr[js.Array[GoogleCloudTalentV4Location]] = js.native
}
object GoogleCloudTalentV4JobDerivedInfo {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4JobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4JobDerivedInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4JobDerivedInfoOps[Self <: GoogleCloudTalentV4JobDerivedInfo] (val x: Self) extends AnyVal {
    
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
    def setJobCategoriesVarargs(value: String*): Self = this.set("jobCategories", js.Array(value :_*))
    
    @scala.inline
    def setJobCategories(value: js.Array[String]): Self = this.set("jobCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobCategories: Self = this.set("jobCategories", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleCloudTalentV4Location*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[GoogleCloudTalentV4Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
}
