package typings.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlWithStringQuery extends Url {
  @JSName("query")
  var query_UrlWithStringQuery: java.lang.String | Null
}

object UrlWithStringQuery {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    hash: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    href: java.lang.String = null,
    path: java.lang.String = null,
    pathname: java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    query: java.lang.String = null,
    search: java.lang.String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): UrlWithStringQuery = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (href != null) __obj.updateDynamic("href")(href)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query)
    if (search != null) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes)
    __obj.asInstanceOf[UrlWithStringQuery]
  }
}

