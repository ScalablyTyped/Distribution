package typings.node.urlMod

import typings.node.fsMod._PathLike
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URL")
@js.native
class URL protected () extends _PathLike {
  def this(input: java.lang.String) = this()
  def this(input: java.lang.String, base: java.lang.String) = this()
  def this(input: java.lang.String, base: URL) = this()
  var hash: java.lang.String = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  val origin: java.lang.String = js.native
  var password: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var search: java.lang.String = js.native
  val searchParams: URLSearchParams = js.native
  var username: java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
}

// Output of `url.parse`
trait Url extends UrlObjectCommon {
  var port: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String | Null | ParsedUrlQuery] = js.undefined
}

object Url {
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
    query: java.lang.String | ParsedUrlQuery = null,
    search: java.lang.String = null,
    slashes: js.UndefOr[Boolean] = js.undefined
  ): Url = {
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
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(slashes)) __obj.updateDynamic("slashes")(slashes)
    __obj.asInstanceOf[Url]
  }
}

