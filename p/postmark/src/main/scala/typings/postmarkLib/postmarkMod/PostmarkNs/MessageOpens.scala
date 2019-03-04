package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOpens extends js.Object {
  var Client: VendorTrackingInfo
  var FirstOpen: scala.Boolean
  var Geo: GeoTrackingInfo
  var MessageID: java.lang.String
  var OS: VendorTrackingInfo
  var Platform: java.lang.String
  var ReadSeconds: scala.Double
  var ReceivedAt: java.lang.String
  var Recipient: java.lang.String
  var Tag: java.lang.String
  var UserAgent: java.lang.String
}

object MessageOpens {
  @scala.inline
  def apply(
    Client: VendorTrackingInfo,
    FirstOpen: scala.Boolean,
    Geo: GeoTrackingInfo,
    MessageID: java.lang.String,
    OS: VendorTrackingInfo,
    Platform: java.lang.String,
    ReadSeconds: scala.Double,
    ReceivedAt: java.lang.String,
    Recipient: java.lang.String,
    Tag: java.lang.String,
    UserAgent: java.lang.String
  ): MessageOpens = {
    val __obj = js.Dynamic.literal(Client = Client, FirstOpen = FirstOpen, Geo = Geo, MessageID = MessageID, OS = OS, Platform = Platform, ReadSeconds = ReadSeconds, ReceivedAt = ReceivedAt, Recipient = Recipient, Tag = Tag, UserAgent = UserAgent)
  
    __obj.asInstanceOf[MessageOpens]
  }
}

