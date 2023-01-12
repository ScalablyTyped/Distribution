package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `392` extends StObject {
  
  var message: String | Null
}
object `392` {
  
  inline def apply(): `392` = {
    val __obj = js.Dynamic.literal(message = null)
    __obj.asInstanceOf[`392`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `392`] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
  }
}
