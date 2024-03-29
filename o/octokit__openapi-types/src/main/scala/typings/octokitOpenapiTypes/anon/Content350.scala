package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content350 extends StObject {
  
  var content: `350`
  
  var headers: Link
}
object Content350 {
  
  inline def apply(content: `350`, headers: Link): Content350 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content350]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content350] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `350`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
