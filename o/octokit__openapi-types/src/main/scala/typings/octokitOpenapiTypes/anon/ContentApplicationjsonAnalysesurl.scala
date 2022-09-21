package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAnalysesurl extends StObject {
  
  var content: ApplicationjsonAnalysesurl
}
object ContentApplicationjsonAnalysesurl {
  
  inline def apply(content: ApplicationjsonAnalysesurl): ContentApplicationjsonAnalysesurl = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAnalysesurl]
  }
  
  extension [Self <: ContentApplicationjsonAnalysesurl](x: Self) {
    
    inline def setContent(value: ApplicationjsonAnalysesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
