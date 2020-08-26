package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoPreventDefault extends js.Object {
  var autoPreventDefault: js.UndefOr[Boolean] = js.native
  var interactionFrequency: js.UndefOr[Double] = js.native
  var useSystemTicker: js.UndefOr[Double] = js.native
}

object AutoPreventDefault {
  @scala.inline
  def apply(): AutoPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPreventDefault]
  }
  @scala.inline
  implicit class AutoPreventDefaultOps[Self <: AutoPreventDefault] (val x: Self) extends AnyVal {
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
    def setAutoPreventDefault(value: Boolean): Self = this.set("autoPreventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPreventDefault: Self = this.set("autoPreventDefault", js.undefined)
    @scala.inline
    def setInteractionFrequency(value: Double): Self = this.set("interactionFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionFrequency: Self = this.set("interactionFrequency", js.undefined)
    @scala.inline
    def setUseSystemTicker(value: Double): Self = this.set("useSystemTicker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSystemTicker: Self = this.set("useSystemTicker", js.undefined)
  }
  
}

