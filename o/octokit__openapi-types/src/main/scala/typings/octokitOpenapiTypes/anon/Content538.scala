package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content538 extends StObject {
  
  var content: `538`
  
  var headers: LinkString
}
object Content538 {
  
  inline def apply(content: `538`, headers: LinkString): Content538 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content538]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content538] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `538`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
