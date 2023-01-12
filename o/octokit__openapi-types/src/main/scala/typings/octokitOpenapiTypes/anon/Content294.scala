package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content294 extends StObject {
  
  var content: `294`
  
  var headers: Location
}
object Content294 {
  
  inline def apply(content: `294`, headers: Location): Content294 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content294]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content294] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `294`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
