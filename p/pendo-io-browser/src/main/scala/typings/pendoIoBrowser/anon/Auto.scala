package typings.pendoIoBrowser.anon

import typings.pendoIoBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auto extends js.Object {
  var auto: js.Array[Guide] = js.native
  var `override`: js.Array[Guide] = js.native
}

object Auto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Auto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auto]
  }
  @scala.inline
  implicit class AutoOps[Self <: Auto] (val x: Self) extends AnyVal {
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
    def setAutoVarargs(value: Guide*): Self = this.set("auto", js.Array(value :_*))
    @scala.inline
    def setAuto(value: js.Array[Guide]): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrideVarargs(value: Guide*): Self = this.set("override", js.Array(value :_*))
    @scala.inline
    def setOverride(value: js.Array[Guide]): Self = this.set("override", value.asInstanceOf[js.Any])
  }
  
}

