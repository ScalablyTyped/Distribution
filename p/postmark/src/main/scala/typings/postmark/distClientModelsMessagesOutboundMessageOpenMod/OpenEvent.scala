package typings.postmark.distClientModelsMessagesOutboundMessageOpenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenEvent extends js.Object {
  var Client: ClientDetails
  var Geo: GeoLocation
  var MessageID: String
  var MessageStream: String
  var OS: ClientDetails
  var Platform: String
  var ReadSeconds: Double
  var ReceivedAt: String
  var Recipient: String
  var RecordType: String
  var Tag: String
  var UserAgent: String
}

object OpenEvent {
  @scala.inline
  def apply(
    Client: ClientDetails,
    Geo: GeoLocation,
    MessageID: String,
    MessageStream: String,
    OS: ClientDetails,
    Platform: String,
    ReadSeconds: Double,
    ReceivedAt: String,
    Recipient: String,
    RecordType: String,
    Tag: String,
    UserAgent: String
  ): OpenEvent = {
    val __obj = js.Dynamic.literal(Client = Client, Geo = Geo, MessageID = MessageID, MessageStream = MessageStream, OS = OS, Platform = Platform, ReadSeconds = ReadSeconds, ReceivedAt = ReceivedAt, Recipient = Recipient, RecordType = RecordType, Tag = Tag, UserAgent = UserAgent)
  
    __obj.asInstanceOf[OpenEvent]
  }
}

