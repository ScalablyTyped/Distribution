package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content687 extends StObject {
  
  var content: `687`
  
  var headers: LinkString
}
object Content687 {
  
  inline def apply(content: `687`, headers: LinkString): Content687 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content687]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content687] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `687`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
