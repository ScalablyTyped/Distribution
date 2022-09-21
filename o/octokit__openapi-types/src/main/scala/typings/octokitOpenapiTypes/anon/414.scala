package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `414` extends StObject {
  
  var message: String | Null
}
object `414` {
  
  inline def apply(): `414` = {
    val __obj = js.Dynamic.literal(message = null)
    __obj.asInstanceOf[`414`]
  }
  
  extension [Self <: `414`](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
  }
}
