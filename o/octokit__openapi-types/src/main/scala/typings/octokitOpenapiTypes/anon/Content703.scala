package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content703 extends StObject {
  
  var content: `703`
  
  var headers: LinkString
}
object Content703 {
  
  inline def apply(content: `703`, headers: LinkString): Content703 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content703]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content703] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `703`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
