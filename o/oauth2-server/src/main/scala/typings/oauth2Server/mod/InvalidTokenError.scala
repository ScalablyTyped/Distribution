package typings.oauth2Server.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2-server", "InvalidTokenError")
@js.native
class InvalidTokenError protected () extends OAuthError {
  def this(messageOrError: String) = this()
  def this(messageOrError: Error) = this()
  def this(messageOrError: String, properties: js.Object) = this()
  def this(messageOrError: Error, properties: js.Object) = this()
}
