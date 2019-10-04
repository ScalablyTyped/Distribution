package typings.oauth2DashImplicit.oauth2DashImplicitMod

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
    val __obj = js.Dynamic.literal(accessToken = accessToken, state = state)
  
    __obj.asInstanceOf[AuthResult]
  }
}

