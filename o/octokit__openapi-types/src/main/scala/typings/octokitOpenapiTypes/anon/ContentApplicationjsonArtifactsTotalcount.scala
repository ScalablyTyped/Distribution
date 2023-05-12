package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArtifactsTotalcount extends StObject {
  
  var content: ApplicationjsonArtifactsTotalcount
  
  var headers: LinkString
}
object ContentApplicationjsonArtifactsTotalcount {
  
  inline def apply(content: ApplicationjsonArtifactsTotalcount, headers: LinkString): ContentApplicationjsonArtifactsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArtifactsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonArtifactsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonArtifactsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
