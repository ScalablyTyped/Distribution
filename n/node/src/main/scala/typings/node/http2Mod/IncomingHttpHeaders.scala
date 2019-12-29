package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingHttpHeaders
  extends typings.node.httpMod.IncomingHttpHeaders {
  @JSName(":authority")
  var Colonauthority: js.UndefOr[String] = js.undefined
  @JSName(":method")
  var Colonmethod: js.UndefOr[String] = js.undefined
  @JSName(":path")
  var Colonpath: js.UndefOr[String] = js.undefined
  @JSName(":scheme")
  var Colonscheme: js.UndefOr[String] = js.undefined
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(
    Colonauthority: String = null,
    Colonmethod: String = null,
    Colonpath: String = null,
    Colonscheme: String = null,
    accept: String = null,
    `accept-language`: String = null,
    `accept-patch`: String = null,
    `accept-ranges`: String = null,
    `access-control-allow-credentials`: String = null,
    `access-control-allow-headers`: String = null,
    `access-control-allow-methods`: String = null,
    `access-control-allow-origin`: String = null,
    `access-control-expose-headers`: String = null,
    `access-control-max-age`: String = null,
    age: String = null,
    allow: String = null,
    `alt-svc`: String = null,
    authorization: String = null,
    `cache-control`: String = null,
    connection: String = null,
    `content-disposition`: String = null,
    `content-encoding`: String = null,
    `content-language`: String = null,
    `content-length`: String = null,
    `content-location`: String = null,
    `content-range`: String = null,
    `content-type`: String = null,
    cookie: String = null,
    date: String = null,
    expect: String = null,
    expires: String = null,
    forwarded: String = null,
    from: String = null,
    host: String = null,
    `if-match`: String = null,
    `if-modified-since`: String = null,
    `if-none-match`: String = null,
    `if-unmodified-since`: String = null,
    `last-modified`: String = null,
    location: String = null,
    pragma: String = null,
    `proxy-authenticate`: String = null,
    `proxy-authorization`: String = null,
    `public-key-pins`: String = null,
    range: String = null,
    referer: String = null,
    `retry-after`: String = null,
    `set-cookie`: js.Array[String] = null,
    `strict-transport-security`: String = null,
    tk: String = null,
    trailer: String = null,
    `transfer-encoding`: String = null,
    upgrade: String = null,
    `user-agent`: String = null,
    vary: String = null,
    via: String = null,
    warning: String = null,
    `www-authenticate`: String = null
  ): IncomingHttpHeaders = {
    val __obj = js.Dynamic.literal()
    if (Colonauthority != null) __obj.updateDynamic(":authority")(Colonauthority.asInstanceOf[js.Any])
    if (Colonmethod != null) __obj.updateDynamic(":method")(Colonmethod.asInstanceOf[js.Any])
    if (Colonpath != null) __obj.updateDynamic(":path")(Colonpath.asInstanceOf[js.Any])
    if (Colonscheme != null) __obj.updateDynamic(":scheme")(Colonscheme.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (`accept-language` != null) __obj.updateDynamic("accept-language")(`accept-language`.asInstanceOf[js.Any])
    if (`accept-patch` != null) __obj.updateDynamic("accept-patch")(`accept-patch`.asInstanceOf[js.Any])
    if (`accept-ranges` != null) __obj.updateDynamic("accept-ranges")(`accept-ranges`.asInstanceOf[js.Any])
    if (`access-control-allow-credentials` != null) __obj.updateDynamic("access-control-allow-credentials")(`access-control-allow-credentials`.asInstanceOf[js.Any])
    if (`access-control-allow-headers` != null) __obj.updateDynamic("access-control-allow-headers")(`access-control-allow-headers`.asInstanceOf[js.Any])
    if (`access-control-allow-methods` != null) __obj.updateDynamic("access-control-allow-methods")(`access-control-allow-methods`.asInstanceOf[js.Any])
    if (`access-control-allow-origin` != null) __obj.updateDynamic("access-control-allow-origin")(`access-control-allow-origin`.asInstanceOf[js.Any])
    if (`access-control-expose-headers` != null) __obj.updateDynamic("access-control-expose-headers")(`access-control-expose-headers`.asInstanceOf[js.Any])
    if (`access-control-max-age` != null) __obj.updateDynamic("access-control-max-age")(`access-control-max-age`.asInstanceOf[js.Any])
    if (age != null) __obj.updateDynamic("age")(age.asInstanceOf[js.Any])
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (`alt-svc` != null) __obj.updateDynamic("alt-svc")(`alt-svc`.asInstanceOf[js.Any])
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (`content-disposition` != null) __obj.updateDynamic("content-disposition")(`content-disposition`.asInstanceOf[js.Any])
    if (`content-encoding` != null) __obj.updateDynamic("content-encoding")(`content-encoding`.asInstanceOf[js.Any])
    if (`content-language` != null) __obj.updateDynamic("content-language")(`content-language`.asInstanceOf[js.Any])
    if (`content-length` != null) __obj.updateDynamic("content-length")(`content-length`.asInstanceOf[js.Any])
    if (`content-location` != null) __obj.updateDynamic("content-location")(`content-location`.asInstanceOf[js.Any])
    if (`content-range` != null) __obj.updateDynamic("content-range")(`content-range`.asInstanceOf[js.Any])
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (expect != null) __obj.updateDynamic("expect")(expect.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (forwarded != null) __obj.updateDynamic("forwarded")(forwarded.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (`if-match` != null) __obj.updateDynamic("if-match")(`if-match`.asInstanceOf[js.Any])
    if (`if-modified-since` != null) __obj.updateDynamic("if-modified-since")(`if-modified-since`.asInstanceOf[js.Any])
    if (`if-none-match` != null) __obj.updateDynamic("if-none-match")(`if-none-match`.asInstanceOf[js.Any])
    if (`if-unmodified-since` != null) __obj.updateDynamic("if-unmodified-since")(`if-unmodified-since`.asInstanceOf[js.Any])
    if (`last-modified` != null) __obj.updateDynamic("last-modified")(`last-modified`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (pragma != null) __obj.updateDynamic("pragma")(pragma.asInstanceOf[js.Any])
    if (`proxy-authenticate` != null) __obj.updateDynamic("proxy-authenticate")(`proxy-authenticate`.asInstanceOf[js.Any])
    if (`proxy-authorization` != null) __obj.updateDynamic("proxy-authorization")(`proxy-authorization`.asInstanceOf[js.Any])
    if (`public-key-pins` != null) __obj.updateDynamic("public-key-pins")(`public-key-pins`.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (referer != null) __obj.updateDynamic("referer")(referer.asInstanceOf[js.Any])
    if (`retry-after` != null) __obj.updateDynamic("retry-after")(`retry-after`.asInstanceOf[js.Any])
    if (`set-cookie` != null) __obj.updateDynamic("set-cookie")(`set-cookie`.asInstanceOf[js.Any])
    if (`strict-transport-security` != null) __obj.updateDynamic("strict-transport-security")(`strict-transport-security`.asInstanceOf[js.Any])
    if (tk != null) __obj.updateDynamic("tk")(tk.asInstanceOf[js.Any])
    if (trailer != null) __obj.updateDynamic("trailer")(trailer.asInstanceOf[js.Any])
    if (`transfer-encoding` != null) __obj.updateDynamic("transfer-encoding")(`transfer-encoding`.asInstanceOf[js.Any])
    if (upgrade != null) __obj.updateDynamic("upgrade")(upgrade.asInstanceOf[js.Any])
    if (`user-agent` != null) __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    if (vary != null) __obj.updateDynamic("vary")(vary.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    if (`www-authenticate` != null) __obj.updateDynamic("www-authenticate")(`www-authenticate`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingHttpHeaders]
  }
}

