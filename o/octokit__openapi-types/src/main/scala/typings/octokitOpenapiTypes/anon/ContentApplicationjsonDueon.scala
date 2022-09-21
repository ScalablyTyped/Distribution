package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDueon extends StObject {
  
  var content: ApplicationjsonDueon
}
object ContentApplicationjsonDueon {
  
  inline def apply(content: ApplicationjsonDueon): ContentApplicationjsonDueon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDueon]
  }
  
  extension [Self <: ContentApplicationjsonDueon](x: Self) {
    
    inline def setContent(value: ApplicationjsonDueon): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
