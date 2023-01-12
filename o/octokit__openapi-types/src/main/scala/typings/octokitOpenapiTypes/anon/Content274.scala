package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content274 extends StObject {
  
  var content: `274`
  
  var headers: Location
}
object Content274 {
  
  inline def apply(content: `274`, headers: Location): Content274 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content274]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content274] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `274`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
