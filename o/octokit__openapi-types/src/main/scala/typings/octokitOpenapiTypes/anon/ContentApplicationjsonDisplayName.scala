package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDisplayName extends StObject {
  
  var content: ApplicationjsonDisplayName
}
object ContentApplicationjsonDisplayName {
  
  inline def apply(content: ApplicationjsonDisplayName): ContentApplicationjsonDisplayName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDisplayName]
  }
  
  extension [Self <: ContentApplicationjsonDisplayName](x: Self) {
    
    inline def setContent(value: ApplicationjsonDisplayName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
