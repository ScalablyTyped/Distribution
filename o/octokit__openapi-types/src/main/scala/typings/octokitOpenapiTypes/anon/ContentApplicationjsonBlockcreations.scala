package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonBlockcreations extends StObject {
  
  var content: ApplicationjsonBlockcreations
}
object ContentApplicationjsonBlockcreations {
  
  inline def apply(content: ApplicationjsonBlockcreations): ContentApplicationjsonBlockcreations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonBlockcreations]
  }
  
  extension [Self <: ContentApplicationjsonBlockcreations](x: Self) {
    
    inline def setContent(value: ApplicationjsonBlockcreations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
