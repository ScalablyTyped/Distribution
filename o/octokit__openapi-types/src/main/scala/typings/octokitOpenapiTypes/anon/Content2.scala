package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content2 extends StObject {
  
  var content: `2`
}
object Content2 {
  
  inline def apply(content: `2`): Content2 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content2]
  }
  
  extension [Self <: Content2](x: Self) {
    
    inline def setContent(value: `2`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
