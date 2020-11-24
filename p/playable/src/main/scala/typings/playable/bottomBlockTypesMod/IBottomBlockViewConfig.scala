package typings.playable.bottomBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBottomBlockViewConfig extends js.Object {
  
  var callbacks: IBottomBlockViewCallbacks = js.native
  
  var elements: IBottomBlockViewElements = js.native
}
object IBottomBlockViewConfig {
  
  @scala.inline
  def apply(callbacks: IBottomBlockViewCallbacks, elements: IBottomBlockViewElements): IBottomBlockViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBottomBlockViewConfig]
  }
  
  @scala.inline
  implicit class IBottomBlockViewConfigOps[Self <: IBottomBlockViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: IBottomBlockViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: IBottomBlockViewElements): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
}
