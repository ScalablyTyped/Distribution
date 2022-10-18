package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonRole extends StObject {
  
  var content: ApplicationjsonRole
}
object ContentApplicationjsonRole {
  
  inline def apply(content: ApplicationjsonRole): ContentApplicationjsonRole = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonRole]
  }
  
  extension [Self <: ContentApplicationjsonRole](x: Self) {
    
    inline def setContent(value: ApplicationjsonRole): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
