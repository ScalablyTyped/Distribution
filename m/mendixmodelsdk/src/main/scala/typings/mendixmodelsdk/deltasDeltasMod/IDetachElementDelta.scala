package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDetachElementDelta
  extends StObject
     with IElementDelta
     with Delta {
  
  var deltaType: DETACH_ELEMENT
}
object IDetachElementDelta {
  
  inline def apply(elementId: String, unitId: String): IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DETACH_ELEMENT", elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetachElementDelta]
  }
  
  extension [Self <: IDetachElementDelta](x: Self) {
    
    inline def setDeltaType(value: DETACH_ELEMENT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
