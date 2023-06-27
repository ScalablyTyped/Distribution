package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content580 extends StObject {
  
  var content: `580`
  
  var headers: `28`
}
object Content580 {
  
  inline def apply(content: `580`, headers: `28`): Content580 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content580]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content580] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `580`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: `28`): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
