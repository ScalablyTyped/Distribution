package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the id of a location.
  * 
  * [Api set: Mailbox Preview]
  *
  * @remarks
  * <table>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}</td><td>ReadItem</td></tr>
  *   <tr><td>{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}</td><td>Compose or Read</td></tr>
  * </table>
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
  var `type`: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.LocationType
}

object LocationIdentifier {
  @scala.inline
  def apply(id: java.lang.String, `type`: officeDashJsDashPreviewLib.OfficeNs.MailboxEnumsNs.LocationType): LocationIdentifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[LocationIdentifier]
  }
}

