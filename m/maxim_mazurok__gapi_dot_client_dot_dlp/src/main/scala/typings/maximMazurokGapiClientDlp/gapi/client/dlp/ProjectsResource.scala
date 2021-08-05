package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var content: ContentResource
  
  var deidentifyTemplates: DeidentifyTemplatesResource
  
  var dlpJobs: DlpJobsResource
  
  var image: ImageResource
  
  var inspectTemplates: InspectTemplatesResource
  
  var jobTriggers: JobTriggersResource
  
  var locations: LocationsResource
  
  var storedInfoTypes: StoredInfoTypesResource
}
object ProjectsResource {
  
  inline def apply(
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
  
  extension [Self <: ProjectsResource](x: Self) {
    
    inline def setContent(value: ContentResource): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplates(value: DeidentifyTemplatesResource): Self = StObject.set(x, "deidentifyTemplates", value.asInstanceOf[js.Any])
    
    inline def setDlpJobs(value: DlpJobsResource): Self = StObject.set(x, "dlpJobs", value.asInstanceOf[js.Any])
    
    inline def setImage(value: ImageResource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplates(value: InspectTemplatesResource): Self = StObject.set(x, "inspectTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobTriggers(value: JobTriggersResource): Self = StObject.set(x, "jobTriggers", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setStoredInfoTypes(value: StoredInfoTypesResource): Self = StObject.set(x, "storedInfoTypes", value.asInstanceOf[js.Any])
  }
}
