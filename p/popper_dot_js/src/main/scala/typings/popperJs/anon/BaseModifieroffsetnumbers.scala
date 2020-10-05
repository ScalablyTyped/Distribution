package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  offset :number | string | undefined} */
@js.native
trait BaseModifieroffsetnumbers extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var offset: js.UndefOr[Double | String] = js.native
  var order: js.UndefOr[Double] = js.native
}

object BaseModifieroffsetnumbers {
  @scala.inline
  def apply(): BaseModifieroffsetnumbers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifieroffsetnumbers]
  }
  @scala.inline
  implicit class BaseModifieroffsetnumbersOps[Self <: BaseModifieroffsetnumbers] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

