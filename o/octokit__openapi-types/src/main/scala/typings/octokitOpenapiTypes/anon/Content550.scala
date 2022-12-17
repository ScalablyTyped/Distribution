package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content550 extends StObject {
  
  var content: `550`
}
object Content550 {
  
  inline def apply(content: `550`): Content550 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content550]
  }
  
  extension [Self <: Content550](x: Self) {
    
    inline def setContent(value: `550`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
