package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOperations extends StObject {
  
  var content: ApplicationjsonOperations
}
object ContentApplicationjsonOperations {
  
  inline def apply(content: ApplicationjsonOperations): ContentApplicationjsonOperations = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOperations]
  }
  
  extension [Self <: ContentApplicationjsonOperations](x: Self) {
    
    inline def setContent(value: ApplicationjsonOperations): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
