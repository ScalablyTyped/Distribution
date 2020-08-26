package typings.nivoLegends.mod

import typings.nivoLegends.anon.PartialitemTextColorstrin
import typings.nivoLegends.nivoLegendsStrings.hover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendEffect extends js.Object {
  var on: hover = js.native
  var style: PartialitemTextColorstrin = js.native
}

object LegendEffect {
  @scala.inline
  def apply(on: hover, style: PartialitemTextColorstrin): LegendEffect = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendEffect]
  }
  @scala.inline
  implicit class LegendEffectOps[Self <: LegendEffect] (val x: Self) extends AnyVal {
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
    def setOn(value: hover): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: PartialitemTextColorstrin): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

