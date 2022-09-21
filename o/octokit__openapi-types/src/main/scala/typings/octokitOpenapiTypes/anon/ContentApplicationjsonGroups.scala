package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonGroups extends StObject {
  
  var content: ApplicationjsonGroups
}
object ContentApplicationjsonGroups {
  
  inline def apply(content: ApplicationjsonGroups): ContentApplicationjsonGroups = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonGroups]
  }
  
  extension [Self <: ContentApplicationjsonGroups](x: Self) {
    
    inline def setContent(value: ApplicationjsonGroups): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
