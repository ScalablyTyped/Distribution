package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content635 extends StObject {
  
  var content: `635`
  
  var headers: LinkString
}
object Content635 {
  
  inline def apply(content: `635`, headers: LinkString): Content635 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content635]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content635] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `635`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
