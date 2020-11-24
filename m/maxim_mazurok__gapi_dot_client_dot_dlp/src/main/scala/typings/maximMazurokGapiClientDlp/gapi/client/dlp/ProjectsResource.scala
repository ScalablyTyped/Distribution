package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  var content: ContentResource = js.native
  
  var deidentifyTemplates: DeidentifyTemplatesResource = js.native
  
  var dlpJobs: DlpJobsResource = js.native
  
  var image: ImageResource = js.native
  
  var inspectTemplates: InspectTemplatesResource = js.native
  
  var jobTriggers: JobTriggersResource = js.native
  
  var locations: LocationsResource = js.native
  
  var storedInfoTypes: StoredInfoTypesResource = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(
    content: ContentResource,
    deidentifyTemplates: DeidentifyTemplatesResource,
    dlpJobs: DlpJobsResource,
    image: ImageResource,
    inspectTemplates: InspectTemplatesResource,
    jobTriggers: JobTriggersResource,
    locations: LocationsResource,
    storedInfoTypes: StoredInfoTypesResource
  ): ProjectsResource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], deidentifyTemplates = deidentifyTemplates.asInstanceOf[js.Any], dlpJobs = dlpJobs.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], inspectTemplates = inspectTemplates.asInstanceOf[js.Any], jobTriggers = jobTriggers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], storedInfoTypes = storedInfoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setContent(value: ContentResource): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeidentifyTemplates(value: DeidentifyTemplatesResource): Self = this.set("deidentifyTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlpJobs(value: DlpJobsResource): Self = this.set("dlpJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageResource): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectTemplates(value: InspectTemplatesResource): Self = this.set("inspectTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTriggers(value: JobTriggersResource): Self = this.set("jobTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsResource): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredInfoTypes(value: StoredInfoTypesResource): Self = this.set("storedInfoTypes", value.asInstanceOf[js.Any])
  }
}
