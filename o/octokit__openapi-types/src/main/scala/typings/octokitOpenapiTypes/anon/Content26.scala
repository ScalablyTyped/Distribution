package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content26 extends StObject {
  
  var content: `26`
  
  var headers: Location
}
object Content26 {
  
  inline def apply(content: `26`, headers: Location): Content26 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content26]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content26] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `26`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
