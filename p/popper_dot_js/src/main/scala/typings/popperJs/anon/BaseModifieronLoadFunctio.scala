package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  onLoad :std.Function | undefined,   gpuAcceleration :boolean | undefined} */
@js.native
trait BaseModifieronLoadFunctio extends js.Object {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fn: js.UndefOr[ModifierFn] = js.native
  
  var gpuAcceleration: js.UndefOr[Boolean] = js.native
  
  var onLoad: js.UndefOr[js.Function] = js.native
  
  var order: js.UndefOr[Double] = js.native
}
object BaseModifieronLoadFunctio {
  
  @scala.inline
  def apply(): BaseModifieronLoadFunctio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifieronLoadFunctio]
  }
  
  @scala.inline
  implicit class BaseModifieronLoadFunctioOps[Self <: BaseModifieronLoadFunctio] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = this.set("fn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    
    @scala.inline
    def setGpuAcceleration(value: Boolean): Self = this.set("gpuAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuAcceleration: Self = this.set("gpuAcceleration", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.Function): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
