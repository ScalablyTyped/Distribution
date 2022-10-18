package typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeleteUnitDelta
  extends StObject
     with IDelta
     with Delta {
  
  var deltaType: DELETE_UNIT
}
object IDeleteUnitDelta {
  
  inline def apply(unitId: String): IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DELETE_UNIT", unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteUnitDelta]
  }
  
  extension [Self <: IDeleteUnitDelta](x: Self) {
    
    inline def setDeltaType(value: DELETE_UNIT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
