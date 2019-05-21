package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the id of a location.
  * 
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
trait LocationIdentifier extends js.Object {
  /**
    * The location's unique id.
    * 
    * For **Room** type, it's the room's email address.
    * 
    * For **Custom** type, it's the displayName.
    */
  var id: java.lang.String
  /**
    * The location's type.
    */
  var `type`: officeDashJsLib.OfficeNs.MailboxEnumsNs.LocationType | java.lang.String
}

object LocationIdentifier {
  @scala.inline
  def apply(
    id: java.lang.String,
    `type`: officeDashJsLib.OfficeNs.MailboxEnumsNs.LocationType | java.lang.String
  ): LocationIdentifier = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdentifier]
  }
}

