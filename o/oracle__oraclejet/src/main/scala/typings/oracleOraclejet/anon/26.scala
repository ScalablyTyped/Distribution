package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26`[K] extends js.Object {
  
  def renderer(context: TooltipContext[K]): Insert | PreventDefault = js.native
}
object `26` {
  
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => Insert | PreventDefault): `26`[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`26`[K]]
  }
  
  @scala.inline
  implicit class `26Ops`[Self <: `26`[_], K] (val x: Self with `26`[K]) extends AnyVal {
    
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
    def setRenderer(value: TooltipContext[K] => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
}
