package typings.phoenixLiveView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaults extends js.Object {
  var debounce: js.UndefOr[Double] = js.native
  var throttle: js.UndefOr[Double] = js.native
}

object Defaults {
  @scala.inline
  def apply(): Defaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults]
  }
  @scala.inline
  implicit class DefaultsOps[Self <: Defaults] (val x: Self) extends AnyVal {
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
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
  
}

