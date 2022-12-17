package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content431Headers extends StObject {
  
  var content: `431`
}
object Content431Headers {
  
  inline def apply(content: `431`): Content431Headers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content431Headers]
  }
  
  extension [Self <: Content431Headers](x: Self) {
    
    inline def setContent(value: `431`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
