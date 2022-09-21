package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDefault extends StObject {
  
  var content: ApplicationjsonDefault
}
object ContentApplicationjsonDefault {
  
  inline def apply(content: ApplicationjsonDefault): ContentApplicationjsonDefault = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDefault]
  }
  
  extension [Self <: ContentApplicationjsonDefault](x: Self) {
    
    inline def setContent(value: ApplicationjsonDefault): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
