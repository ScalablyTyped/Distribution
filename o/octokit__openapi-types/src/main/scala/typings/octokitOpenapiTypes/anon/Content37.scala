package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content37 extends StObject {
  
  var content: `37`
  
  var headers: Link
}
object Content37 {
  
  inline def apply(content: `37`, headers: Link): Content37 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content37]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content37] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `37`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
