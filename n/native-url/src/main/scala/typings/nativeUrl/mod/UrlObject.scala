package typings.nativeUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Input to `url.format`
trait UrlObject extends js.Object {
  var auth: js.UndefOr[String | Null] = js.undefined
  var hash: js.UndefOr[String | Null] = js.undefined
  var host: js.UndefOr[String | Null] = js.undefined
  var hostname: js.UndefOr[String | Null] = js.undefined
  var href: js.UndefOr[String | Null] = js.undefined
  var path: js.UndefOr[String | Null] = js.undefined
  var pathname: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[String | Double | Null] = js.undefined
  var protocol: js.UndefOr[String | Null] = js.undefined
  var query: js.UndefOr[
    String | Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQueryInput */ js.Any)
  ] = js.undefined
  var search: js.UndefOr[String | Null] = js.undefined
  var slashes: js.UndefOr[Boolean | Null] = js.undefined
}

object UrlObject {
  @scala.inline
  def apply(
    auth: js.UndefOr[Null | String] = js.undefined,
    hash: js.UndefOr[Null | String] = js.undefined,
    host: js.UndefOr[Null | String] = js.undefined,
    hostname: js.UndefOr[Null | String] = js.undefined,
    href: js.UndefOr[Null | String] = js.undefined,
    path: js.UndefOr[Null | String] = js.undefined,
    pathname: js.UndefOr[Null | String] = js.undefined,
    port: js.UndefOr[Null | String | Double] = js.undefined,
    protocol: js.UndefOr[Null | String] = js.undefined,
    query: js.UndefOr[
      Null | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQueryInput */ js.Any)
    ] = js.undefined,
    search: js.UndefOr[Null | String] = js.undefined,
    slashes: js.UndefOr[Null | Boolean] = js.undefined
  ): UrlObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auth)) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (!js.isUndefined(host)) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(hostname)) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (!js.isUndefined(href)) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(pathname)) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(protocol)) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlObject]
  }
}

