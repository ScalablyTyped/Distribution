package typings.nativeToast.mod

import typings.nativeToast.nativeToastStrings.`north-east`
import typings.nativeToast.nativeToastStrings.`north-west`
import typings.nativeToast.nativeToastStrings.`south-east`
import typings.nativeToast.nativeToastStrings.`south-west`
import typings.nativeToast.nativeToastStrings.center
import typings.nativeToast.nativeToastStrings.east
import typings.nativeToast.nativeToastStrings.error
import typings.nativeToast.nativeToastStrings.info
import typings.nativeToast.nativeToastStrings.north
import typings.nativeToast.nativeToastStrings.south
import typings.nativeToast.nativeToastStrings.success
import typings.nativeToast.nativeToastStrings.warning
import typings.nativeToast.nativeToastStrings.west
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastOptions extends js.Object {
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var edge: js.UndefOr[Boolean] = js.native
  
  var el: js.UndefOr[HTMLElement] = js.native
  
  var elements: js.UndefOr[js.Array[HTMLElement]] = js.native
  
  var icon: js.UndefOr[Boolean] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[
    center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
  ] = js.native
  
  var rounded: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[success | warning | info | error] = js.native
}
object ToastOptions {
  
  @scala.inline
  def apply(): ToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setEdge(value: Boolean): Self = this.set("edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: HTMLElement*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[HTMLElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    
    @scala.inline
    def setIcon(value: Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setPosition(
      value: center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setType(value: success | warning | info | error): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
