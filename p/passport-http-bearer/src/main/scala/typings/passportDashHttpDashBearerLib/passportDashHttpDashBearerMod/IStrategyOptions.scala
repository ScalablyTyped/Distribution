package typings
package passportDashHttpDashBearerLib.passportDashHttpDashBearerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptions extends js.Object {
  var passReqToCallback: scala.Boolean
  var realm: java.lang.String
  var scope: java.lang.String | js.Array[java.lang.String]
}

object IStrategyOptions {
  @scala.inline
  def apply(
    passReqToCallback: scala.Boolean,
    realm: java.lang.String,
    scope: java.lang.String | js.Array[java.lang.String]
  ): IStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    __obj.updateDynamic("realm")(realm)
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptions]
  }
}

