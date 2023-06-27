package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content711 extends StObject {
  
  var content: `711`
  
  var headers: LinkString
}
object Content711 {
  
  inline def apply(content: `711`, headers: LinkString): Content711 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content711]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content711] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `711`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
