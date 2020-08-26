package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ template in moment-duration-format.moment-duration-format.moment.DurationTemplate ]: string} */
@js.native
trait DurationTimeDef extends js.Object {
  var HM: String = js.native
  var HMS: String = js.native
  var MS: String = js.native
}

object DurationTimeDef {
  @scala.inline
  def apply(HM: String, HMS: String, MS: String): DurationTimeDef = {
    val __obj = js.Dynamic.literal(HM = HM.asInstanceOf[js.Any], HMS = HMS.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationTimeDef]
  }
  @scala.inline
  implicit class DurationTimeDefOps[Self <: DurationTimeDef] (val x: Self) extends AnyVal {
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
    def setHM(value: String): Self = this.set("HM", value.asInstanceOf[js.Any])
    @scala.inline
    def setHMS(value: String): Self = this.set("HMS", value.asInstanceOf[js.Any])
    @scala.inline
    def setMS(value: String): Self = this.set("MS", value.asInstanceOf[js.Any])
  }
  
}

