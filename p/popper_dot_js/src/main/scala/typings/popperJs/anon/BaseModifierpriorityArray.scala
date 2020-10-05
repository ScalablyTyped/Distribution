package typings.popperJs.anon

import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority :std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   escapeWithReference :boolean | undefined} */
@js.native
trait BaseModifierpriorityArray extends js.Object {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var escapeWithReference: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var order: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double | Padding] = js.native
  var priority: js.UndefOr[js.Array[Position]] = js.native
}

object BaseModifierpriorityArray {
  @scala.inline
  def apply(): BaseModifierpriorityArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifierpriorityArray]
  }
  @scala.inline
  implicit class BaseModifierpriorityArrayOps[Self <: BaseModifierpriorityArray] (val x: Self) extends AnyVal {
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
    def setBoundariesElement(value: Boundary | Element): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundariesElement: Self = this.set("boundariesElement", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setEscapeWithReference(value: Boolean): Self = this.set("escapeWithReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeWithReference: Self = this.set("escapeWithReference", js.undefined)
    @scala.inline
    def setFn(value: (/* data */ Data, /* options */ js.Object) => Data): Self = this.set("fn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPadding(value: Double | Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPriorityVarargs(value: Position*): Self = this.set("priority", js.Array(value :_*))
    @scala.inline
    def setPriority(value: js.Array[Position]): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

