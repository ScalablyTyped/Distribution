package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content134 extends StObject {
  
  var content: `134`
  
  var headers: Link
}
object Content134 {
  
  inline def apply(content: `134`, headers: Link): Content134 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content134]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content134] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `134`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
