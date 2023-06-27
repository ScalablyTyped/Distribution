package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content379 extends StObject {
  
  var content: `379`
  
  var headers: Link
}
object Content379 {
  
  inline def apply(content: `379`, headers: Link): Content379 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content379]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content379] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `379`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
