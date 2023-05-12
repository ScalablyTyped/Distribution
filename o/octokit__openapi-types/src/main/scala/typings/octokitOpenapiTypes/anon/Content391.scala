package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content391 extends StObject {
  
  var content: `391`
  
  var headers: Link
}
object Content391 {
  
  inline def apply(content: `391`, headers: Link): Content391 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content391]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content391] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `391`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
