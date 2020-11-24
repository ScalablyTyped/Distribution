package typings.playable.fullScreenTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFullScreenViewCallbacks extends js.Object {
  
  def onButtonClick(): Unit = js.native
}
object IFullScreenViewCallbacks {
  
  @scala.inline
  def apply(onButtonClick: () => Unit): IFullScreenViewCallbacks = {
    val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
    __obj.asInstanceOf[IFullScreenViewCallbacks]
  }
  
  @scala.inline
  implicit class IFullScreenViewCallbacksOps[Self <: IFullScreenViewCallbacks] (val x: Self) extends AnyVal {
    
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
