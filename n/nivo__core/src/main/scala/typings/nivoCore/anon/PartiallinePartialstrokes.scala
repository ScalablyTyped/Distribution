package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line :std.Partial<{  stroke :string,   strokeWidth :number,   strokeOpacity :number,   strokeDasharray :string}>}> */
@js.native
trait PartiallinePartialstrokes extends js.Object {
  var line: js.UndefOr[Partialstrokestringstroke] = js.native
}

object PartiallinePartialstrokes {
  @scala.inline
  def apply(): PartiallinePartialstrokes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialstrokes]
  }
  @scala.inline
  implicit class PartiallinePartialstrokesOps[Self <: PartiallinePartialstrokes] (val x: Self) extends AnyVal {
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
    def setLine(value: Partialstrokestringstroke): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

