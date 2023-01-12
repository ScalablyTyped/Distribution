package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonIncompleteresults extends StObject {
  
  var content: ApplicationjsonIncompleteresults
}
object ContentApplicationjsonIncompleteresults {
  
  inline def apply(content: ApplicationjsonIncompleteresults): ContentApplicationjsonIncompleteresults = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonIncompleteresults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonIncompleteresults] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonIncompleteresults): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
