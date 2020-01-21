package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnenoteOperation extends Operation {
  // The error returned by the operation.
  var error: js.UndefOr[OnenoteOperationError] = js.undefined
  // The operation percent complete if the operation is still in running status
  var percentComplete: js.UndefOr[String] = js.undefined
  // The resource id.
  var resourceId: js.UndefOr[String] = js.undefined
  // The resource URI for the object. For example, the resource URI for a copied page or section.
  var resourceLocation: js.UndefOr[String] = js.undefined
}

object OnenoteOperation {
  @scala.inline
  def apply(
    createdDateTime: String = null,
    error: OnenoteOperationError = null,
    id: String = null,
    lastActionDateTime: String = null,
    percentComplete: String = null,
    resourceId: String = null,
    resourceLocation: String = null,
    status: OperationStatus = null
  ): OnenoteOperation = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime.asInstanceOf[js.Any])
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceLocation != null) __obj.updateDynamic("resourceLocation")(resourceLocation.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnenoteOperation]
  }
}

