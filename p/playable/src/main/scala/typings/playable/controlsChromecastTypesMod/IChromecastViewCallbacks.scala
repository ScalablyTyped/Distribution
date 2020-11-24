package typings.playable.controlsChromecastTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChromecastViewCallbacks extends js.Object {
  
  var onButtonClick: js.Function = js.native
}
object IChromecastViewCallbacks {
  
  @scala.inline
  def apply(onButtonClick: js.Function): IChromecastViewCallbacks = {
    val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChromecastViewCallbacks]
  }
  
  @scala.inline
  implicit class IChromecastViewCallbacksOps[Self <: IChromecastViewCallbacks] (val x: Self) extends AnyVal {
    
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
    def setOnButtonClick(value: js.Function): Self = this.set("onButtonClick", value.asInstanceOf[js.Any])
  }
}
