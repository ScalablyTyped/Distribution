package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: Boolean
  var inspector: Boolean
  var ipv6: Boolean
  var tls: Boolean
  var tls_alpn: Boolean
  var tls_ocsp: Boolean
  var tls_sni: Boolean
  var uv: Boolean
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: Boolean,
    inspector: Boolean,
    ipv6: Boolean,
    tls: Boolean,
    tls_alpn: Boolean,
    tls_ocsp: Boolean,
    tls_sni: Boolean,
    uv: Boolean
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal(debug = debug, inspector = inspector, ipv6 = ipv6, tls = tls, tls_alpn = tls_alpn, tls_ocsp = tls_ocsp, tls_sni = tls_sni, uv = uv)
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

