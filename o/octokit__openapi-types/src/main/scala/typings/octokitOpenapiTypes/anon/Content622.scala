package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content622 extends StObject {
  
  var content: `622`
  
  var headers: LinkString
}
object Content622 {
  
  inline def apply(content: `622`, headers: LinkString): Content622 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content622]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content622] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `622`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
