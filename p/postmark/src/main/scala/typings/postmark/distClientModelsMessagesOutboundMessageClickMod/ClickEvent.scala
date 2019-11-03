package typings.postmark.distClientModelsMessagesOutboundMessageClickMod

import typings.postmark.distClientModelsMessageSupportingTypesMod.LinkClickLocation
import typings.postmark.distClientModelsMessagesOutboundMessageOpenMod.ClientDetails
import typings.postmark.distClientModelsMessagesOutboundMessageOpenMod.GeoLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEvent extends js.Object {
  var ClickLocation: LinkClickLocation
  var Client: ClientDetails
  var Geo: GeoLocation
  var MessageID: String
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
    OS: ClientDetails,
    OriginalLink: String,
    Platform: String,
    ReceivedAt: String,
    Recipient: String,
    RecordType: String,
    Tag: String,
    UserAgent: String
  ): ClickEvent = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation, Client = Client, Geo = Geo, MessageID = MessageID, OS = OS, OriginalLink = OriginalLink, Platform = Platform, ReceivedAt = ReceivedAt, Recipient = Recipient, RecordType = RecordType, Tag = Tag, UserAgent = UserAgent)
  
    __obj.asInstanceOf[ClickEvent]
  }
}

