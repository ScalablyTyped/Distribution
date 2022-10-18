package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content99 extends StObject {
  
  var content: `99`
}
object Content99 {
  
  inline def apply(content: `99`): Content99 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content99]
  }
  
  extension [Self <: Content99](x: Self) {
    
    inline def setContent(value: `99`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
