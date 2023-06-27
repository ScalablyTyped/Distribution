package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content722 extends StObject {
  
  var content: `722`
  
  var headers: LinkString
}
object Content722 {
  
  inline def apply(content: `722`, headers: LinkString): Content722 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content722]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content722] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `722`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
