package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonEnvironmentids extends StObject {
  
  var content: ApplicationjsonEnvironmentids
}
object ContentApplicationjsonEnvironmentids {
  
  inline def apply(content: ApplicationjsonEnvironmentids): ContentApplicationjsonEnvironmentids = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonEnvironmentids]
  }
  
  extension [Self <: ContentApplicationjsonEnvironmentids](x: Self) {
    
    inline def setContent(value: ApplicationjsonEnvironmentids): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
