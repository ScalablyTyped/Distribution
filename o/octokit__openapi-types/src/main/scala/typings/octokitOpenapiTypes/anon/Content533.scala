package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content533 extends StObject {
  
  var content: `533`
  
  var headers: LinkString
}
object Content533 {
  
  inline def apply(content: `533`, headers: LinkString): Content533 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content533]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content533] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `533`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
