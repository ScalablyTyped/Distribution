package typings.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "CreateSignatureRequest")
@js.native
class CreateSignatureRequest protected ()
  extends typings.postmark.signatureMod.CreateSignatureRequest {
  def this(name: String, fromEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String, returnPathDomain: String) = this()
}

