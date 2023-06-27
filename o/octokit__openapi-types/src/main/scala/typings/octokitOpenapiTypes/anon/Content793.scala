package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content793 extends StObject {
  
  var content: `793`
  
  var headers: LinkString
}
object Content793 {
  
  inline def apply(content: `793`, headers: LinkString): Content793 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content793]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content793] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `793`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
