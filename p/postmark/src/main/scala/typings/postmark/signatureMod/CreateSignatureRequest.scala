package typings.postmark.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/senders/Signature", "CreateSignatureRequest")
@js.native
class CreateSignatureRequest protected () extends js.Object {
  def this(name: String, fromEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: js.UndefOr[scala.Nothing], returnPathDomain: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String, returnPathDomain: String) = this()
  var FromEmail: String = js.native
  var Name: js.UndefOr[String] = js.native
  var ReplyToEmail: js.UndefOr[String] = js.native
  var ReturnPathDomain: js.UndefOr[String] = js.native
}

