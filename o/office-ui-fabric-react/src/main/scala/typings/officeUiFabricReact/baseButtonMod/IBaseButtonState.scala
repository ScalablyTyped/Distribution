package typings.officeUiFabricReact.baseButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseButtonState extends js.Object {
  
  var menuHidden: Boolean = js.native
}
object IBaseButtonState {
  
  @scala.inline
  def apply(menuHidden: Boolean): IBaseButtonState = {
    val __obj = js.Dynamic.literal(menuHidden = menuHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseButtonState]
  }
  
  @scala.inline
  implicit class IBaseButtonStateOps[Self <: IBaseButtonState] (val x: Self) extends AnyVal {
    
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
    def setMenuHidden(value: Boolean): Self = this.set("menuHidden", value.asInstanceOf[js.Any])
  }
}
