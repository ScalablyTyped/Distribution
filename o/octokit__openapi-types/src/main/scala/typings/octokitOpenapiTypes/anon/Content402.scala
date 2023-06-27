package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content402 extends StObject {
  
  var content: `402`
  
  var headers: Link
}
object Content402 {
  
  inline def apply(content: `402`, headers: Link): Content402 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content402]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content402] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `402`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
