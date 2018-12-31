package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessageBase extends MessageBase {
  var CcFull: js.Array[ExpandedEmail]
  var Date: java.lang.String
  var FromFull: ExpandedEmail
  var FromName: java.lang.String
  var MailboxHash: java.lang.String
  var OriginalRecipient: java.lang.String
  var ReplyTo: java.lang.String
  var To: java.lang.String
  var ToFull: js.Array[ExpandedEmail]
}

