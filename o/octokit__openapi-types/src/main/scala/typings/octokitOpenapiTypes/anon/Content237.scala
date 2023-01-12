package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content237 extends StObject {
  
  var content: `237`
  
  var headers: Location
}
object Content237 {
  
  inline def apply(content: `237`, headers: Location): Content237 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content237]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content237] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `237`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
