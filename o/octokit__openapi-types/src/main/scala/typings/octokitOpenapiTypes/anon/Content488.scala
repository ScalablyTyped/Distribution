package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content488 extends StObject {
  
  var content: `488`
  
  var headers: Link
}
object Content488 {
  
  inline def apply(content: `488`, headers: Link): Content488 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content488]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content488] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `488`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
