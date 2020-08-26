package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  line :std.Partial<react.react.CSSProperties>}> */
@js.native
trait PartiallinePartialCSSProp extends js.Object {
  var line: js.UndefOr[PartialCSSProperties] = js.native
}

object PartiallinePartialCSSProp {
  @scala.inline
  def apply(): PartiallinePartialCSSProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialCSSProp]
  }
  @scala.inline
  implicit class PartiallinePartialCSSPropOps[Self <: PartiallinePartialCSSProp] (val x: Self) extends AnyVal {
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
    def setLine(value: PartialCSSProperties): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
  }
  
}

