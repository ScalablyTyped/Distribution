package typings.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlWithStringQuery extends Url {
  @JSName("query")
  var query_UrlWithStringQuery: String | Null
}

object UrlWithStringQuery {
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
    query: String = null,
    search: String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): UrlWithStringQuery = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlWithStringQuery]
  }
}

