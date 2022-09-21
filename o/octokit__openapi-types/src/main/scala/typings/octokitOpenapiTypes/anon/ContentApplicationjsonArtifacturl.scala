package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonArtifacturl extends StObject {
  
  var content: ApplicationjsonArtifacturl
}
object ContentApplicationjsonArtifacturl {
  
  inline def apply(content: ApplicationjsonArtifacturl): ContentApplicationjsonArtifacturl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonArtifacturl]
  }
  
  extension [Self <: ContentApplicationjsonArtifacturl](x: Self) {
    
    inline def setContent(value: ApplicationjsonArtifacturl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
