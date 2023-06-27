package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content385 extends StObject {
  
  var content: `385`
  
  var headers: Location
}
object Content385 {
  
  inline def apply(content: `385`, headers: Location): Content385 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content385]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content385] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `385`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
