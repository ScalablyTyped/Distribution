package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBio extends StObject {
  
  var content: ApplicationjsonBio
}
object ContentApplicationjsonBio {
  
  inline def apply(content: ApplicationjsonBio): ContentApplicationjsonBio = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBio]
  }
  
  extension [Self <: ContentApplicationjsonBio](x: Self) {
    
    inline def setContent(value: ApplicationjsonBio): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
