package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReviewrequester extends StObject {
  
  var content: ApplicationjsonReviewrequester
}
object ContentApplicationjsonReviewrequester {
  
  inline def apply(content: ApplicationjsonReviewrequester): ContentApplicationjsonReviewrequester = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReviewrequester]
  }
  
  extension [Self <: ContentApplicationjsonReviewrequester](x: Self) {
    
    inline def setContent(value: ApplicationjsonReviewrequester): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
