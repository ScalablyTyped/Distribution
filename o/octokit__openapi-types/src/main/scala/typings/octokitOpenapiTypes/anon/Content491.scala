package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content491 extends StObject {
  
  var content: `491`
  
  var headers: LinkString
}
object Content491 {
  
  inline def apply(content: `491`, headers: LinkString): Content491 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content491]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content491] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `491`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
