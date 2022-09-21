package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBaserole extends StObject {
  
  var content: ApplicationjsonBaserole
}
object ContentApplicationjsonBaserole {
  
  inline def apply(content: ApplicationjsonBaserole): ContentApplicationjsonBaserole = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBaserole]
  }
  
  extension [Self <: ContentApplicationjsonBaserole](x: Self) {
    
    inline def setContent(value: ApplicationjsonBaserole): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
