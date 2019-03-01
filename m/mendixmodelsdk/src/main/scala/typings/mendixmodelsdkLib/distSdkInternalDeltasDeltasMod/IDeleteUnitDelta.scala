package typings
package mendixmodelsdkLib.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteUnitDelta
  extends IDelta
     with Delta {
  var deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DELETE_UNIT
}

object IDeleteUnitDelta {
  @scala.inline
  def apply(deltaType: mendixmodelsdkLib.mendixmodelsdkLibStrings.DELETE_UNIT, unitId: java.lang.String): IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deltaType")(deltaType)
    __obj.updateDynamic("unitId")(unitId)
    __obj.asInstanceOf[IDeleteUnitDelta]
  }
}

