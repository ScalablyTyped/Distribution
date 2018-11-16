package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OutboundMessageBase extends MessageBase {
  var ReceivedAt: java.lang.String
  var Recipients: js.Array[java.lang.String]
  var To: js.Array[ExpandedEmail]
  var TrackLinks: java.lang.String
  var TrackOpens: scala.Boolean
}

