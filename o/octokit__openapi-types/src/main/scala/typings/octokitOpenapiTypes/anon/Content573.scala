package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content573 extends StObject {
  
  var content: `573`
  
  var headers: LinkString
}
object Content573 {
  
  inline def apply(content: `573`, headers: LinkString): Content573 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content573]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content573] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `573`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
