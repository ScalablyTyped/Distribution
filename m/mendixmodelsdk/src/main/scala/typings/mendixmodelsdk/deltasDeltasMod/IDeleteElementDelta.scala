package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: DELETE_ELEMENT
}

object IDeleteElementDelta {
  @scala.inline
  def apply(deltaType: DELETE_ELEMENT, elementId: String, unitId: String): IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDeleteElementDelta]
  }
}

