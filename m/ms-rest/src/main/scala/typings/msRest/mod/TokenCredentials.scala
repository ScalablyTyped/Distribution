package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest", "TokenCredentials")
@js.native
class TokenCredentials protected () extends ServiceClientCredentials {
  def this(token: String) = this()
  def this(token: String, authorizationScheme: String) = this()
}
