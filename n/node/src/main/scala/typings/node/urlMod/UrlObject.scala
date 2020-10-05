package typings.node.urlMod

import typings.node.querystringMod.ParsedUrlQueryInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Input to `url.format`
@js.native
trait UrlObject extends js.Object {
  var auth: js.UndefOr[String | Null] = js.native
  var hash: js.UndefOr[String | Null] = js.native
  var host: js.UndefOr[String | Null] = js.native
  var hostname: js.UndefOr[String | Null] = js.native
  var href: js.UndefOr[String | Null] = js.native
  var pathname: js.UndefOr[String | Null] = js.native
  var port: js.UndefOr[String | Double | Null] = js.native
  var protocol: js.UndefOr[String | Null] = js.native
  var query: js.UndefOr[String | Null | ParsedUrlQueryInput] = js.native
  var search: js.UndefOr[String | Null] = js.native
  var slashes: js.UndefOr[Boolean | Null] = js.native
}

object UrlObject {
  @scala.inline
  def apply(): UrlObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlObject]
  }
  @scala.inline
  implicit class UrlObjectOps[Self <: UrlObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setHashNull: Self = this.set("hash", null)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setHrefNull: Self = this.set("href", null)
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setPathnameNull: Self = this.set("pathname", null)
    @scala.inline
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    @scala.inline
    def setQuery(value: String | ParsedUrlQueryInput): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch: Self = this.set("search", js.undefined)
    @scala.inline
    def setSearchNull: Self = this.set("search", null)
    @scala.inline
    def setSlashes(value: Boolean): Self = this.set("slashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlashes: Self = this.set("slashes", js.undefined)
    @scala.inline
    def setSlashesNull: Self = this.set("slashes", null)
  }
  
}

