package typings.postmark.outboundMessageClickMod

import typings.postmark.messageSupportingTypesMod.LinkClickLocation
import typings.postmark.outboundMessageOpenMod.ClientDetails
import typings.postmark.outboundMessageOpenMod.GeoLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvent extends js.Object {
  var ClickLocation: LinkClickLocation
  var Client: ClientDetails
  var Geo: GeoLocation
  var MessageID: String
  var MessageStream: String
  var OS: ClientDetails
  var OriginalLink: String
  var Platform: String
  var ReceivedAt: String
  var Recipient: String
  var RecordType: String
  var Tag: String
  var UserAgent: String
}

object ClickEvent {
  @scala.inline
  def apply(
    ClickLocation: LinkClickLocation,
    Client: ClientDetails,
    Geo: GeoLocation,
    MessageID: String,
    MessageStream: String,
    OS: ClientDetails,
    OriginalLink: String,
    Platform: String,
    ReceivedAt: String,
    Recipient: String,
    RecordType: String,
    Tag: String,
    UserAgent: String
  ): ClickEvent = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Client = Client.asInstanceOf[js.Any], Geo = Geo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], OriginalLink = OriginalLink.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClickEvent]
  }
}

