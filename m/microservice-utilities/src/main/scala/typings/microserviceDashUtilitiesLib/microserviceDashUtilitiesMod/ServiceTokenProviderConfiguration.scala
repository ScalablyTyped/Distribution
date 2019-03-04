package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceTokenProviderConfiguration extends js.Object {
  var audience: java.lang.String
  var clientId: java.lang.String
  var encryptedClientSecret: java.lang.String
  var tokenEndpoint: java.lang.String
}

object ServiceTokenProviderConfiguration {
  @scala.inline
  def apply(
    audience: java.lang.String,
    clientId: java.lang.String,
    encryptedClientSecret: java.lang.String,
    tokenEndpoint: java.lang.String
  ): ServiceTokenProviderConfiguration = {
    val __obj = js.Dynamic.literal(audience = audience, clientId = clientId, encryptedClientSecret = encryptedClientSecret, tokenEndpoint = tokenEndpoint)
  
    __obj.asInstanceOf[ServiceTokenProviderConfiguration]
  }
}

