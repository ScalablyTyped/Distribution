package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content235 extends StObject {
  
  var content: `235`
  
  var headers: Link
}
object Content235 {
  
  inline def apply(content: `235`, headers: Link): Content235 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content235]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content235] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `235`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
