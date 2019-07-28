package typings.microsoftDashGraph.microsoftDashGraphMod

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
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastActionDateTime != null) __obj.updateDynamic("lastActionDateTime")(lastActionDateTime)
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete)
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId)
    if (resourceLocation != null) __obj.updateDynamic("resourceLocation")(resourceLocation)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[OnenoteOperation]
  }
}

