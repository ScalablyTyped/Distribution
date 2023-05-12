package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content666 extends StObject {
  
  var content: `666`
  
  var headers: LinkString
}
object Content666 {
  
  inline def apply(content: `666`, headers: LinkString): Content666 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content666]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content666] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `666`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
