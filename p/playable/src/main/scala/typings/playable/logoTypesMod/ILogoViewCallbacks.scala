package typings.playable.logoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogoViewCallbacks extends js.Object {
  
  def onLogoClick(): Unit = js.native
}
object ILogoViewCallbacks {
  
  @scala.inline
  def apply(onLogoClick: () => Unit): ILogoViewCallbacks = {
    val __obj = js.Dynamic.literal(onLogoClick = js.Any.fromFunction0(onLogoClick))
    __obj.asInstanceOf[ILogoViewCallbacks]
  }
  
  @scala.inline
  implicit class ILogoViewCallbacksOps[Self <: ILogoViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnLogoClick(value: () => Unit): Self = this.set("onLogoClick", js.Any.fromFunction0(value))
  }
}
