package typings.ntlmClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DNS extends js.Object {
  var DNS: String
  var DOMAIN: String
  var FQDN: String
  var PARENT_DNS: String
  var SERVER: String
}

object DNS {
  @scala.inline
  def apply(DNS: String, DOMAIN: String, FQDN: String, PARENT_DNS: String, SERVER: String): DNS = {
    val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], DOMAIN = DOMAIN.asInstanceOf[js.Any], FQDN = FQDN.asInstanceOf[js.Any], PARENT_DNS = PARENT_DNS.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNS]
  }
}

