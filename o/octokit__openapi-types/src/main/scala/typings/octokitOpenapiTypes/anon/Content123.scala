package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content123 extends StObject {
  
  var content: `123`
}
object Content123 {
  
  inline def apply(content: `123`): Content123 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content123]
  }
  
  extension [Self <: Content123](x: Self) {
    
    inline def setContent(value: `123`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
