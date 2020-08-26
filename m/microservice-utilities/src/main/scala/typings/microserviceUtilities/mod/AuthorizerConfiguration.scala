package typings.microserviceUtilities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerConfiguration extends js.Object {
  var authorizerContextResolver: js.UndefOr[String] = js.native
  var jwkKeyListUrl: String = js.native
}

object AuthorizerConfiguration {
  @scala.inline
  def apply(jwkKeyListUrl: String): AuthorizerConfiguration = {
    val __obj = js.Dynamic.literal(jwkKeyListUrl = jwkKeyListUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerConfiguration]
  }
  @scala.inline
  implicit class AuthorizerConfigurationOps[Self <: AuthorizerConfiguration] (val x: Self) extends AnyVal {
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
    def setJwkKeyListUrl(value: String): Self = this.set("jwkKeyListUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerContextResolver(value: String): Self = this.set("authorizerContextResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerContextResolver: Self = this.set("authorizerContextResolver", js.undefined)
  }
  
}

