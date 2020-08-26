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
@js.native
trait LocationIdentifier extends js.Object {
  /**
    * The location's unique ID.
    *
    * For `Room` type, it's the room's email address.
    *
    * For `Custom` type, it's the `displayName`.
    */
  var id: String = js.native
  /**
    * The location's type.
    */
  var `type`: LocationType | String = js.native
}

object LocationIdentifier {
  @scala.inline
  def apply(id: String, `type`: LocationType | String): LocationIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdentifier]
  }
  @scala.inline
  implicit class LocationIdentifierOps[Self <: LocationIdentifier] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LocationType | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

