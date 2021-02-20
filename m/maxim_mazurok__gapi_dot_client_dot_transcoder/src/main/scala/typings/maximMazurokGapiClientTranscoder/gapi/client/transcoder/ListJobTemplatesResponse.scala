package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobTemplatesResponse extends StObject {
  
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
  implicit class ListJobTemplatesResponseMutableBuilder[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobTemplates(value: js.Array[JobTemplate]): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTemplatesUndefined: Self = StObject.set(x, "jobTemplates", js.undefined)
    
    @scala.inline
    def setJobTemplatesVarargs(value: JobTemplate*): Self = StObject.set(x, "jobTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
