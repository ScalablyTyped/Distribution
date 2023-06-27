package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content342 extends StObject {
  
  var content: `342`
  
  var headers: Location
}
object Content342 {
  
  inline def apply(content: `342`, headers: Location): Content342 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content342]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content342] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `342`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
