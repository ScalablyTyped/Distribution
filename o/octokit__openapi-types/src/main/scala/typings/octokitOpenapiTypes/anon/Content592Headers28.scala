package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content592Headers28 extends StObject {
  
  var content: `592`
  
  var headers: `28`
}
object Content592Headers28 {
  
  inline def apply(content: `592`, headers: `28`): Content592Headers28 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content592Headers28]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content592Headers28] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `592`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `28`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
