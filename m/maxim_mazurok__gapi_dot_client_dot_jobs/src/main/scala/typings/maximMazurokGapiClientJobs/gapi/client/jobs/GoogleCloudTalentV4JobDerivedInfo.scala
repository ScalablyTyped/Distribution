package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudTalentV4JobDerivedInfo extends StObject {
  
  /** Job categories derived from Job.title and Job.description. */
  var jobCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Structured locations of the job, resolved from Job.addresses. locations are exactly matched to Job.addresses in the same order. */
  var locations: js.UndefOr[js.Array[GoogleCloudTalentV4Location]] = js.undefined
}
object GoogleCloudTalentV4JobDerivedInfo {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4JobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4JobDerivedInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4JobDerivedInfoMutableBuilder[Self <: GoogleCloudTalentV4JobDerivedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobCategories(value: js.Array[String]): Self = StObject.set(x, "jobCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCategoriesUndefined: Self = StObject.set(x, "jobCategories", js.undefined)
    
    @scala.inline
    def setJobCategoriesVarargs(value: String*): Self = StObject.set(x, "jobCategories", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[GoogleCloudTalentV4Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleCloudTalentV4Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
