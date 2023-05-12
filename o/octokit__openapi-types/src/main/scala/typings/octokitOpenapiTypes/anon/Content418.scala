package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content418 extends StObject {
  
  var content: `418`
  
  var headers: Link
}
object Content418 {
  
  inline def apply(content: `418`, headers: Link): Content418 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content418]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content418] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `418`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
