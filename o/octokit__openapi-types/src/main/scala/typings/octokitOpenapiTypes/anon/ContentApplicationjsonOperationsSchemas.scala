package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOperationsSchemas extends StObject {
  
  var content: ApplicationjsonOperationsSchemas
}
object ContentApplicationjsonOperationsSchemas {
  
  inline def apply(content: ApplicationjsonOperationsSchemas): ContentApplicationjsonOperationsSchemas = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOperationsSchemas]
  }
  
  extension [Self <: ContentApplicationjsonOperationsSchemas](x: Self) {
    
    inline def setContent(value: ApplicationjsonOperationsSchemas): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
