package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2-server", "InvalidArgumentError")
@js.native
open class InvalidArgumentError protected () extends OAuthError {
  def this(messageOrError: String) = this()
  def this(messageOrError: js.Error) = this()
  def this(messageOrError: String, properties: js.Object) = this()
  def this(messageOrError: js.Error, properties: js.Object) = this()
}
