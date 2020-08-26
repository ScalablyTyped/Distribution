package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteOperation extends Operation {
  // The error returned by the operation.
  var error: js.UndefOr[OnenoteOperationError] = js.native
  // The operation percent complete if the operation is still in running status
  var percentComplete: js.UndefOr[String] = js.native
  // The resource id.
  var resourceId: js.UndefOr[String] = js.native
  // The resource URI for the object. For example, the resource URI for a copied page or section.
  var resourceLocation: js.UndefOr[String] = js.native
}

object OnenoteOperation {
  @scala.inline
  def apply(): OnenoteOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteOperation]
  }
  @scala.inline
  implicit class OnenoteOperationOps[Self <: OnenoteOperation] (val x: Self) extends AnyVal {
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
    def setError(value: OnenoteOperationError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setPercentComplete(value: String): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setResourceLocation(value: String): Self = this.set("resourceLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLocation: Self = this.set("resourceLocation", js.undefined)
  }
  
}

