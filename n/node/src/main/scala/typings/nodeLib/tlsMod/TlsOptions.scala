package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TlsOptions extends SecureContextOptions {
  var ALPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array
  ] = js.undefined
  var NPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array
  ] = js.undefined
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ java.lang.String, 
      /* cb */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* ctx */ SecureContext, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var handshakeTimeout: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
  var sessionTimeout: js.UndefOr[scala.Double] = js.undefined
  var ticketKeys: js.UndefOr[nodeLib.Buffer] = js.undefined
}

