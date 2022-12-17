package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content64 extends StObject {
  
  var content: `64`
}
object Content64 {
  
  inline def apply(content: `64`): Content64 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content64]
  }
  
  extension [Self <: Content64](x: Self) {
    
    inline def setContent(value: `64`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
