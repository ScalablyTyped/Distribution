package typings.passportHttpBearer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptions extends js.Object {
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object IStrategyOptions {
  @scala.inline
  def apply(
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    realm: String = null,
    scope: String | js.Array[String] = null
  ): IStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.get.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptions]
  }
}

