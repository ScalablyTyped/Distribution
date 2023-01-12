package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReviewers extends StObject {
  
  var content: ApplicationjsonReviewers
}
object ContentApplicationjsonReviewers {
  
  inline def apply(content: ApplicationjsonReviewers): ContentApplicationjsonReviewers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReviewers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonReviewers] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonReviewers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
