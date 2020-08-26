package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceReference extends js.Object {
  // The item's unique identifier.
  var id: js.UndefOr[String] = js.native
  // A string value that can be used to classify the item, such as 'microsoft.graph.driveItem'
  var `type`: js.UndefOr[String] = js.native
  // A URL leading to the referenced item.
  var webUrl: js.UndefOr[String] = js.native
}

object ResourceReference {
  @scala.inline
  def apply(): ResourceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceReference]
  }
  @scala.inline
  implicit class ResourceReferenceOps[Self <: ResourceReference] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
  
}

