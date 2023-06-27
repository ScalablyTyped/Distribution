package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content495 extends StObject {
  
  var content: `495`
  
  var headers: Link
}
object Content495 {
  
  inline def apply(content: `495`, headers: Link): Content495 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content495]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content495] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `495`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
