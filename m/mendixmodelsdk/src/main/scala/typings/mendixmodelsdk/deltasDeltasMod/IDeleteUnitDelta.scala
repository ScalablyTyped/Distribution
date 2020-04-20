package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_UNIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteUnitDelta
  extends IDelta
     with Delta {
  var deltaType: DELETE_UNIT
}

object IDeleteUnitDelta {
  @scala.inline
  def apply(deltaType: DELETE_UNIT, unitId: String): IDeleteUnitDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteUnitDelta]
  }
}

