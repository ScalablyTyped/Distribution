package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content27 extends StObject {
  
  var content: `27`
  
  var headers: Link
}
object Content27 {
  
  inline def apply(content: `27`, headers: Link): Content27 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content27]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content27] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `27`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
