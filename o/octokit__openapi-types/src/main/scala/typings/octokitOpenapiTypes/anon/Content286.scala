package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content286 extends StObject {
  
  var content: `286`
  
  var headers: Link
}
object Content286 {
  
  inline def apply(content: `286`, headers: Link): Content286 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content286]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content286] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `286`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
