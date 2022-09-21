package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonHighlightedcontent extends StObject {
  
  var content: ApplicationjsonHighlightedcontent
}
object ContentApplicationjsonHighlightedcontent {
  
  inline def apply(content: ApplicationjsonHighlightedcontent): ContentApplicationjsonHighlightedcontent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonHighlightedcontent]
  }
  
  extension [Self <: ContentApplicationjsonHighlightedcontent](x: Self) {
    
    inline def setContent(value: ApplicationjsonHighlightedcontent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
