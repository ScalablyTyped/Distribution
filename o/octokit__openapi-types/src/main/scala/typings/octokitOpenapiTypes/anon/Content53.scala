package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content53 extends StObject {
  
  var content: `53`
  
  var headers: `28`
}
object Content53 {
  
  inline def apply(content: `53`, headers: `28`): Content53 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content53]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content53] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `53`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `28`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
