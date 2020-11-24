package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `28`[K, D] extends js.Object {
  
  def renderer(context: NodeContentContext[K, D]): Insert = js.native
}
object `28` {
  
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => Insert): `28`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`28`[K, D]]
  }
  
  @scala.inline
  implicit class `28Ops`[Self <: `28`[_, _], K, D] (val x: Self with (`28`[K, D])) extends AnyVal {
    
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
    def setRenderer(value: NodeContentContext[K, D] => Insert): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
}
