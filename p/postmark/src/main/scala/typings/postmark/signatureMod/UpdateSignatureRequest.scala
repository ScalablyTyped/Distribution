package typings.postmark.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models/senders/Signature", "UpdateSignatureRequest")
@js.native
class UpdateSignatureRequest () extends js.Object {
  def this(Name: String) = this()
  def this(Name: js.UndefOr[scala.Nothing], ReplyToEmail: String) = this()
  def this(Name: String, ReplyToEmail: String) = this()
  def this(Name: js.UndefOr[scala.Nothing], ReplyToEmail: js.UndefOr[scala.Nothing], ReturnPathDomain: String) = this()
  def this(Name: js.UndefOr[scala.Nothing], ReplyToEmail: String, ReturnPathDomain: String) = this()
  def this(Name: String, ReplyToEmail: js.UndefOr[scala.Nothing], ReturnPathDomain: String) = this()
  def this(Name: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
  
  var Name: js.UndefOr[String] = js.native
  
  var ReplyToEmail: js.UndefOr[String] = js.native
  
  var ReturnPathDomain: js.UndefOr[String] = js.native
}
