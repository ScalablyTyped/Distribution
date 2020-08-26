package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationDetails extends js.Object {
  /**
    * The location's display name.
    */
  var displayName: String = js.native
  /**
    * The email address associated with the location.
    */
  var emailAddress: String = js.native
  /**
    * The `LocationIdentifier` of the location.
    */
  var locationIdentifier: LocationIdentifier = js.native
}

object LocationDetails {
  @scala.inline
  def apply(displayName: String, emailAddress: String, locationIdentifier: LocationIdentifier): LocationDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locationIdentifier = locationIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDetails]
  }
  @scala.inline
  implicit class LocationDetailsOps[Self <: LocationDetails] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationIdentifier(value: LocationIdentifier): Self = this.set("locationIdentifier", value.asInstanceOf[js.Any])
  }
  
}

