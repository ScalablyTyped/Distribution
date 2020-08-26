package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text :std.Partial<react.react.CSSProperties>}> */
@js.native
trait PartialtextPartialCSSProp extends js.Object {
  var text: js.UndefOr[PartialCSSProperties] = js.native
}

object PartialtextPartialCSSProp {
  @scala.inline
  def apply(): PartialtextPartialCSSProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialtextPartialCSSProp]
  }
  @scala.inline
  implicit class PartialtextPartialCSSPropOps[Self <: PartialtextPartialCSSProp] (val x: Self) extends AnyVal {
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
    def setText(value: PartialCSSProperties): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

