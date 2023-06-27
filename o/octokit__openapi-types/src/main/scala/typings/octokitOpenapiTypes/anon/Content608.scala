package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content608 extends StObject {
  
  var content: `608`
  
  var headers: LinkString
}
object Content608 {
  
  inline def apply(content: `608`, headers: LinkString): Content608 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content608]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content608] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `608`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
