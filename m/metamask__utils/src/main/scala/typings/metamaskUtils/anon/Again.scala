package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Again extends StObject {
  
  var again: Value
  
  var value: Boolean
}
object Again {
  
  inline def apply(again: Value, value: Boolean): Again = {
    val __obj = js.Dynamic.literal(again = again.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Again]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Again] (val x: Self) extends AnyVal {
    
    inline def setAgain(value: Value): Self = StObject.set(x, "again", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
