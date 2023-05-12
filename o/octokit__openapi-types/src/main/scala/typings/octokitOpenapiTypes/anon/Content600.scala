package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content600 extends StObject {
  
  var content: `600`
  
  var headers: LinkString
}
object Content600 {
  
  inline def apply(content: `600`, headers: LinkString): Content600 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content600]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content600] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `600`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
