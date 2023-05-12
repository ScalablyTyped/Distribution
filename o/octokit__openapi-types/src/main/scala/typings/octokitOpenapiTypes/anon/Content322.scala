package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content322 extends StObject {
  
  var content: `322`
  
  var headers: Link
}
object Content322 {
  
  inline def apply(content: `322`, headers: Link): Content322 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content322]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content322] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `322`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Link): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
