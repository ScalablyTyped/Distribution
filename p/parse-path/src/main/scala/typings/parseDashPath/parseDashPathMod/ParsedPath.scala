package typings.parseDashPath.parseDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedPath extends js.Object {
  /** The url hash. */
  var hash: String
  /** The input url. */
  var href: String
  /** The url pathname. */
  var pathname: String
  /** The domain port. */
  var port: Null | Double
  /** The first protocol, `"ssh"` (if the url is a ssh url) or `"file"`. */
  var protocol: Protocol
  /** An array with the url protocols (usually it has one element). */
  var protocols: js.Array[Protocol]
  /** The url querystring, parsed as object. */
  var query: js.Any
  /** The url domain (including subdomains). */
  var resource: String
  /** The url querystring value. */
  var search: String
  /** The authentication user (usually for ssh urls). */
  var user: String
}

object ParsedPath {
  @scala.inline
  def apply(
    hash: String,
    href: String,
    pathname: String,
    protocol: Protocol,
    protocols: js.Array[Protocol],
    query: js.Any,
    resource: String,
    search: String,
    user: String,
    port: Int | Double = null
  ): ParsedPath = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedPath]
  }
}

