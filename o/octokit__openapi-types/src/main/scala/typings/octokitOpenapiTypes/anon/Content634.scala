package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content634 extends StObject {
  
  var content: `634`
  
  var headers: LinkString
}
object Content634 {
  
  inline def apply(content: `634`, headers: LinkString): Content634 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content634]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content634] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `634`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
