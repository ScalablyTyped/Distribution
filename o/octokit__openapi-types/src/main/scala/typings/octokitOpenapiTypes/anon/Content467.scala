package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content467 extends StObject {
  
  var content: `467`
  
  var headers: Link
}
object Content467 {
  
  inline def apply(content: `467`, headers: Link): Content467 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content467]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content467] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `467`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
