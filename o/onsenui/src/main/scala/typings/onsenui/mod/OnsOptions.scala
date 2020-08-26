package typings.onsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnsOptions extends js.Object {
  var parentScope: js.UndefOr[js.Object] = js.native
}

object OnsOptions {
  @scala.inline
  def apply(): OnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnsOptions]
  }
  @scala.inline
  implicit class OnsOptionsOps[Self <: OnsOptions] (val x: Self) extends AnyVal {
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
    def setParentScope(value: js.Object): Self = this.set("parentScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentScope: Self = this.set("parentScope", js.undefined)
  }
  
}

