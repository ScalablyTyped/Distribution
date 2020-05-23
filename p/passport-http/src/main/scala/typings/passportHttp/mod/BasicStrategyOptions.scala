package typings.passportHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicStrategyOptions[req /* <: Boolean */] extends js.Object {
  var passReqToCallback: js.UndefOr[req] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
}

object BasicStrategyOptions {
  @scala.inline
  def apply[req](passReqToCallback: req = null, realm: String = null): BasicStrategyOptions[req] = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicStrategyOptions[req]]
  }
}

