package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content406 extends StObject {
  
  var content: `406`
  
  var headers: Link
}
object Content406 {
  
  inline def apply(content: `406`, headers: Link): Content406 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content406]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content406] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `406`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
