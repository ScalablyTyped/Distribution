package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCheckruns extends StObject {
  
  var content: ApplicationjsonCheckruns
}
object ContentApplicationjsonCheckruns {
  
  inline def apply(content: ApplicationjsonCheckruns): ContentApplicationjsonCheckruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCheckruns]
  }
  
  extension [Self <: ContentApplicationjsonCheckruns](x: Self) {
    
    inline def setContent(value: ApplicationjsonCheckruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
