package typings.mendixmodelsdk.distSdkInternalDeltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IElementDelta extends IDelta {
  var elementId: String
}

object IElementDelta {
  @scala.inline
  def apply(elementId: String, unitId: String): IElementDelta = {
    val __obj = js.Dynamic.literal(elementId = elementId, unitId = unitId)
  
    __obj.asInstanceOf[IElementDelta]
  }
}

