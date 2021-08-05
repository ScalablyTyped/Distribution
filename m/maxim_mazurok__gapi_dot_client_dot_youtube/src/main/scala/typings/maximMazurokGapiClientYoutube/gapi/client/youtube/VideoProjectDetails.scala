package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoProjectDetails extends StObject {
  
  /** A list of project tags associated with the video during the upload. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object VideoProjectDetails {
  
  inline def apply(): VideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoProjectDetails]
  }
  
  extension [Self <: VideoProjectDetails](x: Self) {
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
