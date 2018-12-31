package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkMessage extends js.Object {
  var Attachments: js.UndefOr[js.Array[PostmarkAttachment]] = js.undefined
  var Bcc: js.UndefOr[java.lang.String] = js.undefined
  var Cc: js.UndefOr[java.lang.String] = js.undefined
  var From: java.lang.String
  var HTMLBody: js.UndefOr[java.lang.String] = js.undefined
  var Headers: js.UndefOr[js.Array[PostmarkMessageHeader]] = js.undefined
  var ReplyTo: js.UndefOr[java.lang.String] = js.undefined
  var Subject: js.UndefOr[java.lang.String] = js.undefined
  var Tag: js.UndefOr[java.lang.String] = js.undefined
  var TextBody: js.UndefOr[java.lang.String] = js.undefined
  var To: java.lang.String
  var TrackLinks: js.UndefOr[java.lang.String] = js.undefined
  var TrackOpens: js.UndefOr[scala.Boolean] = js.undefined
}

