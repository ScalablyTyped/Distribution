package typings.nivoCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  domain :std.Partial<{  line :std.Partial<react.react.CSSProperties>}>,   ticks :std.Partial<{  line :std.Partial<react.react.CSSProperties>,   text :std.Partial<react.react.CSSProperties>}>,   legend :std.Partial<{  text :std.Partial<react.react.CSSProperties>}>}> */
@js.native
trait PartialdomainPartiallineP extends js.Object {
  var domain: js.UndefOr[PartiallinePartialCSSProp] = js.native
  var legend: js.UndefOr[PartialtextPartialCSSProp] = js.native
  var ticks: js.UndefOr[PartiallinePartialCSSPropLine] = js.native
}

object PartialdomainPartiallineP {
  @scala.inline
  def apply(): PartialdomainPartiallineP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialdomainPartiallineP]
  }
  @scala.inline
  implicit class PartialdomainPartiallinePOps[Self <: PartialdomainPartiallineP] (val x: Self) extends AnyVal {
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
    def setDomain(value: PartiallinePartialCSSProp): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setLegend(value: PartialtextPartialCSSProp): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setTicks(value: PartiallinePartialCSSPropLine): Self = this.set("ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
  
}

