package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: scala.Boolean
  var inspector: scala.Boolean
  var ipv6: scala.Boolean
  var tls: scala.Boolean
  var tls_alpn: scala.Boolean
  var tls_ocsp: scala.Boolean
  var tls_sni: scala.Boolean
  var uv: scala.Boolean
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: scala.Boolean,
    inspector: scala.Boolean,
    ipv6: scala.Boolean,
    tls: scala.Boolean,
    tls_alpn: scala.Boolean,
    tls_ocsp: scala.Boolean,
    tls_sni: scala.Boolean,
    uv: scala.Boolean
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal(debug = debug, inspector = inspector, ipv6 = ipv6, tls = tls, tls_alpn = tls_alpn, tls_ocsp = tls_ocsp, tls_sni = tls_sni, uv = uv)
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

