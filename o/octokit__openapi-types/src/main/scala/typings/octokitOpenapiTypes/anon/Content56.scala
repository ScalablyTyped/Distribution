package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content56 extends StObject {
  
  var content: `56`
  
  var headers: Link
}
object Content56 {
  
  inline def apply(content: `56`, headers: Link): Content56 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content56]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content56] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `56`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
