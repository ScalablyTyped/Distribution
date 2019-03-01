package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventDetails extends js.Object {
  var BounceID: js.UndefOr[java.lang.String] = js.undefined
  var ClickLocation: js.UndefOr[java.lang.String] = js.undefined
  var DeliveryMessage: js.UndefOr[java.lang.String] = js.undefined
  var DestinationIP: js.UndefOr[java.lang.String] = js.undefined
  var DestinationServer: js.UndefOr[java.lang.String] = js.undefined
  var Link: js.UndefOr[java.lang.String] = js.undefined
  var Summary: js.UndefOr[java.lang.String] = js.undefined
}

object MessageEventDetails {
  @scala.inline
  def apply(
    BounceID: java.lang.String = null,
    ClickLocation: java.lang.String = null,
    DeliveryMessage: java.lang.String = null,
    DestinationIP: java.lang.String = null,
    DestinationServer: java.lang.String = null,
    Link: java.lang.String = null,
    Summary: java.lang.String = null
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

