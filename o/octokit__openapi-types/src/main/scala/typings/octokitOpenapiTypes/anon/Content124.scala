package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content124 extends StObject {
  
  var content: `124`
  
  var headers: Link
}
object Content124 {
  
  inline def apply(content: `124`, headers: Link): Content124 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content124]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content124] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `124`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
