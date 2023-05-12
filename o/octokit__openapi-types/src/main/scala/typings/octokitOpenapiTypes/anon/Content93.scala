package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content93 extends StObject {
  
  var content: `93`
  
  var headers: Link
}
object Content93 {
  
  inline def apply(content: `93`, headers: Link): Content93 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content93]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content93] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `93`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
