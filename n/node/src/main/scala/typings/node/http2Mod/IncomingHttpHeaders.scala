package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingHttpHeaders
  extends typings.node.httpMod.IncomingHttpHeaders {
  var `:authority`: js.UndefOr[java.lang.String] = js.undefined
  var `:method`: js.UndefOr[java.lang.String] = js.undefined
  var `:path`: js.UndefOr[java.lang.String] = js.undefined
  var `:scheme`: js.UndefOr[java.lang.String] = js.undefined
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(
    `:authority`: java.lang.String = null,
    `:method`: java.lang.String = null,
    `:path`: java.lang.String = null,
    `:scheme`: java.lang.String = null,
    accept: java.lang.String = null,
    `accept-language`: java.lang.String = null,
    `accept-patch`: java.lang.String = null,
    `accept-ranges`: java.lang.String = null,
    `access-control-allow-credentials`: java.lang.String = null,
    `access-control-allow-headers`: java.lang.String = null,
    `access-control-allow-methods`: java.lang.String = null,
    `access-control-allow-origin`: java.lang.String = null,
    `access-control-expose-headers`: java.lang.String = null,
    `access-control-max-age`: java.lang.String = null,
    age: java.lang.String = null,
    allow: java.lang.String = null,
    `alt-svc`: java.lang.String = null,
    authorization: java.lang.String = null,
    `cache-control`: java.lang.String = null,
    connection: java.lang.String = null,
    `content-disposition`: java.lang.String = null,
    `content-encoding`: java.lang.String = null,
    `content-language`: java.lang.String = null,
    `content-length`: java.lang.String = null,
    `content-location`: java.lang.String = null,
    `content-range`: java.lang.String = null,
    `content-type`: java.lang.String = null,
    cookie: java.lang.String = null,
    date: java.lang.String = null,
    expect: java.lang.String = null,
    expires: java.lang.String = null,
    forwarded: java.lang.String = null,
    from: java.lang.String = null,
    host: java.lang.String = null,
    `if-match`: java.lang.String = null,
    `if-modified-since`: java.lang.String = null,
    `if-none-match`: java.lang.String = null,
    `if-unmodified-since`: java.lang.String = null,
    `last-modified`: java.lang.String = null,
    location: java.lang.String = null,
    pragma: java.lang.String = null,
    `proxy-authenticate`: java.lang.String = null,
    `proxy-authorization`: java.lang.String = null,
    `public-key-pins`: java.lang.String = null,
    range: java.lang.String = null,
    referer: java.lang.String = null,
    `retry-after`: java.lang.String = null,
    `set-cookie`: js.Array[java.lang.String] = null,
    `strict-transport-security`: java.lang.String = null,
    tk: java.lang.String = null,
    trailer: java.lang.String = null,
    `transfer-encoding`: java.lang.String = null,
    upgrade: java.lang.String = null,
    `user-agent`: java.lang.String = null,
    vary: java.lang.String = null,
    via: java.lang.String = null,
    warning: java.lang.String = null,
    `www-authenticate`: java.lang.String = null
  ): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    if (`:authority` != null) __obj.updateDynamic(":authority")(`:authority`)
    if (`:method` != null) __obj.updateDynamic(":method")(`:method`)
    if (`:path` != null) __obj.updateDynamic(":path")(`:path`)
    if (`:scheme` != null) __obj.updateDynamic(":scheme")(`:scheme`)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (`accept-language` != null) __obj.updateDynamic("accept-language")(`accept-language`)
    if (`accept-patch` != null) __obj.updateDynamic("accept-patch")(`accept-patch`)
    if (`accept-ranges` != null) __obj.updateDynamic("accept-ranges")(`accept-ranges`)
    if (`access-control-allow-credentials` != null) __obj.updateDynamic("access-control-allow-credentials")(`access-control-allow-credentials`)
    if (`access-control-allow-headers` != null) __obj.updateDynamic("access-control-allow-headers")(`access-control-allow-headers`)
    if (`access-control-allow-methods` != null) __obj.updateDynamic("access-control-allow-methods")(`access-control-allow-methods`)
    if (`access-control-allow-origin` != null) __obj.updateDynamic("access-control-allow-origin")(`access-control-allow-origin`)
    if (`access-control-expose-headers` != null) __obj.updateDynamic("access-control-expose-headers")(`access-control-expose-headers`)
    if (`access-control-max-age` != null) __obj.updateDynamic("access-control-max-age")(`access-control-max-age`)
    if (age != null) __obj.updateDynamic("age")(age)
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (`alt-svc` != null) __obj.updateDynamic("alt-svc")(`alt-svc`)
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (`content-disposition` != null) __obj.updateDynamic("content-disposition")(`content-disposition`)
    if (`content-encoding` != null) __obj.updateDynamic("content-encoding")(`content-encoding`)
    if (`content-language` != null) __obj.updateDynamic("content-language")(`content-language`)
    if (`content-length` != null) __obj.updateDynamic("content-length")(`content-length`)
    if (`content-location` != null) __obj.updateDynamic("content-location")(`content-location`)
    if (`content-range` != null) __obj.updateDynamic("content-range")(`content-range`)
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`)
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (date != null) __obj.updateDynamic("date")(date)
    if (expect != null) __obj.updateDynamic("expect")(expect)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (forwarded != null) __obj.updateDynamic("forwarded")(forwarded)
    if (from != null) __obj.updateDynamic("from")(from)
    if (host != null) __obj.updateDynamic("host")(host)
    if (`if-match` != null) __obj.updateDynamic("if-match")(`if-match`)
    if (`if-modified-since` != null) __obj.updateDynamic("if-modified-since")(`if-modified-since`)
    if (`if-none-match` != null) __obj.updateDynamic("if-none-match")(`if-none-match`)
    if (`if-unmodified-since` != null) __obj.updateDynamic("if-unmodified-since")(`if-unmodified-since`)
    if (`last-modified` != null) __obj.updateDynamic("last-modified")(`last-modified`)
    if (location != null) __obj.updateDynamic("location")(location)
    if (pragma != null) __obj.updateDynamic("pragma")(pragma)
    if (`proxy-authenticate` != null) __obj.updateDynamic("proxy-authenticate")(`proxy-authenticate`)
    if (`proxy-authorization` != null) __obj.updateDynamic("proxy-authorization")(`proxy-authorization`)
    if (`public-key-pins` != null) __obj.updateDynamic("public-key-pins")(`public-key-pins`)
    if (range != null) __obj.updateDynamic("range")(range)
    if (referer != null) __obj.updateDynamic("referer")(referer)
    if (`retry-after` != null) __obj.updateDynamic("retry-after")(`retry-after`)
    if (`set-cookie` != null) __obj.updateDynamic("set-cookie")(`set-cookie`)
    if (`strict-transport-security` != null) __obj.updateDynamic("strict-transport-security")(`strict-transport-security`)
    if (tk != null) __obj.updateDynamic("tk")(tk)
    if (trailer != null) __obj.updateDynamic("trailer")(trailer)
    if (`transfer-encoding` != null) __obj.updateDynamic("transfer-encoding")(`transfer-encoding`)
    if (upgrade != null) __obj.updateDynamic("upgrade")(upgrade)
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`)
    if (vary != null) __obj.updateDynamic("vary")(vary)
    if (via != null) __obj.updateDynamic("via")(via)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    if (`www-authenticate` != null) __obj.updateDynamic("www-authenticate")(`www-authenticate`)
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
}

