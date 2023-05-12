package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonCheckruns extends StObject {
  
  var content: ApplicationjsonCheckruns
  
  var headers: Link
}
object ContentApplicationjsonCheckruns {
  
  inline def apply(content: ApplicationjsonCheckruns, headers: Link): ContentApplicationjsonCheckruns = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonCheckruns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentApplicationjsonCheckruns] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonCheckruns): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
