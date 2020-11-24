package typings.nodeRedEditorClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancelable extends js.Object {
  
  var cancelable: js.UndefOr[Boolean] = js.native
  
  var updateMenu: js.UndefOr[Boolean] = js.native
}
object Cancelable {
  
  @scala.inline
  def apply(): Cancelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelable]
  }
  
  @scala.inline
  implicit class CancelableOps[Self <: Cancelable] (val x: Self) extends AnyVal {
    
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
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    
    @scala.inline
    def setUpdateMenu(value: Boolean): Self = this.set("updateMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMenu: Self = this.set("updateMenu", js.undefined)
  }
}
