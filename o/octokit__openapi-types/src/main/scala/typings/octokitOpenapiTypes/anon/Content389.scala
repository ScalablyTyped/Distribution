package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content389 extends StObject {
  
  var content: `389`
  
  var headers: Link
}
object Content389 {
  
  inline def apply(content: `389`, headers: Link): Content389 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content389]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content389] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `389`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
