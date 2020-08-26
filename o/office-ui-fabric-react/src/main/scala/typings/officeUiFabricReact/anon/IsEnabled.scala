package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEnabled extends js.Object {
  var isEnabled: Boolean = js.native
  var rootTagName: String = js.native
}

object IsEnabled {
  @scala.inline
  def apply(isEnabled: Boolean, rootTagName: String): IsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], rootTagName = rootTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnabled]
  }
  @scala.inline
  implicit class IsEnabledOps[Self <: IsEnabled] (val x: Self) extends AnyVal {
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootTagName(value: String): Self = this.set("rootTagName", value.asInstanceOf[js.Any])
  }
  
}

