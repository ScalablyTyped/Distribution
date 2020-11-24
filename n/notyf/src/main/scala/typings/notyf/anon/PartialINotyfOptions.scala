package typings.notyf.anon

import typings.notyf.notyfOptionsMod.INotyfPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<notyf.notyf/notyf.options.INotyfOptions> */
@js.native
trait PartialINotyfOptions extends js.Object {
  
  var dismissible: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[INotyfPosition] = js.native
  
  var ripple: js.UndefOr[Boolean] = js.native
  
  var types: js.UndefOr[js.Array[DeepPartialINotyfNotifica]] = js.native
}
object PartialINotyfOptions {
  
  @scala.inline
  def apply(): PartialINotyfOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINotyfOptions]
  }
  
  @scala.inline
  implicit class PartialINotyfOptionsOps[Self <: PartialINotyfOptions] (val x: Self) extends AnyVal {
    
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
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setPosition(value: INotyfPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: DeepPartialINotyfNotifica*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[DeepPartialINotyfNotifica]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
