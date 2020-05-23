package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@onfleet/node-onfleet.@onfleet/node-onfleet/Resources/Recipients.CreateRecipientProps> */
trait PartialCreateRecipientPro extends js.Object {
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var phone: js.UndefOr[String] = js.undefined
  var skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined
  var skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
}

object PartialCreateRecipientPro {
  @scala.inline
  def apply(
    metadata: js.Array[OnfleetMetadata] = null,
    name: String = null,
    notes: String = null,
    phone: String = null,
    skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined,
    skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
  ): PartialCreateRecipientPro = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (phone != null) __obj.updateDynamic("phone")(phone.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPhoneNumberValidation)) __obj.updateDynamic("skipPhoneNumberValidation")(skipPhoneNumberValidation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSMSNotifications)) __obj.updateDynamic("skipSMSNotifications")(skipSMSNotifications.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateRecipientPro]
  }
}

