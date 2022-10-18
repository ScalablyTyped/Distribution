package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnabledorganizations extends StObject {
  
  var content: ApplicationjsonEnabledorganizations
}
object ContentApplicationjsonEnabledorganizations {
  
  inline def apply(content: ApplicationjsonEnabledorganizations): ContentApplicationjsonEnabledorganizations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnabledorganizations]
  }
  
  extension [Self <: ContentApplicationjsonEnabledorganizations](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnabledorganizations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
