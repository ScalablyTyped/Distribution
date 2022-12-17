package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNodeidObject extends StObject {
  
  var content: ApplicationjsonNodeidObject
}
object ContentApplicationjsonNodeidObject {
  
  inline def apply(content: ApplicationjsonNodeidObject): ContentApplicationjsonNodeidObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNodeidObject]
  }
  
  extension [Self <: ContentApplicationjsonNodeidObject](x: Self) {
    
    inline def setContent(value: ApplicationjsonNodeidObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
