package typings.oauth2Implicit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResult extends js.Object {
  var accessToken: String
  var state: AuthState
}

object AuthResult {
  @scala.inline
  def apply(accessToken: String, state: AuthState): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthResult]
  }
}

