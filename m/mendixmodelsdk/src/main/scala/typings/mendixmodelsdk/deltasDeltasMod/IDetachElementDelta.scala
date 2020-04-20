package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetachElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: DETACH_ELEMENT
}

object IDetachElementDelta {
  @scala.inline
  def apply(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetachElementDelta]
  }
}

