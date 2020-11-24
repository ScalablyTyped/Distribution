package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  element :string | std.Element | undefined} */
@js.native
trait BaseModifierelementstring extends js.Object {
  
  var element: js.UndefOr[String | Element] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fn: js.UndefOr[ModifierFn] = js.native
  
  var order: js.UndefOr[Double] = js.native
}
object BaseModifierelementstring {
  
  @scala.inline
  def apply(): BaseModifierelementstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifierelementstring]
  }
  
  @scala.inline
  implicit class BaseModifierelementstringOps[Self <: BaseModifierelementstring] (val x: Self) extends AnyVal {
    
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
    def setElement(value: String | Element): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = this.set("fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
