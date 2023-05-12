package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content324 extends StObject {
  
  var content: `324`
  
  var headers: Link
}
object Content324 {
  
  inline def apply(content: `324`, headers: Link): Content324 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content324]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content324] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `324`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
