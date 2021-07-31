package typings.mendixmodelsdk.deltasDeltasMod

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
  
  @scala.inline
  def apply(unitId: String): IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DELETE_UNIT", unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteUnitDelta]
  }
  
  @scala.inline
  implicit class IDeleteUnitDeltaMutableBuilder[Self <: IDeleteUnitDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaType(value: DELETE_UNIT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
