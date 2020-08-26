package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremisesProvisioningError extends js.Object {
  /**
    * Category of the provisioning error. Note: Currently, there is only one possible value. Possible value: PropertyConflict
    * - indicates a property value is not unique. Other objects contain the same value for the property.
    */
  var category: js.UndefOr[String] = js.native
  // The date and time at which the error occurred.
  var occurredDateTime: js.UndefOr[String] = js.native
  // Name of the directory property causing the error. Current possible values: UserPrincipalName or ProxyAddress
  var propertyCausingError: js.UndefOr[String] = js.native
  // Value of the property causing the error.
  var value: js.UndefOr[String] = js.native
}

object OnPremisesProvisioningError {
  @scala.inline
  def apply(): OnPremisesProvisioningError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesProvisioningError]
  }
  @scala.inline
  implicit class OnPremisesProvisioningErrorOps[Self <: OnPremisesProvisioningError] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setOccurredDateTime(value: String): Self = this.set("occurredDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurredDateTime: Self = this.set("occurredDateTime", js.undefined)
    @scala.inline
    def setPropertyCausingError(value: String): Self = this.set("propertyCausingError", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyCausingError: Self = this.set("propertyCausingError", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

