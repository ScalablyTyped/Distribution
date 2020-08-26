package typings.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateSignatureRequest")
@js.native
class CreateSignatureRequest protected ()
  extends typings.postmark.modelsMod.CreateSignatureRequest {
  def this(name: String, fromEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: js.UndefOr[scala.Nothing], returnPathDomain: String) = this()
  def this(name: String, fromEmail: String, replyToEmail: String, returnPathDomain: String) = this()
}

