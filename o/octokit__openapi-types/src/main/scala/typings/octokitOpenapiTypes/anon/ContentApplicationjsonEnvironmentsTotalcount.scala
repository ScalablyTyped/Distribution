package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnvironmentsTotalcount extends StObject {
  
  var content: ApplicationjsonEnvironmentsTotalcount
}
object ContentApplicationjsonEnvironmentsTotalcount {
  
  inline def apply(content: ApplicationjsonEnvironmentsTotalcount): ContentApplicationjsonEnvironmentsTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnvironmentsTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonEnvironmentsTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnvironmentsTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
