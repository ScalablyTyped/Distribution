package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.VisualViewport
import typings.popperjsCore.typesMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper extends js.Object {
  
  var popper: js.Array[typings.std.Element | Window | VisualViewport] = js.native
  
  var reference: js.Array[typings.std.Element | Window | VisualViewport] = js.native
}
object Popper {
  
  @scala.inline
  def apply(
    popper: js.Array[typings.std.Element | Window | VisualViewport],
    reference: js.Array[typings.std.Element | Window | VisualViewport]
  ): Popper = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperOps[Self <: Popper] (val x: Self) extends AnyVal {
    
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
    def setPopperVarargs(value: (typings.std.Element | Window | VisualViewport)*): Self = this.set("popper", js.Array(value :_*))
    
    @scala.inline
    def setPopper(value: js.Array[typings.std.Element | Window | VisualViewport]): Self = this.set("popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceVarargs(value: (typings.std.Element | Window | VisualViewport)*): Self = this.set("reference", js.Array(value :_*))
    
    @scala.inline
    def setReference(value: js.Array[typings.std.Element | Window | VisualViewport]): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
}
