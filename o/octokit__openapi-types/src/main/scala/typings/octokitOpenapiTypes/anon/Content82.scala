package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content82 extends StObject {
  
  var content: `82`
  
  var headers: Link
}
object Content82 {
  
  inline def apply(content: `82`, headers: Link): Content82 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content82]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content82] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `82`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
