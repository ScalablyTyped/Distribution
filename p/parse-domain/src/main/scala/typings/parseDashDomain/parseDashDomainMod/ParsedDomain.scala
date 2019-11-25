package typings.parseDashDomain.parseDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDomain extends js.Object {
  var domain: String
  var subdomain: String
  var tld: String
}

object ParsedDomain {
  @scala.inline
  def apply(domain: String, subdomain: String, tld: String): ParsedDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedDomain]
  }
}

