package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonDetail extends StObject {
  
  var content: ApplicationjsonDetail
}
object ContentApplicationjsonDetail {
  
  inline def apply(content: ApplicationjsonDetail): ContentApplicationjsonDetail = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonDetail]
  }
  
  extension [Self <: ContentApplicationjsonDetail](x: Self) {
    
    inline def setContent(value: ApplicationjsonDetail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
