package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCodespaces extends StObject {
  
  var content: ApplicationjsonCodespaces
}
object ContentApplicationjsonCodespaces {
  
  inline def apply(content: ApplicationjsonCodespaces): ContentApplicationjsonCodespaces = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCodespaces]
  }
  
  extension [Self <: ContentApplicationjsonCodespaces](x: Self) {
    
    inline def setContent(value: ApplicationjsonCodespaces): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
