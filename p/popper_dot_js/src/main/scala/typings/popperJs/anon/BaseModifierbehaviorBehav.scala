package typings.popperJs.anon

import typings.popperJs.mod.Popper.Behavior
import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position> | undefined,   padding :number | popper.js.popper.js.Popper.Padding | undefined,   boundariesElement :popper.js.popper.js.Popper.Boundary | std.Element | undefined,   flipVariations :boolean | undefined,   flipVariationsByContent :boolean | undefined} */
@js.native
trait BaseModifierbehaviorBehav extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.native
  var boundariesElement: js.UndefOr[Boundary | Element] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var flipVariations: js.UndefOr[Boolean] = js.native
  var flipVariationsByContent: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var order: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Double | Padding] = js.native
}

object BaseModifierbehaviorBehav {
  @scala.inline
  def apply(): BaseModifierbehaviorBehav = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifierbehaviorBehav]
  }
  @scala.inline
  implicit class BaseModifierbehaviorBehavOps[Self <: BaseModifierbehaviorBehav] (val x: Self) extends AnyVal {
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
    def setBehaviorVarargs(value: Position*): Self = this.set("behavior", js.Array(value :_*))
    @scala.inline
    def setBehavior(value: Behavior | js.Array[Position]): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setBoundariesElement(value: Boundary | Element): Self = this.set("boundariesElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundariesElement: Self = this.set("boundariesElement", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFlipVariations(value: Boolean): Self = this.set("flipVariations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVariations: Self = this.set("flipVariations", js.undefined)
    @scala.inline
    def setFlipVariationsByContent(value: Boolean): Self = this.set("flipVariationsByContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVariationsByContent: Self = this.set("flipVariationsByContent", js.undefined)
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
  }
  
}

