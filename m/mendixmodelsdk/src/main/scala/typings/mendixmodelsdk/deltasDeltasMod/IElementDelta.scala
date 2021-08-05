package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElementDelta
  extends StObject
     with IDelta {
  
  var elementId: String
}
object IElementDelta {
  
  inline def apply(elementId: String, unitId: String): IElementDelta = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElementDelta]
  }
  
  extension [Self <: IElementDelta](x: Self) {
    
    inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
  }
}
