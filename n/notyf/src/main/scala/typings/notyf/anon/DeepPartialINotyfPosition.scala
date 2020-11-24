package typings.notyf.anon

import typings.notyf.notyfOptionsMod.DeepPartial
import typings.notyf.notyfOptionsMod.NotyfHorizontalPosition
import typings.notyf.notyfOptionsMod.NotyfVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined notyf.notyf/notyf.options.DeepPartial<notyf.notyf/notyf.options.INotyfPosition> */
@js.native
trait DeepPartialINotyfPosition extends js.Object {
  
  var x: js.UndefOr[DeepPartial[NotyfHorizontalPosition]] = js.native
  
  var y: js.UndefOr[DeepPartial[NotyfVerticalPosition]] = js.native
}
object DeepPartialINotyfPosition {
  
  @scala.inline
  def apply(): DeepPartialINotyfPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeepPartialINotyfPosition]
  }
  
  @scala.inline
  implicit class DeepPartialINotyfPositionOps[Self <: DeepPartialINotyfPosition] (val x: Self) extends AnyVal {
    
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
    def setX(value: DeepPartial[NotyfHorizontalPosition]): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: DeepPartial[NotyfVerticalPosition]): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
