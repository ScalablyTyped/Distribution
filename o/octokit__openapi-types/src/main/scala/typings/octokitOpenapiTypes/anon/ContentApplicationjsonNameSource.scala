package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonNameSource extends StObject {
  
  var content: ApplicationjsonNameSource
}
object ContentApplicationjsonNameSource {
  
  inline def apply(content: ApplicationjsonNameSource): ContentApplicationjsonNameSource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonNameSource]
  }
  
  extension [Self <: ContentApplicationjsonNameSource](x: Self) {
    
    inline def setContent(value: ApplicationjsonNameSource): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
