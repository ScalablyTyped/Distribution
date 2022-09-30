package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldValueType extends StObject {
  
  var oldValue: Any
  
  var `type`: remove
}
object OldValueType {
  
  inline def apply(oldValue: Any): OldValueType = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[OldValueType]
  }
  
  extension [Self <: OldValueType](x: Self) {
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
