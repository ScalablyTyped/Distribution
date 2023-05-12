package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonOneOf extends StObject {
  
  var content: ApplicationjsonOneOf
}
object ContentApplicationjsonOneOf {
  
  inline def apply(content: ApplicationjsonOneOf): ContentApplicationjsonOneOf = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonOneOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonOneOf] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonOneOf): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
