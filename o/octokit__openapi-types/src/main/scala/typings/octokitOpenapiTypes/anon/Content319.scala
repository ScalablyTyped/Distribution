package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content319 extends StObject {
  
  var content: `319`
  
  var headers: Link
}
object Content319 {
  
  inline def apply(content: `319`, headers: Link): Content319 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content319]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content319] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `319`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
