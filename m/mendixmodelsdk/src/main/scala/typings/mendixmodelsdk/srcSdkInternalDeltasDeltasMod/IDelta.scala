package typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDelta extends StObject {
  
  /**
    * The ID of the unit (containing an element or property value) to which the delta is to be applied.
    */
  var unitId: String
}
object IDelta {
  
  inline def apply(unitId: String): IDelta = {
    val __obj = js.Dynamic.literal(unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDelta] (val x: Self) extends AnyVal {
    
    inline def setUnitId(value: String): Self = StObject.set(x, "unitId", value.asInstanceOf[js.Any])
  }
}
