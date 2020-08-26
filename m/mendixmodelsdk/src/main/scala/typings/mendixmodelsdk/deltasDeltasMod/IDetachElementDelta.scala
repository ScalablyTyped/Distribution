package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetachElementDelta
  extends IElementDelta
     with Delta {
  var deltaType: DETACH_ELEMENT = js.native
}

object IDetachElementDelta {
  @scala.inline
  def apply(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetachElementDelta]
  }
  @scala.inline
  implicit class IDetachElementDeltaOps[Self <: IDetachElementDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeltaType(value: DETACH_ELEMENT): Self = this.set("deltaType", value.asInstanceOf[js.Any])
  }
  
}

