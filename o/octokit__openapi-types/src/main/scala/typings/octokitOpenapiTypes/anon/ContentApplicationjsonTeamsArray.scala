package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTeamsArray extends StObject {
  
  var content: ApplicationjsonTeamsArray
}
object ContentApplicationjsonTeamsArray {
  
  inline def apply(content: ApplicationjsonTeamsArray): ContentApplicationjsonTeamsArray = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTeamsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonTeamsArray] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonTeamsArray): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
