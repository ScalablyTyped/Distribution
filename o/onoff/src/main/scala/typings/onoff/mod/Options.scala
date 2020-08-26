package typings.onoff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var activeLow: js.UndefOr[Boolean] = js.native
  var debounceTimeout: js.UndefOr[Double] = js.native
  var reconfigureDirection: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setActiveLow(value: Boolean): Self = this.set("activeLow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveLow: Self = this.set("activeLow", js.undefined)
    @scala.inline
    def setDebounceTimeout(value: Double): Self = this.set("debounceTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounceTimeout: Self = this.set("debounceTimeout", js.undefined)
    @scala.inline
    def setReconfigureDirection(value: Boolean): Self = this.set("reconfigureDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconfigureDirection: Self = this.set("reconfigureDirection", js.undefined)
  }
  
}

