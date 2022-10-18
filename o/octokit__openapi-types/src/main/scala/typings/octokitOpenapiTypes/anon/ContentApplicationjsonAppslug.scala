package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAppslug extends StObject {
  
  var content: ApplicationjsonAppslug
}
object ContentApplicationjsonAppslug {
  
  inline def apply(content: ApplicationjsonAppslug): ContentApplicationjsonAppslug = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAppslug]
  }
  
  extension [Self <: ContentApplicationjsonAppslug](x: Self) {
    
    inline def setContent(value: ApplicationjsonAppslug): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
