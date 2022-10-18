package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonSource extends StObject {
  
  var content: ApplicationjsonSource
}
object ContentApplicationjsonSource {
  
  inline def apply(content: ApplicationjsonSource): ContentApplicationjsonSource = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonSource]
  }
  
  extension [Self <: ContentApplicationjsonSource](x: Self) {
    
    inline def setContent(value: ApplicationjsonSource): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
