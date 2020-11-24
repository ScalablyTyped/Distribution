package typings.playable.debugPanelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDebugPanelViewConfig extends js.Object {
  
  var callbacks: IDebugPanelViewCallbacks = js.native
}
object IDebugPanelViewConfig {
  
  @scala.inline
  def apply(callbacks: IDebugPanelViewCallbacks): IDebugPanelViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugPanelViewConfig]
  }
  
  @scala.inline
  implicit class IDebugPanelViewConfigOps[Self <: IDebugPanelViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IDebugPanelViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
  }
}
