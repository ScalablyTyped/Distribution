package typings.plottable.renderPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRenderPolicy extends js.Object {
  def render(): js.Any = js.native
}

object IRenderPolicy {
  @scala.inline
  def apply(render: () => js.Any): IRenderPolicy = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[IRenderPolicy]
  }
  @scala.inline
  implicit class IRenderPolicyOps[Self <: IRenderPolicy] (val x: Self) extends AnyVal {
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
    def setRender(value: () => js.Any): Self = this.set("render", js.Any.fromFunction0(value))
  }
  
}

