package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentHeaders extends StObject {
  
  var content: `17`
  
  var headers: Link
}
object ContentHeaders {
  
  inline def apply(content: `17`, headers: Link): ContentHeaders = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentHeaders] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `17`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
