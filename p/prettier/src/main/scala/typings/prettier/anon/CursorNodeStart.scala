package typings.prettier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CursorNodeStart extends js.Object {
  var cursorNodeStart: js.UndefOr[Double] = js.native
  var cursorNodeText: js.UndefOr[String] = js.native
  var formatted: String = js.native
}

object CursorNodeStart {
  @scala.inline
  def apply(formatted: String): CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorNodeStart]
  }
  @scala.inline
  implicit class CursorNodeStartOps[Self <: CursorNodeStart] (val x: Self) extends AnyVal {
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
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorNodeStart(value: Double): Self = this.set("cursorNodeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorNodeStart: Self = this.set("cursorNodeStart", js.undefined)
    @scala.inline
    def setCursorNodeText(value: String): Self = this.set("cursorNodeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorNodeText: Self = this.set("cursorNodeText", js.undefined)
  }
  
}

