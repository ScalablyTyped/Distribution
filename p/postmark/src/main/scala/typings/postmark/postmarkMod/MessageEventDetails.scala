package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventDetails extends js.Object {
  var BounceID: js.UndefOr[String] = js.undefined
  var ClickLocation: js.UndefOr[String] = js.undefined
  var DeliveryMessage: js.UndefOr[String] = js.undefined
  var DestinationIP: js.UndefOr[String] = js.undefined
  var DestinationServer: js.UndefOr[String] = js.undefined
  var Link: js.UndefOr[String] = js.undefined
  var Summary: js.UndefOr[String] = js.undefined
}

object MessageEventDetails {
  @scala.inline
  def apply(
    BounceID: String = null,
    ClickLocation: String = null,
    DeliveryMessage: String = null,
    DestinationIP: String = null,
    DestinationServer: String = null,
    Link: String = null,
    Summary: String = null
  ): MessageEventDetails = {
    val __obj = js.Dynamic.literal()
    if (BounceID != null) __obj.updateDynamic("BounceID")(BounceID)
    if (ClickLocation != null) __obj.updateDynamic("ClickLocation")(ClickLocation)
    if (DeliveryMessage != null) __obj.updateDynamic("DeliveryMessage")(DeliveryMessage)
    if (DestinationIP != null) __obj.updateDynamic("DestinationIP")(DestinationIP)
    if (DestinationServer != null) __obj.updateDynamic("DestinationServer")(DestinationServer)
    if (Link != null) __obj.updateDynamic("Link")(Link)
    if (Summary != null) __obj.updateDynamic("Summary")(Summary)
    __obj.asInstanceOf[MessageEventDetails]
  }
}

