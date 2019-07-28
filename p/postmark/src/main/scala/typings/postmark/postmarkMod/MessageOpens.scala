package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOpens extends js.Object {
  var Client: VendorTrackingInfo
  var FirstOpen: Boolean
  var Geo: GeoTrackingInfo
  var MessageID: String
  var OS: VendorTrackingInfo
  var Platform: String
  var ReadSeconds: Double
  var ReceivedAt: String
  var Recipient: String
  var Tag: String
  var UserAgent: String
}

object MessageOpens {
  @scala.inline
  def apply(
    Client: VendorTrackingInfo,
    FirstOpen: Boolean,
    Geo: GeoTrackingInfo,
    MessageID: String,
    OS: VendorTrackingInfo,
    Platform: String,
    ReadSeconds: Double,
    ReceivedAt: String,
    Recipient: String,
    Tag: String,
    UserAgent: String
  ): MessageOpens = {
    val __obj = js.Dynamic.literal(Client = Client, FirstOpen = FirstOpen, Geo = Geo, MessageID = MessageID, OS = OS, Platform = Platform, ReadSeconds = ReadSeconds, ReceivedAt = ReceivedAt, Recipient = Recipient, Tag = Tag, UserAgent = UserAgent)
  
    __obj.asInstanceOf[MessageOpens]
  }
}

