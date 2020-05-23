package typings.onfleetNodeOnfleet.recipientsMod

import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRecipientProps extends js.Object {
  var metadata: js.UndefOr[js.Array[OnfleetMetadata]] = js.undefined
  var name: String
  var notes: js.UndefOr[String] = js.undefined
  var phone: String
  var skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined
  var skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
}

object CreateRecipientProps {
  @scala.inline
  def apply(
    name: String,
    phone: String,
    metadata: js.Array[OnfleetMetadata] = null,
    notes: String = null,
    skipPhoneNumberValidation: js.UndefOr[Boolean] = js.undefined,
    skipSMSNotifications: js.UndefOr[Boolean] = js.undefined
  ): CreateRecipientProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(skipPhoneNumberValidation)) __obj.updateDynamic("skipPhoneNumberValidation")(skipPhoneNumberValidation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSMSNotifications)) __obj.updateDynamic("skipSMSNotifications")(skipSMSNotifications.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientProps]
  }
}

