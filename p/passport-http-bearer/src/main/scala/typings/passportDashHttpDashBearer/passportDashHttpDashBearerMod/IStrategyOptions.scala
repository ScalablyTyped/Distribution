package typings.passportDashHttpDashBearer.passportDashHttpDashBearerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptions extends js.Object {
  var passReqToCallback: Boolean
  var realm: String
  var scope: String | js.Array[String]
}

object IStrategyOptions {
  @scala.inline
  def apply(passReqToCallback: Boolean, realm: String, scope: String | js.Array[String]): IStrategyOptions = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback, realm = realm, scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStrategyOptions]
  }
}

