package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content329 extends StObject {
  
  var content: `329`
  
  var headers: Link
}
object Content329 {
  
  inline def apply(content: `329`, headers: Link): Content329 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content329]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content329] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `329`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
