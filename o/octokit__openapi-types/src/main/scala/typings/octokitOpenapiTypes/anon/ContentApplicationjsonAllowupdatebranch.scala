package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonAllowupdatebranch extends StObject {
  
  var content: ApplicationjsonAllowupdatebranch
  
  var headers: Location
}
object ContentApplicationjsonAllowupdatebranch {
  
  inline def apply(content: ApplicationjsonAllowupdatebranch, headers: Location): ContentApplicationjsonAllowupdatebranch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonAllowupdatebranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonAllowupdatebranch] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonAllowupdatebranch): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
