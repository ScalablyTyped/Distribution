package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content796 extends StObject {
  
  var content: `796`
  
  var headers: LinkString
}
object Content796 {
  
  inline def apply(content: `796`, headers: LinkString): Content796 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content796]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content796] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `796`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
