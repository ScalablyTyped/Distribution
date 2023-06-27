package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content57 extends StObject {
  
  var content: `57`
  
  var headers: Link
}
object Content57 {
  
  inline def apply(content: `57`, headers: Link): Content57 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content57]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content57] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `57`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
