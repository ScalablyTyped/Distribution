package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationDetails extends js.Object {
  /**
    * The location's display name.
    */
  var displayName: java.lang.String
  /**
    * The email address associated with the location.
    */
  var emailAddress: java.lang.String
  /**
    * The LocationIdentifier of the location.
    */
  var locationIdentifier: LocationIdentifier
}

object LocationDetails {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    emailAddress: java.lang.String,
    locationIdentifier: LocationIdentifier
  ): LocationDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName, emailAddress = emailAddress, locationIdentifier = locationIdentifier)
  
    __obj.asInstanceOf[LocationDetails]
  }
}

