package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content330 extends StObject {
  
  var content: `330`
  
  var headers: Link
}
object Content330 {
  
  inline def apply(content: `330`, headers: Link): Content330 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content330]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content330] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `330`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
