package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonUserName extends StObject {
  
  var content: ApplicationjsonUserName
}
object ContentApplicationjsonUserName {
  
  inline def apply(content: ApplicationjsonUserName): ContentApplicationjsonUserName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonUserName]
  }
  
  extension [Self <: ContentApplicationjsonUserName](x: Self) {
    
    inline def setContent(value: ApplicationjsonUserName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
