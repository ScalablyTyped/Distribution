package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content512 extends StObject {
  
  var content: `512`
}
object Content512 {
  
  inline def apply(content: `512`): Content512 = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content512]
  }
  
  extension [Self <: Content512](x: Self) {
    
    inline def setContent(value: `512`): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
