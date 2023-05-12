package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content87 extends StObject {
  
  var content: `87`
  
  var headers: Link
}
object Content87 {
  
  inline def apply(content: `87`, headers: Link): Content87 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content87]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content87] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `87`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
