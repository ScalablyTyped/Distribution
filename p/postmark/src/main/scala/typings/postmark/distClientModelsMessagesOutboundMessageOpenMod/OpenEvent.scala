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
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], Geo = Geo.asInstanceOf[js.Any], MessageID = MessageID.asInstanceOf[js.Any], MessageStream = MessageStream.asInstanceOf[js.Any], OS = OS.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any], ReadSeconds = ReadSeconds.asInstanceOf[js.Any], ReceivedAt = ReceivedAt.asInstanceOf[js.Any], Recipient = Recipient.asInstanceOf[js.Any], RecordType = RecordType.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenEvent]
  }
}

