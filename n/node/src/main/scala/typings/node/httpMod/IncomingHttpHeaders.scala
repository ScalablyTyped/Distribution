package typings.node.httpMod

import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// incoming headers will never contain number
@js.native
trait IncomingHttpHeaders
  extends Dict[String | js.Array[String]] {
  var accept: js.UndefOr[String] = js.native
  var `accept-language`: js.UndefOr[String] = js.native
  var `accept-patch`: js.UndefOr[String] = js.native
  var `accept-ranges`: js.UndefOr[String] = js.native
  var `access-control-allow-credentials`: js.UndefOr[String] = js.native
  var `access-control-allow-headers`: js.UndefOr[String] = js.native
  var `access-control-allow-methods`: js.UndefOr[String] = js.native
  var `access-control-allow-origin`: js.UndefOr[String] = js.native
  var `access-control-expose-headers`: js.UndefOr[String] = js.native
  var `access-control-max-age`: js.UndefOr[String] = js.native
  var `access-control-request-headers`: js.UndefOr[String] = js.native
  var `access-control-request-method`: js.UndefOr[String] = js.native
  var age: js.UndefOr[String] = js.native
  var allow: js.UndefOr[String] = js.native
  var `alt-svc`: js.UndefOr[String] = js.native
  var authorization: js.UndefOr[String] = js.native
  var `cache-control`: js.UndefOr[String] = js.native
  var connection: js.UndefOr[String] = js.native
  var `content-disposition`: js.UndefOr[String] = js.native
  var `content-encoding`: js.UndefOr[String] = js.native
  var `content-language`: js.UndefOr[String] = js.native
  var `content-length`: js.UndefOr[String] = js.native
  var `content-location`: js.UndefOr[String] = js.native
  var `content-range`: js.UndefOr[String] = js.native
  var `content-type`: js.UndefOr[String] = js.native
  var cookie: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var expect: js.UndefOr[String] = js.native
  var expires: js.UndefOr[String] = js.native
  var forwarded: js.UndefOr[String] = js.native
  var from: js.UndefOr[String] = js.native
  var host: js.UndefOr[String] = js.native
  var `if-match`: js.UndefOr[String] = js.native
  var `if-modified-since`: js.UndefOr[String] = js.native
  var `if-none-match`: js.UndefOr[String] = js.native
  var `if-unmodified-since`: js.UndefOr[String] = js.native
  var `last-modified`: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var origin: js.UndefOr[String] = js.native
  var pragma: js.UndefOr[String] = js.native
  var `proxy-authenticate`: js.UndefOr[String] = js.native
  var `proxy-authorization`: js.UndefOr[String] = js.native
  var `public-key-pins`: js.UndefOr[String] = js.native
  var range: js.UndefOr[String] = js.native
  var referer: js.UndefOr[String] = js.native
  var `retry-after`: js.UndefOr[String] = js.native
  var `set-cookie`: js.UndefOr[js.Array[String]] = js.native
  var `strict-transport-security`: js.UndefOr[String] = js.native
  var tk: js.UndefOr[String] = js.native
  var trailer: js.UndefOr[String] = js.native
  var `transfer-encoding`: js.UndefOr[String] = js.native
  var upgrade: js.UndefOr[String] = js.native
  var `user-agent`: js.UndefOr[String] = js.native
  var vary: js.UndefOr[String] = js.native
  var via: js.UndefOr[String] = js.native
  var warning: js.UndefOr[String] = js.native
  var `www-authenticate`: js.UndefOr[String] = js.native
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
  @scala.inline
  implicit class IncomingHttpHeadersOps[Self <: IncomingHttpHeaders] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def `setAccept-language`(value: String): Self = this.set("accept-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-language`: Self = this.set("accept-language", js.undefined)
    @scala.inline
    def `setAccept-patch`(value: String): Self = this.set("accept-patch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-patch`: Self = this.set("accept-patch", js.undefined)
    @scala.inline
    def `setAccept-ranges`(value: String): Self = this.set("accept-ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccept-ranges`: Self = this.set("accept-ranges", js.undefined)
    @scala.inline
    def `setAccess-control-allow-credentials`(value: String): Self = this.set("access-control-allow-credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-allow-credentials`: Self = this.set("access-control-allow-credentials", js.undefined)
    @scala.inline
    def `setAccess-control-allow-headers`(value: String): Self = this.set("access-control-allow-headers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-allow-headers`: Self = this.set("access-control-allow-headers", js.undefined)
    @scala.inline
    def `setAccess-control-allow-methods`(value: String): Self = this.set("access-control-allow-methods", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-allow-methods`: Self = this.set("access-control-allow-methods", js.undefined)
    @scala.inline
    def `setAccess-control-allow-origin`(value: String): Self = this.set("access-control-allow-origin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-allow-origin`: Self = this.set("access-control-allow-origin", js.undefined)
    @scala.inline
    def `setAccess-control-expose-headers`(value: String): Self = this.set("access-control-expose-headers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-expose-headers`: Self = this.set("access-control-expose-headers", js.undefined)
    @scala.inline
    def `setAccess-control-max-age`(value: String): Self = this.set("access-control-max-age", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-max-age`: Self = this.set("access-control-max-age", js.undefined)
    @scala.inline
    def `setAccess-control-request-headers`(value: String): Self = this.set("access-control-request-headers", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-request-headers`: Self = this.set("access-control-request-headers", js.undefined)
    @scala.inline
    def `setAccess-control-request-method`(value: String): Self = this.set("access-control-request-method", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccess-control-request-method`: Self = this.set("access-control-request-method", js.undefined)
    @scala.inline
    def setAge(value: String): Self = this.set("age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAge: Self = this.set("age", js.undefined)
    @scala.inline
    def setAllow(value: String): Self = this.set("allow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    @scala.inline
    def `setAlt-svc`(value: String): Self = this.set("alt-svc", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlt-svc`: Self = this.set("alt-svc", js.undefined)
    @scala.inline
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    @scala.inline
    def `setCache-control`(value: String): Self = this.set("cache-control", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-control`: Self = this.set("cache-control", js.undefined)
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def `setContent-disposition`(value: String): Self = this.set("content-disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-disposition`: Self = this.set("content-disposition", js.undefined)
    @scala.inline
    def `setContent-encoding`(value: String): Self = this.set("content-encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-encoding`: Self = this.set("content-encoding", js.undefined)
    @scala.inline
    def `setContent-language`(value: String): Self = this.set("content-language", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-language`: Self = this.set("content-language", js.undefined)
    @scala.inline
    def `setContent-length`(value: String): Self = this.set("content-length", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-length`: Self = this.set("content-length", js.undefined)
    @scala.inline
    def `setContent-location`(value: String): Self = this.set("content-location", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-location`: Self = this.set("content-location", js.undefined)
    @scala.inline
    def `setContent-range`(value: String): Self = this.set("content-range", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-range`: Self = this.set("content-range", js.undefined)
    @scala.inline
    def `setContent-type`(value: String): Self = this.set("content-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-type`: Self = this.set("content-type", js.undefined)
    @scala.inline
    def setCookie(value: String): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setExpect(value: String): Self = this.set("expect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpect: Self = this.set("expect", js.undefined)
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setForwarded(value: String): Self = this.set("forwarded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwarded: Self = this.set("forwarded", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def `setIf-match`(value: String): Self = this.set("if-match", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIf-match`: Self = this.set("if-match", js.undefined)
    @scala.inline
    def `setIf-modified-since`(value: String): Self = this.set("if-modified-since", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIf-modified-since`: Self = this.set("if-modified-since", js.undefined)
    @scala.inline
    def `setIf-none-match`(value: String): Self = this.set("if-none-match", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIf-none-match`: Self = this.set("if-none-match", js.undefined)
    @scala.inline
    def `setIf-unmodified-since`(value: String): Self = this.set("if-unmodified-since", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteIf-unmodified-since`: Self = this.set("if-unmodified-since", js.undefined)
    @scala.inline
    def `setLast-modified`(value: String): Self = this.set("last-modified", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLast-modified`: Self = this.set("last-modified", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPragma(value: String): Self = this.set("pragma", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePragma: Self = this.set("pragma", js.undefined)
    @scala.inline
    def `setProxy-authenticate`(value: String): Self = this.set("proxy-authenticate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProxy-authenticate`: Self = this.set("proxy-authenticate", js.undefined)
    @scala.inline
    def `setProxy-authorization`(value: String): Self = this.set("proxy-authorization", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteProxy-authorization`: Self = this.set("proxy-authorization", js.undefined)
    @scala.inline
    def `setPublic-key-pins`(value: String): Self = this.set("public-key-pins", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePublic-key-pins`: Self = this.set("public-key-pins", js.undefined)
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setReferer(value: String): Self = this.set("referer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferer: Self = this.set("referer", js.undefined)
    @scala.inline
    def `setRetry-after`(value: String): Self = this.set("retry-after", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRetry-after`: Self = this.set("retry-after", js.undefined)
    @scala.inline
    def `setSet-cookieVarargs`(value: String*): Self = this.set("set-cookie", js.Array(value :_*))
    @scala.inline
    def `setSet-cookie`(value: js.Array[String]): Self = this.set("set-cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSet-cookie`: Self = this.set("set-cookie", js.undefined)
    @scala.inline
    def `setStrict-transport-security`(value: String): Self = this.set("strict-transport-security", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrict-transport-security`: Self = this.set("strict-transport-security", js.undefined)
    @scala.inline
    def setTk(value: String): Self = this.set("tk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTk: Self = this.set("tk", js.undefined)
    @scala.inline
    def setTrailer(value: String): Self = this.set("trailer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailer: Self = this.set("trailer", js.undefined)
    @scala.inline
    def `setTransfer-encoding`(value: String): Self = this.set("transfer-encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTransfer-encoding`: Self = this.set("transfer-encoding", js.undefined)
    @scala.inline
    def setUpgrade(value: String): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgrade: Self = this.set("upgrade", js.undefined)
    @scala.inline
    def `setUser-agent`(value: String): Self = this.set("user-agent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUser-agent`: Self = this.set("user-agent", js.undefined)
    @scala.inline
    def setVary(value: String): Self = this.set("vary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVary: Self = this.set("vary", js.undefined)
    @scala.inline
    def setVia(value: String): Self = this.set("via", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVia: Self = this.set("via", js.undefined)
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
    @scala.inline
    def `setWww-authenticate`(value: String): Self = this.set("www-authenticate", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWww-authenticate`: Self = this.set("www-authenticate", js.undefined)
  }
  
}

