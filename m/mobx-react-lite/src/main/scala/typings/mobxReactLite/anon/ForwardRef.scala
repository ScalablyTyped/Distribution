package typings.mobxReactLite.anon

import typings.mobxReactLite.mobxReactLiteBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardRef extends js.Object {
  var forwardRef: `true` = js.native
}

object ForwardRef {
  @scala.inline
  def apply(forwardRef: `true`): ForwardRef = {
    val __obj = js.Dynamic.literal(forwardRef = forwardRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRef]
  }
  @scala.inline
  implicit class ForwardRefOps[Self <: ForwardRef] (val x: Self) extends AnyVal {
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
    def setForwardRef(value: `true`): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
  }
  
}

