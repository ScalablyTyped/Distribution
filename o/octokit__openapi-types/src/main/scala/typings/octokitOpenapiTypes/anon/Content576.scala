package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content576 extends StObject {
  
  var content: `576`
  
  var headers: LinkString
}
object Content576 {
  
  inline def apply(content: `576`, headers: LinkString): Content576 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content576]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content576] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `576`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
