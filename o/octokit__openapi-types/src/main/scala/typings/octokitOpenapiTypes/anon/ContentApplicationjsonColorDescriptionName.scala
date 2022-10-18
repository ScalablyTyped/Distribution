package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonColorDescriptionName extends StObject {
  
  var content: ApplicationjsonColorDescriptionName
}
object ContentApplicationjsonColorDescriptionName {
  
  inline def apply(content: ApplicationjsonColorDescriptionName): ContentApplicationjsonColorDescriptionName = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonColorDescriptionName]
  }
  
  extension [Self <: ContentApplicationjsonColorDescriptionName](x: Self) {
    
    inline def setContent(value: ApplicationjsonColorDescriptionName): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
