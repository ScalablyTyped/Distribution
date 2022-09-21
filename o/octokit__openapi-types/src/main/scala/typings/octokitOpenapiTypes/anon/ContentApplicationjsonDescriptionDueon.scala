package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDescriptionDueon extends StObject {
  
  var content: ApplicationjsonDescriptionDueon
}
object ContentApplicationjsonDescriptionDueon {
  
  inline def apply(content: ApplicationjsonDescriptionDueon): ContentApplicationjsonDescriptionDueon = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDescriptionDueon]
  }
  
  extension [Self <: ContentApplicationjsonDescriptionDueon](x: Self) {
    
    inline def setContent(value: ApplicationjsonDescriptionDueon): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
