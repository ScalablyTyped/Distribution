package typings.popperJs.anon

import typings.popperJs.mod.Popper.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arrow extends js.Object {
  var arrow: Left = js.native
  var popper: Offset = js.native
  var reference: Offset = js.native
}

object Arrow {
  @scala.inline
  def apply(arrow: Left, popper: Offset, reference: Offset): Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
  @scala.inline
  implicit class ArrowOps[Self <: Arrow] (val x: Self) extends AnyVal {
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
    def setArrow(value: Left): Self = this.set("arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopper(value: Offset): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: Offset): Self = this.set("reference", value.asInstanceOf[js.Any])
  }
  
}

