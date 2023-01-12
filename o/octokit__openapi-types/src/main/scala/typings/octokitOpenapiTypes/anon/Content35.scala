package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content35 extends StObject {
  
  var content: `35`
  
  var headers: Location
}
object Content35 {
  
  inline def apply(content: `35`, headers: Location): Content35 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content35]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content35] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `35`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
