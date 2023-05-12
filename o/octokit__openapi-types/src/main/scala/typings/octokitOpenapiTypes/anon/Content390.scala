package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content390 extends StObject {
  
  var content: `390`
  
  var headers: Link
}
object Content390 {
  
  inline def apply(content: `390`, headers: Link): Content390 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content390]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content390] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `390`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
