package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content259 extends StObject {
  
  var content: `259`
  
  var headers: Link
}
object Content259 {
  
  inline def apply(content: `259`, headers: Link): Content259 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content259]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content259] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `259`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
