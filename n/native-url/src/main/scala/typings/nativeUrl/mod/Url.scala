package typings.nativeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Output of `url.parse`
trait Url extends js.Object {
  var auth: String | Null
  var hash: String | Null
  var host: String | Null
  var hostname: String | Null
  var href: String
  var path: String | Null
  var pathname: String | Null
  var port: String | Null
  var protocol: String | Null
  var query: String | Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ js.Any)
  var search: String | Null
  var slashes: Boolean | Null
}

object Url {
  @scala.inline
  def apply(
    href: String,
    auth: String = null,
    hash: String = null,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pathname: String = null,
    port: String = null,
    protocol: String = null,
    query: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ js.Any) = null,
    search: String = null,
    slashes: Boolean = null.asInstanceOf[Boolean]
  ): Url = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
}

