package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonPrivate extends StObject {
  
  var content: ApplicationjsonPrivate
}
object ContentApplicationjsonPrivate {
  
  inline def apply(content: ApplicationjsonPrivate): ContentApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonPrivate]
  }
  
  extension [Self <: ContentApplicationjsonPrivate](x: Self) {
    
    inline def setContent(value: ApplicationjsonPrivate): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
