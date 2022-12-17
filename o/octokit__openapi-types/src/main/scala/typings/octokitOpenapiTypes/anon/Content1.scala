package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content1 extends StObject {
  
  var content: `1`
}
object Content1 {
  
  inline def apply(content: `1`): Content1 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content1]
  }
  
  extension [Self <: Content1](x: Self) {
    
    inline def setContent(value: `1`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
