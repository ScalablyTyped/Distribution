package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizerConfiguration extends js.Object {
  var authorizerContextResolver: js.UndefOr[String] = js.undefined
  var jwkKeyListUrl: String
}

object AuthorizerConfiguration {
  @scala.inline
  def apply(jwkKeyListUrl: String, authorizerContextResolver: String = null): AuthorizerConfiguration = {
    val __obj = js.Dynamic.literal(jwkKeyListUrl = jwkKeyListUrl.asInstanceOf[js.Any])
    if (authorizerContextResolver != null) __obj.updateDynamic("authorizerContextResolver")(authorizerContextResolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerConfiguration]
  }
}

