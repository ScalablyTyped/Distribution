package typings.node.urlMod

import typings.node.querystringMod.ParsedUrlQueryInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Input to `url.format`
trait UrlObject extends js.Object {
  var auth: js.UndefOr[java.lang.String | Null] = js.undefined
  var hash: js.UndefOr[java.lang.String | Null] = js.undefined
  var host: js.UndefOr[java.lang.String | Null] = js.undefined
  var hostname: js.UndefOr[java.lang.String | Null] = js.undefined
  var href: js.UndefOr[java.lang.String | Null] = js.undefined
  var path: js.UndefOr[java.lang.String | Null] = js.undefined
  var pathname: js.UndefOr[java.lang.String | Null] = js.undefined
  var port: js.UndefOr[java.lang.String | Double | Null] = js.undefined
  var protocol: js.UndefOr[java.lang.String | Null] = js.undefined
  var query: js.UndefOr[java.lang.String | Null | ParsedUrlQueryInput] = js.undefined
  var search: js.UndefOr[java.lang.String | Null] = js.undefined
  var slashes: js.UndefOr[Boolean | Null] = js.undefined
}

object UrlObject {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    hash: java.lang.String = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    href: java.lang.String = null,
    path: java.lang.String = null,
    pathname: java.lang.String = null,
    port: java.lang.String | Double = null,
    protocol: java.lang.String = null,
    query: java.lang.String | ParsedUrlQueryInput = null,
    search: java.lang.String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): UrlObject = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlObject]
  }
}

