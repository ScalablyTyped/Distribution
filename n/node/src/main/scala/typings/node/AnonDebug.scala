package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: Boolean
  var inspector: Boolean
  var ipv6: Boolean
  var tls: Boolean
  var tls_alpn: Boolean
  var tls_ocsp: Boolean
  var tls_sni: Boolean
  var uv: Boolean
}

object AnonDebug {
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
  ): AnonDebug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], inspector = inspector.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], tls_alpn = tls_alpn.asInstanceOf[js.Any], tls_ocsp = tls_ocsp.asInstanceOf[js.Any], tls_sni = tls_sni.asInstanceOf[js.Any], uv = uv.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDebug]
  }
}

