package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRateResources extends StObject {
  
  var content: ApplicationjsonRateResources
}
object ContentApplicationjsonRateResources {
  
  inline def apply(content: ApplicationjsonRateResources): ContentApplicationjsonRateResources = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRateResources]
  }
  
  extension [Self <: ContentApplicationjsonRateResources](x: Self) {
    
    inline def setContent(value: ApplicationjsonRateResources): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
