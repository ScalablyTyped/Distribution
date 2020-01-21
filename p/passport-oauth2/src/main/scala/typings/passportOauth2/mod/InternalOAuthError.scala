package typings.passportOauth2.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2", "InternalOAuthError")
@js.native
class InternalOAuthError protected () extends Error {
  def this(message: String, err: js.Any) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var oauthError: js.Any = js.native
}

