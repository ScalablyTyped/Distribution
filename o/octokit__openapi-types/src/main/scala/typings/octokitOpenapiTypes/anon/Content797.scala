package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content797 extends StObject {
  
  var content: `797`
  
  var headers: LinkString
}
object Content797 {
  
  inline def apply(content: `797`, headers: LinkString): Content797 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content797]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content797] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `797`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
