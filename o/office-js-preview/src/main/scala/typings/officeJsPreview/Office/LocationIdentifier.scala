package typings.officeJsPreview.Office

import typings.officeJsPreview.Office.MailboxEnums.LocationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the ID of a location.
  *
  * [Api set: Mailbox 1.8]
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait LocationIdentifier extends js.Object {
  /**
    * The location's unique ID.
    *
    * For `Room` type, it's the room's email address.
    *
    * For `Custom` type, it's the `displayName`.
    */
  var id: String
  /**
    * The location's type.
    */
  var `type`: LocationType | String
}

object LocationIdentifier {
  @scala.inline
  def apply(id: String, `type`: LocationType | String): LocationIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdentifier]
  }
}

