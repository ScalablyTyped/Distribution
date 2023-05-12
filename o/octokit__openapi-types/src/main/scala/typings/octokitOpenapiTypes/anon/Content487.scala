package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content487 extends StObject {
  
  var content: `487`
  
  var headers: LinkString
}
object Content487 {
  
  inline def apply(content: `487`, headers: LinkString): Content487 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content487]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content487] (val x: Self) extends AnyVal {
    
    inline def setContent(value: `487`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: LinkString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
