package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDeliveredat extends StObject {
  
  var content: ApplicationjsonDeliveredat
}
object ContentApplicationjsonDeliveredat {
  
  inline def apply(content: ApplicationjsonDeliveredat): ContentApplicationjsonDeliveredat = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDeliveredat]
  }
  
  extension [Self <: ContentApplicationjsonDeliveredat](x: Self) {
    
    inline def setContent(value: ApplicationjsonDeliveredat): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
