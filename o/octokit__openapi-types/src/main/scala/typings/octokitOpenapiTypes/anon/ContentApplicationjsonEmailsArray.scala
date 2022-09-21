package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEmailsArray extends StObject {
  
  var content: ApplicationjsonEmailsArray
}
object ContentApplicationjsonEmailsArray {
  
  inline def apply(content: ApplicationjsonEmailsArray): ContentApplicationjsonEmailsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEmailsArray]
  }
  
  extension [Self <: ContentApplicationjsonEmailsArray](x: Self) {
    
    inline def setContent(value: ApplicationjsonEmailsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
