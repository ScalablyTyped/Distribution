package typings.microserviceDashUtilities.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceTokenProviderConfiguration extends js.Object {
  var audience: String
  var clientId: String
  var encryptedClientSecret: String
  var tokenEndpoint: String
}

object ServiceTokenProviderConfiguration {
  @scala.inline
  def apply(audience: String, clientId: String, encryptedClientSecret: String, tokenEndpoint: String): ServiceTokenProviderConfiguration = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], encryptedClientSecret = encryptedClientSecret.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceTokenProviderConfiguration]
  }
}

