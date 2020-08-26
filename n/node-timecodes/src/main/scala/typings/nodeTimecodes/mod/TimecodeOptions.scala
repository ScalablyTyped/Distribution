package typings.nodeTimecodes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimecodeOptions extends js.Object {
  var frameRate: js.UndefOr[Double] = js.native
  var ms: js.UndefOr[Boolean] = js.native
}

object TimecodeOptions {
  @scala.inline
  def apply(): TimecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimecodeOptions]
  }
  @scala.inline
  implicit class TimecodeOptionsOps[Self <: TimecodeOptions] (val x: Self) extends AnyVal {
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
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setMs(value: Boolean): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMs: Self = this.set("ms", js.undefined)
  }
  
}

