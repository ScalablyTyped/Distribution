package typings.playable.topBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopBlockViewConfig extends js.Object {
  
  var callbacks: ITopBlockViewCallbacks = js.native
  
  var elements: ITopBlockViewElements = js.native
}
object ITopBlockViewConfig {
  
  @scala.inline
  def apply(callbacks: ITopBlockViewCallbacks, elements: ITopBlockViewElements): ITopBlockViewConfig = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopBlockViewConfig]
  }
  
  @scala.inline
  implicit class ITopBlockViewConfigOps[Self <: ITopBlockViewConfig] (val x: Self) extends AnyVal {
    
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
    def setCallbacks(value: ITopBlockViewCallbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: ITopBlockViewElements): Self = this.set("elements", value.asInstanceOf[js.Any])
  }
}
