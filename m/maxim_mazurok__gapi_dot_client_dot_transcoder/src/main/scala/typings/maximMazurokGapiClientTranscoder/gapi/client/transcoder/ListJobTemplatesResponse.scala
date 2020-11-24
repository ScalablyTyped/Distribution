package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobTemplatesResponse extends js.Object {
  
  /** List of job templates in the specified region. */
  var jobTemplates: js.UndefOr[js.Array[JobTemplate]] = js.native
  
  /** The pagination token. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListJobTemplatesResponse {
  
  @scala.inline
  def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  @scala.inline
  implicit class ListJobTemplatesResponseOps[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
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
    def setJobTemplatesVarargs(value: JobTemplate*): Self = this.set("jobTemplates", js.Array(value :_*))
    
    @scala.inline
    def setJobTemplates(value: js.Array[JobTemplate]): Self = this.set("jobTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTemplates: Self = this.set("jobTemplates", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
