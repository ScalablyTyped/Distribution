package typings.passportUniqueToken.mod

import typings.passportUniqueToken.passportUniqueTokenBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsWithRequest extends js.Object {
  var failedOnMissing: js.UndefOr[Boolean] = js.native
  var passReqToCallback: `true` = js.native
  var tokenField: js.UndefOr[String] = js.native
  var tokenHeader: js.UndefOr[String] = js.native
  var tokenParams: js.UndefOr[String] = js.native
  var tokenQuery: js.UndefOr[String] = js.native
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(passReqToCallback: `true`): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
  @scala.inline
  implicit class StrategyOptionsWithRequestOps[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassReqToCallback(value: `true`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedOnMissing(value: Boolean): Self = this.set("failedOnMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedOnMissing: Self = this.set("failedOnMissing", js.undefined)
    @scala.inline
    def setTokenField(value: String): Self = this.set("tokenField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenField: Self = this.set("tokenField", js.undefined)
    @scala.inline
    def setTokenHeader(value: String): Self = this.set("tokenHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenHeader: Self = this.set("tokenHeader", js.undefined)
    @scala.inline
    def setTokenParams(value: String): Self = this.set("tokenParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenParams: Self = this.set("tokenParams", js.undefined)
    @scala.inline
    def setTokenQuery(value: String): Self = this.set("tokenQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenQuery: Self = this.set("tokenQuery", js.undefined)
  }
  
}

