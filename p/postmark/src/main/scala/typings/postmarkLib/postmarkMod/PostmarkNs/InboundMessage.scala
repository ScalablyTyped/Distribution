package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboundMessage extends InboundMessageBase {
  var BlockedReason: js.UndefOr[java.lang.String] = js.undefined
  var Headers: js.Array[PostmarkMessageHeader]
  var HtmlBody: java.lang.String
  var MessageEvents: js.Array[MessageEvents]
  var TextBody: java.lang.String
}

