package typings.postmark.modelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postmark/dist/client/models", "CreateSignatureRequest")
@js.native
open class CreateSignatureRequest protected ()
  extends typings.postmark.signatureMod.CreateSignatureRequest {
  def this(Name: String, FromEmail: String) = this()
  def this(Name: String, FromEmail: String, ReplyToEmail: String) = this()
  def this(Name: String, FromEmail: String, ReplyToEmail: String, ReturnPathDomain: String) = this()
  def this(Name: String, FromEmail: String, ReplyToEmail: Unit, ReturnPathDomain: String) = this()
  def this(
    Name: String,
    FromEmail: String,
    ReplyToEmail: String,
    ReturnPathDomain: String,
    ConfirmationPersonalNote: String
  ) = this()
  def this(
    Name: String,
    FromEmail: String,
    ReplyToEmail: String,
    ReturnPathDomain: Unit,
    ConfirmationPersonalNote: String
  ) = this()
  def this(
    Name: String,
    FromEmail: String,
    ReplyToEmail: Unit,
    ReturnPathDomain: String,
    ConfirmationPersonalNote: String
  ) = this()
  def this(
    Name: String,
    FromEmail: String,
    ReplyToEmail: Unit,
    ReturnPathDomain: Unit,
    ConfirmationPersonalNote: String
  ) = this()
}
