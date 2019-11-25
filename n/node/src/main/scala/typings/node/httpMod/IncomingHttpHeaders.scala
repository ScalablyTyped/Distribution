package typings.node.httpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// incoming headers will never contain number
trait IncomingHttpHeaders
  extends /* header */ StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]] {
  var accept: js.UndefOr[java.lang.String] = js.undefined
  var `accept-language`: js.UndefOr[java.lang.String] = js.undefined
  var `accept-patch`: js.UndefOr[java.lang.String] = js.undefined
  var `accept-ranges`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-allow-credentials`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-allow-headers`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-allow-methods`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-allow-origin`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-expose-headers`: js.UndefOr[java.lang.String] = js.undefined
  var `access-control-max-age`: js.UndefOr[java.lang.String] = js.undefined
  var age: js.UndefOr[java.lang.String] = js.undefined
  var allow: js.UndefOr[java.lang.String] = js.undefined
  var `alt-svc`: js.UndefOr[java.lang.String] = js.undefined
  var authorization: js.UndefOr[java.lang.String] = js.undefined
  var `cache-control`: js.UndefOr[java.lang.String] = js.undefined
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var `content-disposition`: js.UndefOr[java.lang.String] = js.undefined
  var `content-encoding`: js.UndefOr[java.lang.String] = js.undefined
  var `content-language`: js.UndefOr[java.lang.String] = js.undefined
  var `content-length`: js.UndefOr[java.lang.String] = js.undefined
  var `content-location`: js.UndefOr[java.lang.String] = js.undefined
  var `content-range`: js.UndefOr[java.lang.String] = js.undefined
  var `content-type`: js.UndefOr[java.lang.String] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var expect: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var forwarded: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var `if-match`: js.UndefOr[java.lang.String] = js.undefined
  var `if-modified-since`: js.UndefOr[java.lang.String] = js.undefined
  var `if-none-match`: js.UndefOr[java.lang.String] = js.undefined
  var `if-unmodified-since`: js.UndefOr[java.lang.String] = js.undefined
  var `last-modified`: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var pragma: js.UndefOr[java.lang.String] = js.undefined
  var `proxy-authenticate`: js.UndefOr[java.lang.String] = js.undefined
  var `proxy-authorization`: js.UndefOr[java.lang.String] = js.undefined
  var `public-key-pins`: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[java.lang.String] = js.undefined
  var referer: js.UndefOr[java.lang.String] = js.undefined
  var `retry-after`: js.UndefOr[java.lang.String] = js.undefined
  var `set-cookie`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `strict-transport-security`: js.UndefOr[java.lang.String] = js.undefined
  var tk: js.UndefOr[java.lang.String] = js.undefined
  var trailer: js.UndefOr[java.lang.String] = js.undefined
  var `transfer-encoding`: js.UndefOr[java.lang.String] = js.undefined
  var upgrade: js.UndefOr[java.lang.String] = js.undefined
  var `user-agent`: js.UndefOr[java.lang.String] = js.undefined
  var vary: js.UndefOr[java.lang.String] = js.undefined
  var via: js.UndefOr[java.lang.String] = js.undefined
  var warning: js.UndefOr[java.lang.String] = js.undefined
  var `www-authenticate`: js.UndefOr[java.lang.String] = js.undefined
}

object IncomingHttpHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]] = null,
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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

