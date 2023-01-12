package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var jobTemplates: JobTemplatesResource
  
  var jobs: JobsResource
}
object LocationsResource {
  
  inline def apply(jobTemplates: JobTemplatesResource, jobs: JobsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(jobTemplates = jobTemplates.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    inline def setJobTemplates(value: JobTemplatesResource): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobs(value: JobsResource): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
  }
}
