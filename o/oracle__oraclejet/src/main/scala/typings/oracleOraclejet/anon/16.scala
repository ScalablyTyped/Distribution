package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `16`[K] extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null = js.native
}

object `16` {
  @scala.inline
  def apply[K](): `16`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[K]]
  }
  @scala.inline
  implicit class `16Ops`[Self <: `16`[_], K] (val x: Self with `16`[K]) extends AnyVal {
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
    def setRenderer(value: /* context */ TooltipContext[K] => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
  }
  
}

