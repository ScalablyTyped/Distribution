package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `27`[K1, K2, K3, D1, D2, D3] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): Insert | PreventDefault = js.native
}

object `27` {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => Insert | PreventDefault): `27`[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`27`[K1, K2, K3, D1, D2, D3]]
  }
  @scala.inline
  implicit class `27Ops`[Self <: `27`[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (`27`[K1, K2, K3, D1, D2, D3])) extends AnyVal {
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
    def setRenderer(value: TooltipContext[K1, K2, K3, D1, D2, D3] => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
  
}

