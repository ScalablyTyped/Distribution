package typings.openidClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIDCallbackChecks extends OAuthCallbackChecks {
  /**
    * When provided the authorization response's ID Token auth_time parameter will be checked to be conform to the
    * max_age value. Use of this check is required if you sent a max_age parameter into an authorization request.
    */
  var max_age: js.UndefOr[Double] = js.native
  /**
    * When provided the authorization response's ID Token nonce parameter will be checked to be the this expected
    * one. Use of this check is required if you sent a nonce parameter into an authorization request.
    */
  var nonce: js.UndefOr[String] = js.native
}

object OpenIDCallbackChecks {
  @scala.inline
  def apply(): OpenIDCallbackChecks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDCallbackChecks]
  }
  @scala.inline
  implicit class OpenIDCallbackChecksOps[Self <: OpenIDCallbackChecks] (val x: Self) extends AnyVal {
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
    def setMax_age(value: Double): Self = this.set("max_age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_age: Self = this.set("max_age", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
  
}

