package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content36 extends StObject {
  
  var content: `36`
  
  var headers: Link
}
object Content36 {
  
  inline def apply(content: `36`, headers: Link): Content36 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content36] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `36`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
