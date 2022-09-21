package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAsync extends StObject {
  
  var content: ApplicationjsonAsync
}
object ContentApplicationjsonAsync {
  
  inline def apply(content: ApplicationjsonAsync): ContentApplicationjsonAsync = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAsync]
  }
  
  extension [Self <: ContentApplicationjsonAsync](x: Self) {
    
    inline def setContent(value: ApplicationjsonAsync): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
