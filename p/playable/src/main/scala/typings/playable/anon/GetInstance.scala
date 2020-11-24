package typings.playable.anon

import typings.playable.chomecastApiMockMod.CastContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstance extends js.Object {
  
  def getInstance(): CastContext = js.native
}
object GetInstance {
  
  @scala.inline
  def apply(getInstance: () => CastContext): GetInstance = {
    val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[GetInstance]
  }
  
  @scala.inline
  implicit class GetInstanceOps[Self <: GetInstance] (val x: Self) extends AnyVal {
    
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
    def setGetInstance(value: () => CastContext): Self = this.set("getInstance", js.Any.fromFunction0(value))
  }
}
