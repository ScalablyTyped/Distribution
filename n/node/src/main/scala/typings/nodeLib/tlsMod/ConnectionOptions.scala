package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionOptions extends SecureContextOptions {
  var ALPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array
  ] = js.undefined
   // Defaults to true
  var NPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array
  ] = js.undefined
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* host */ java.lang.String, /* cert */ PeerCertificate, js.UndefOr[nodeLib.Error]]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
   // If not provided, the entire ConnectionOptions object will be passed to tls.createSecureContext()
  var lookup: js.UndefOr[nodeLib.netMod.LookupFunction] = js.undefined
  var minDHSize: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
   // Establish secure connection on a given socket rather than creating a new socket
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var secureContext: js.UndefOr[SecureContext] = js.undefined
  var servername: js.UndefOr[java.lang.String] = js.undefined
   // SNI TLS Extension
  var session: js.UndefOr[nodeLib.Buffer] = js.undefined
   // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[nodeLib.netMod.Socket] = js.undefined
}

