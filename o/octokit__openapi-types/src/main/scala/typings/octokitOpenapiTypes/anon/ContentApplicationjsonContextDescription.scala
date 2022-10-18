package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonContextDescription extends StObject {
  
  var content: ApplicationjsonContextDescription
}
object ContentApplicationjsonContextDescription {
  
  inline def apply(content: ApplicationjsonContextDescription): ContentApplicationjsonContextDescription = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonContextDescription]
  }
  
  extension [Self <: ContentApplicationjsonContextDescription](x: Self) {
    
    inline def setContent(value: ApplicationjsonContextDescription): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
