package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content40 extends StObject {
  
  var content: `40`
  
  var headers: Link
}
object Content40 {
  
  inline def apply(content: `40`, headers: Link): Content40 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content40]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content40] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `40`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
