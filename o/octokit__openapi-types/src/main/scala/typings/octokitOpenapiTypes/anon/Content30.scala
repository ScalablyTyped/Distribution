package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content30 extends StObject {
  
  var content: `30`
  
  var headers: Link
}
object Content30 {
  
  inline def apply(content: `30`, headers: Link): Content30 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content30]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content30] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `30`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
