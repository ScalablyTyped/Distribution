package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content719 extends StObject {
  
  var content: `719`
  
  var headers: LinkString
}
object Content719 {
  
  inline def apply(content: `719`, headers: LinkString): Content719 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content719]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content719] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `719`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
