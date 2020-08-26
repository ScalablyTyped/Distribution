package typings.openfin.utilEntityTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityTypeHelpers extends js.Object {
  var isExternal: Boolean = js.native
  var isFrame: Boolean = js.native
  var isView: Boolean = js.native
  var isWindow: Boolean = js.native
}

object EntityTypeHelpers {
  @scala.inline
  def apply(isExternal: Boolean, isFrame: Boolean, isView: Boolean, isWindow: Boolean): EntityTypeHelpers = {
    val __obj = js.Dynamic.literal(isExternal = isExternal.asInstanceOf[js.Any], isFrame = isFrame.asInstanceOf[js.Any], isView = isView.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypeHelpers]
  }
  @scala.inline
  implicit class EntityTypeHelpersOps[Self <: EntityTypeHelpers] (val x: Self) extends AnyVal {
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
    def setIsExternal(value: Boolean): Self = this.set("isExternal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFrame(value: Boolean): Self = this.set("isFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsView(value: Boolean): Self = this.set("isView", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWindow(value: Boolean): Self = this.set("isWindow", value.asInstanceOf[js.Any])
  }
  
}

