package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArtifacts extends StObject {
  
  var content: ApplicationjsonArtifacts
  
  var headers: Link
}
object ContentApplicationjsonArtifacts {
  
  inline def apply(content: ApplicationjsonArtifacts, headers: Link): ContentApplicationjsonArtifacts = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArtifacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonArtifacts] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonArtifacts): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
