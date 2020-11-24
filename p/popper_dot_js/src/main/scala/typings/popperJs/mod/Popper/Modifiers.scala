package typings.popperJs.mod.Popper

import org.scalablytyped.runtime.StringDictionary
import typings.popperJs.anon.BaseModifierbehaviorBehav
import typings.popperJs.anon.BaseModifierelementstring
import typings.popperJs.anon.BaseModifiergpuAccelerati
import typings.popperJs.anon.BaseModifieroffsetnumbers
import typings.popperJs.anon.BaseModifieronLoadFunctio
import typings.popperJs.anon.BaseModifierpriorityArray
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifiers
  extends /* name */ StringDictionary[js.UndefOr[BaseModifier with (Record[String, _])]] {
  
  var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.native
  
  var arrow: js.UndefOr[BaseModifierelementstring] = js.native
  
  var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.native
  
  var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.native
  
  var hide: js.UndefOr[BaseModifier] = js.native
  
  var inner: js.UndefOr[BaseModifier] = js.native
  
  var keepTogether: js.UndefOr[BaseModifier] = js.native
  
  var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.native
  
  var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.native
  
  var shift: js.UndefOr[BaseModifier] = js.native
}
object Modifiers {
  
  @scala.inline
  def apply(): Modifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifiers]
  }
  
  @scala.inline
  implicit class ModifiersOps[Self <: Modifiers] (val x: Self) extends AnyVal {
    
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
    def setApplyStyle(value: BaseModifieronLoadFunctio): Self = this.set("applyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyStyle: Self = this.set("applyStyle", js.undefined)
    
    @scala.inline
    def setArrow(value: BaseModifierelementstring): Self = this.set("arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrow: Self = this.set("arrow", js.undefined)
    
    @scala.inline
    def setComputeStyle(value: BaseModifiergpuAccelerati): Self = this.set("computeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeStyle: Self = this.set("computeStyle", js.undefined)
    
    @scala.inline
    def setFlip(value: BaseModifierbehaviorBehav): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setHide(value: BaseModifier): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setInner(value: BaseModifier): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setKeepTogether(value: BaseModifier): Self = this.set("keepTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepTogether: Self = this.set("keepTogether", js.undefined)
    
    @scala.inline
    def setOffset(value: BaseModifieroffsetnumbers): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPreventOverflow(value: BaseModifierpriorityArray): Self = this.set("preventOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOverflow: Self = this.set("preventOverflow", js.undefined)
    
    @scala.inline
    def setShift(value: BaseModifier): Self = this.set("shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
  }
}
