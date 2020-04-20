package typings.mdurl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var auth: String
  var hash: String
  var hostname: String
  var pathname: String
  var port: String
  var protocol: String
  var search: String
  var slashes: String
}

object Url {
  @scala.inline
  def apply(
    auth: String,
    hash: String,
    hostname: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String,
    slashes: String
  ): Url = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

