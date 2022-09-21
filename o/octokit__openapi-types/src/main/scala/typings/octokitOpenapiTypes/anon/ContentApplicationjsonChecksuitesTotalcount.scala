package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonChecksuitesTotalcount extends StObject {
  
  var content: ApplicationjsonChecksuitesTotalcount
}
object ContentApplicationjsonChecksuitesTotalcount {
  
  inline def apply(content: ApplicationjsonChecksuitesTotalcount): ContentApplicationjsonChecksuitesTotalcount = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonChecksuitesTotalcount]
  }
  
  extension [Self <: ContentApplicationjsonChecksuitesTotalcount](x: Self) {
    
    inline def setContent(value: ApplicationjsonChecksuitesTotalcount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
