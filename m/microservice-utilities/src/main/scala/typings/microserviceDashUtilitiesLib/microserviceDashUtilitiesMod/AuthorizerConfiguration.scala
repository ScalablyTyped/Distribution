package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizerConfiguration extends js.Object {
  var authorizerContextResolver: js.UndefOr[java.lang.String] = js.undefined
  var jwkKeyListUrl: java.lang.String
}

object AuthorizerConfiguration {
  @scala.inline
  def apply(jwkKeyListUrl: java.lang.String, authorizerContextResolver: java.lang.String = null): AuthorizerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jwkKeyListUrl")(jwkKeyListUrl)
    if (authorizerContextResolver != null) __obj.updateDynamic("authorizerContextResolver")(authorizerContextResolver)
    __obj.asInstanceOf[AuthorizerConfiguration]
  }
}

