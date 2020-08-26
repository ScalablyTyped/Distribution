package typings.monacoEditor.mod.languages

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldingMarkers extends js.Object {
  var end: RegExp = js.native
  var start: RegExp = js.native
}

object FoldingMarkers {
  @scala.inline
  def apply(end: RegExp, start: RegExp): FoldingMarkers = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingMarkers]
  }
  @scala.inline
  implicit class FoldingMarkersOps[Self <: FoldingMarkers] (val x: Self) extends AnyVal {
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
    def setEnd(value: RegExp): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: RegExp): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

