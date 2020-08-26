package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenTypeExtension extends Entity {
  // A unique text identifier for an open type open extension. Required.
  var extensionName: js.UndefOr[String] = js.native
}

object OpenTypeExtension {
  @scala.inline
  def apply(): OpenTypeExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTypeExtension]
  }
  @scala.inline
  implicit class OpenTypeExtensionOps[Self <: OpenTypeExtension] (val x: Self) extends AnyVal {
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
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionName: Self = this.set("extensionName", js.undefined)
  }
  
}

