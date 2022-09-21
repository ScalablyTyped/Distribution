package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCountUniques extends StObject {
  
  var content: ApplicationjsonCountUniques
}
object ContentApplicationjsonCountUniques {
  
  inline def apply(content: ApplicationjsonCountUniques): ContentApplicationjsonCountUniques = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCountUniques]
  }
  
  extension [Self <: ContentApplicationjsonCountUniques](x: Self) {
    
    inline def setContent(value: ApplicationjsonCountUniques): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
