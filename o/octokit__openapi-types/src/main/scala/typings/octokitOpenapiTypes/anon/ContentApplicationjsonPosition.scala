package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPosition extends StObject {
  
  var content: ApplicationjsonPosition
}
object ContentApplicationjsonPosition {
  
  inline def apply(content: ApplicationjsonPosition): ContentApplicationjsonPosition = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPosition]
  }
  
  extension [Self <: ContentApplicationjsonPosition](x: Self) {
    
    inline def setContent(value: ApplicationjsonPosition): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
