package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var jobTemplates: JobTemplatesResource = js.native
  
  var jobs: JobsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(jobTemplates: JobTemplatesResource, jobs: JobsResource): LocationsResource = {
    val __obj = js.Dynamic.literal(jobTemplates = jobTemplates.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
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
    def setJobTemplates(value: JobTemplatesResource): Self = this.set("jobTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobs(value: JobsResource): Self = this.set("jobs", value.asInstanceOf[js.Any])
  }
}
