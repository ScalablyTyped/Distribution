package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content296 extends StObject {
  
  var content: `296`
  
  var headers: Link
}
object Content296 {
  
  inline def apply(content: `296`, headers: Link): Content296 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content296]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content296] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `296`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
