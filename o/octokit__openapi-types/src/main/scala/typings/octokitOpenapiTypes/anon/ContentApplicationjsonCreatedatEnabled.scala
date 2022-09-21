package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatEnabled extends StObject {
  
  var content: ApplicationjsonCreatedatEnabled
}
object ContentApplicationjsonCreatedatEnabled {
  
  inline def apply(content: ApplicationjsonCreatedatEnabled): ContentApplicationjsonCreatedatEnabled = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatEnabled]
  }
  
  extension [Self <: ContentApplicationjsonCreatedatEnabled](x: Self) {
    
    inline def setContent(value: ApplicationjsonCreatedatEnabled): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
