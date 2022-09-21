package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonActivecachescount extends StObject {
  
  var content: ApplicationjsonActivecachescount
}
object ContentApplicationjsonActivecachescount {
  
  inline def apply(content: ApplicationjsonActivecachescount): ContentApplicationjsonActivecachescount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonActivecachescount]
  }
  
  extension [Self <: ContentApplicationjsonActivecachescount](x: Self) {
    
    inline def setContent(value: ApplicationjsonActivecachescount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
