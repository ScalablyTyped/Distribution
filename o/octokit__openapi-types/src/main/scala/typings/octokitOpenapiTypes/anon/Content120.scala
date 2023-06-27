package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content120 extends StObject {
  
  var content: `120`
  
  var headers: Link
}
object Content120 {
  
  inline def apply(content: `120`, headers: Link): Content120 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content120]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content120] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `120`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
