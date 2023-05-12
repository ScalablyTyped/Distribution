package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content308 extends StObject {
  
  var content: `308`
  
  var headers: Link
}
object Content308 {
  
  inline def apply(content: `308`, headers: Link): Content308 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content308]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content308] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `308`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
