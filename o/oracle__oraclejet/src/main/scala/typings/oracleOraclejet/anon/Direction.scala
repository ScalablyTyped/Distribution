package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var delay: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var duration: js.UndefOr[String] = js.native
  var offsetX: js.UndefOr[String] = js.native
  var offsetY: js.UndefOr[String] = js.native
  var persist: js.UndefOr[String] = js.native
  var timingFunction: js.UndefOr[String] = js.native
}

object Direction {
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setOffsetX(value: String): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    @scala.inline
    def setOffsetY(value: String): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    @scala.inline
    def setPersist(value: String): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    @scala.inline
    def setTimingFunction(value: String): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
  }
  
}

