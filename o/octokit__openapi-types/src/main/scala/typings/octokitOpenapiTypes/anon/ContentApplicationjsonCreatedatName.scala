package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCreatedatName extends StObject {
  
  var content: ApplicationjsonCreatedatName
}
object ContentApplicationjsonCreatedatName {
  
  inline def apply(content: ApplicationjsonCreatedatName): ContentApplicationjsonCreatedatName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCreatedatName]
  }
  
  extension [Self <: ContentApplicationjsonCreatedatName](x: Self) {
    
    inline def setContent(value: ApplicationjsonCreatedatName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
