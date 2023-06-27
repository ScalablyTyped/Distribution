package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content147 extends StObject {
  
  var content: `147`
  
  var headers: Link
}
object Content147 {
  
  inline def apply(content: `147`, headers: Link): Content147 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content147]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content147] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `147`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
