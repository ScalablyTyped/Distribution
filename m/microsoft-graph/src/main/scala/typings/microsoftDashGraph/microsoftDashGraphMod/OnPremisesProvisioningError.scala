package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremisesProvisioningError extends js.Object {
  /**
    * Category of the provisioning error. Note: Currently, there is only one possible value. Possible value: PropertyConflict
    * - indicates a property value is not unique. Other objects contain the same value for the property.
    */
  var category: js.UndefOr[String] = js.undefined
  // The date and time at which the error occurred.
  var occurredDateTime: js.UndefOr[String] = js.undefined
  // Name of the directory property causing the error. Current possible values: UserPrincipalName or ProxyAddress
  var propertyCausingError: js.UndefOr[String] = js.undefined
  // Value of the property causing the error.
  var value: js.UndefOr[String] = js.undefined
}

object OnPremisesProvisioningError {
  @scala.inline
  def apply(
    category: String = null,
    occurredDateTime: String = null,
    propertyCausingError: String = null,
    value: String = null
  ): OnPremisesProvisioningError = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (occurredDateTime != null) __obj.updateDynamic("occurredDateTime")(occurredDateTime)
    if (propertyCausingError != null) __obj.updateDynamic("propertyCausingError")(propertyCausingError)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OnPremisesProvisioningError]
  }
}

