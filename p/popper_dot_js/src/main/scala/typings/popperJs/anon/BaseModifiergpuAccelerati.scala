package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.popperJsStrings.bottom
import typings.popperJs.popperJsStrings.left
import typings.popperJs.popperJsStrings.right
import typings.popperJs.popperJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration :boolean | undefined,   x :'bottom' | 'top' | undefined,   y :'left' | 'right' | undefined} */
@js.native
trait BaseModifiergpuAccelerati extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var fn: js.UndefOr[ModifierFn] = js.native
  var gpuAcceleration: js.UndefOr[Boolean] = js.native
  var order: js.UndefOr[Double] = js.native
  var x: js.UndefOr[bottom | top] = js.native
  var y: js.UndefOr[left | right] = js.native
}

object BaseModifiergpuAccelerati {
  @scala.inline
  def apply(): BaseModifiergpuAccelerati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseModifiergpuAccelerati]
  }
  @scala.inline
  implicit class BaseModifiergpuAcceleratiOps[Self <: BaseModifiergpuAccelerati] (val x: Self) extends AnyVal {
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
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setX(value: bottom | top): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: left | right): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

