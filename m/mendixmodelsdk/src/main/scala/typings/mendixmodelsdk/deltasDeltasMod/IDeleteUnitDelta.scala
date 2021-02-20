package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeleteUnitDelta
  extends IDelta
     with Delta {
  
  var deltaType: DELETE_UNIT = js.native
}
object IDeleteUnitDelta {
  
  @scala.inline
  def apply(deltaType: DELETE_UNIT, unitId: String): IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteUnitDelta]
  }
  
  @scala.inline
  implicit class IDeleteUnitDeltaMutableBuilder[Self <: IDeleteUnitDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaType(value: DELETE_UNIT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
