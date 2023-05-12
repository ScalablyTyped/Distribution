package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content586 extends StObject {
  
  var content: `586`
  
  var headers: LinkString
}
object Content586 {
  
  inline def apply(content: `586`, headers: LinkString): Content586 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content586]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content586] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `586`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
