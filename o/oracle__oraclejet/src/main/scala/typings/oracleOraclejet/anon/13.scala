package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `13` extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}

object `13` {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `13` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`13`]
  }
  @scala.inline
  implicit class `13Ops`[Self <: `13`] (val x: Self) extends AnyVal {
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
    def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
  
}

