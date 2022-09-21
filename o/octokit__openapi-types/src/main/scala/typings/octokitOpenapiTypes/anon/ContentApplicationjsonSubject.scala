package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSubject extends StObject {
  
  var content: ApplicationjsonSubject
}
object ContentApplicationjsonSubject {
  
  inline def apply(content: ApplicationjsonSubject): ContentApplicationjsonSubject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSubject]
  }
  
  extension [Self <: ContentApplicationjsonSubject](x: Self) {
    
    inline def setContent(value: ApplicationjsonSubject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
