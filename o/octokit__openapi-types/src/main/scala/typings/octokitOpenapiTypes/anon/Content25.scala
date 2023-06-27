package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content25 extends StObject {
  
  var content: `25`
  
  var headers: Link
}
object Content25 {
  
  inline def apply(content: `25`, headers: Link): Content25 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content25]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content25] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `25`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
