package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSecurityadvisory extends StObject {
  
  var content: ApplicationjsonSecurityadvisory
}
object ContentApplicationjsonSecurityadvisory {
  
  inline def apply(content: ApplicationjsonSecurityadvisory): ContentApplicationjsonSecurityadvisory = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSecurityadvisory]
  }
  
  extension [Self <: ContentApplicationjsonSecurityadvisory](x: Self) {
    
    inline def setContent(value: ApplicationjsonSecurityadvisory): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
