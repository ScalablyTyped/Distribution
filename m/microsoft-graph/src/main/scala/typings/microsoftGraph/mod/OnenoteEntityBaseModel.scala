package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteEntityBaseModel extends Entity {
  // The endpoint where you can get details about the page. Read-only.
  var self: js.UndefOr[String] = js.native
}

object OnenoteEntityBaseModel {
  @scala.inline
  def apply(): OnenoteEntityBaseModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteEntityBaseModel]
  }
  @scala.inline
  implicit class OnenoteEntityBaseModelOps[Self <: OnenoteEntityBaseModel] (val x: Self) extends AnyVal {
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
    def setSelf(value: String): Self = this.set("self", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelf: Self = this.set("self", js.undefined)
  }
  
}

