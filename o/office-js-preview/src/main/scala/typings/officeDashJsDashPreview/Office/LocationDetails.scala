package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationDetails extends js.Object {
  /**
    * The location's display name.
    */
  var displayName: String
  /**
    * The email address associated with the location.
    */
  var emailAddress: String
  /**
    * The LocationIdentifier of the location.
    */
  var locationIdentifier: LocationIdentifier
}

object LocationDetails {
  @scala.inline
  def apply(displayName: String, emailAddress: String, locationIdentifier: LocationIdentifier): LocationDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locationIdentifier = locationIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationDetails]
  }
}

