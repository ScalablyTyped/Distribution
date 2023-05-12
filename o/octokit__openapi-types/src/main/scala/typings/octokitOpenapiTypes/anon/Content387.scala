package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content387 extends StObject {
  
  var content: `387`
  
  var headers: Link
}
object Content387 {
  
  inline def apply(content: `387`, headers: Link): Content387 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content387]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content387] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `387`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
