package typings.oauthShim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var client_id: String
  var client_secret: String
  var domain: String
  var grant_url: String
}

object Config {
  @scala.inline
  def apply(client_id: String, client_secret: String, domain: String, grant_url: String): Config = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], grant_url = grant_url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

