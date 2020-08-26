package typings.preact.jsxMod.JSXInternal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicAttributes extends js.Object {
  var key: js.UndefOr[js.Any] = js.native
}

object IntrinsicAttributes {
  @scala.inline
  def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  @scala.inline
  implicit class IntrinsicAttributesOps[Self <: IntrinsicAttributes] (val x: Self) extends AnyVal {
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
    def setKey(value: js.Any): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

