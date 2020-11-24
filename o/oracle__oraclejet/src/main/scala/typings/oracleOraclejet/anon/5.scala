package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5`[K1, K2, D1, D2] extends js.Object {
  
  def renderer(context: TooltipContext[K1, K2, D1, D2]): Insert | PreventDefault = js.native
}
object `5` {
  
  @scala.inline
  def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => Insert | PreventDefault): `5`[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`5`[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit class `5Ops`[Self <: `5`[_, _, _, _], K1, K2, D1, D2] (val x: Self with (`5`[K1, K2, D1, D2])) extends AnyVal {
    
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
    def setRenderer(value: TooltipContext[K1, K2, D1, D2] => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
}
