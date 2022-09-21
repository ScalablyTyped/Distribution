package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content5 extends StObject {
  
  var content: `5`
}
object Content5 {
  
  inline def apply(content: `5`): Content5 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content5]
  }
  
  extension [Self <: Content5](x: Self) {
    
    inline def setContent(value: `5`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
