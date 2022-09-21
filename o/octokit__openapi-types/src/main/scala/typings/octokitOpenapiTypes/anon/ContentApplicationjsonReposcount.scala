package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReposcount extends StObject {
  
  var content: ApplicationjsonReposcount
}
object ContentApplicationjsonReposcount {
  
  inline def apply(content: ApplicationjsonReposcount): ContentApplicationjsonReposcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReposcount]
  }
  
  extension [Self <: ContentApplicationjsonReposcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonReposcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
