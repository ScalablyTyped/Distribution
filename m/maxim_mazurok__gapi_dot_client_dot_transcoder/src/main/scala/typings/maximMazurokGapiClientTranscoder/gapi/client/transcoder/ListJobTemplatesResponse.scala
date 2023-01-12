package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesResponse extends StObject {
  
  /** List of job templates in the specified region. */
  var jobTemplates: js.UndefOr[js.Array[JobTemplate]] = js.undefined
  
  /** The pagination token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of regions that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListJobTemplatesResponse {
  
  inline def apply(): ListJobTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobTemplatesResponse] (val x: Self) extends AnyVal {
    
    inline def setJobTemplates(value: js.Array[JobTemplate]): Self = StObject.set(x, "jobTemplates", value.asInstanceOf[js.Any])
    
    inline def setJobTemplatesUndefined: Self = StObject.set(x, "jobTemplates", js.undefined)
    
    inline def setJobTemplatesVarargs(value: JobTemplate*): Self = StObject.set(x, "jobTemplates", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
