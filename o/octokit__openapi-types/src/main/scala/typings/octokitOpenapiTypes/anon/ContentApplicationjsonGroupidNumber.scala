package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonGroupidNumber extends StObject {
  
  var content: ApplicationjsonGroupidNumber
}
object ContentApplicationjsonGroupidNumber {
  
  inline def apply(content: ApplicationjsonGroupidNumber): ContentApplicationjsonGroupidNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonGroupidNumber]
  }
  
  extension [Self <: ContentApplicationjsonGroupidNumber](x: Self) {
    
    inline def setContent(value: ApplicationjsonGroupidNumber): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
