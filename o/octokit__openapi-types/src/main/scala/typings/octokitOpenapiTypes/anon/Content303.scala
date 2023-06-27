package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content303 extends StObject {
  
  var content: `303`
  
  var headers: Location
}
object Content303 {
  
  inline def apply(content: `303`, headers: Location): Content303 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content303]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content303] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `303`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Location): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
