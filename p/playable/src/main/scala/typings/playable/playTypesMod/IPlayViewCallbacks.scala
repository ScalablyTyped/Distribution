package typings.playable.playTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayViewCallbacks extends js.Object {
  
  def onButtonClick(): Unit = js.native
}
object IPlayViewCallbacks {
  
  @scala.inline
  def apply(onButtonClick: () => Unit): IPlayViewCallbacks = {
    val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
    __obj.asInstanceOf[IPlayViewCallbacks]
  }
  
  @scala.inline
  implicit class IPlayViewCallbacksOps[Self <: IPlayViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnButtonClick(value: () => Unit): Self = this.set("onButtonClick", js.Any.fromFunction0(value))
  }
}
