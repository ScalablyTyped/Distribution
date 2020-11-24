package typings.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest", "BasicAuthenticationCredentials")
@js.native
class BasicAuthenticationCredentials protected () extends ServiceClientCredentials {
  def this(userName: String, password: String) = this()
  def this(userName: String, password: String, authorizationScheme: String) = this()
}
