package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content18 extends StObject {
  
  var content: `18`
  
  var headers: Link
}
object Content18 {
  
  inline def apply(content: `18`, headers: Link): Content18 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content18]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content18] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `18`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
