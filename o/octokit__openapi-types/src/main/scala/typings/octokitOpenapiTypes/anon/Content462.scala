package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content462 extends StObject {
  
  var content: `462`
  
  var headers: Link
}
object Content462 {
  
  inline def apply(content: `462`, headers: Link): Content462 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content462]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content462] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `462`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
