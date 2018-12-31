package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Server extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.) When the server
    * receives both NPN and ALPN extensions from the client, ALPN takes
    * precedence over NPN and the server does not send an NPN extension
    * to the client.
    */
  var ALPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array
  ] = js.undefined
  /**
    * An array of strings or a Buffer naming possible NPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var NPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array
  ] = js.undefined
  /**
    * SNICallback(servername, cb) <Function> A function that will be
    * called if the client supports SNI TLS extension. Two arguments
    * will be passed when called: servername and cb. SNICallback should
    * invoke cb(null, ctx), where ctx is a SecureContext instance.
    * (tls.createSecureContext(...) can be used to get a proper
    * SecureContext.) If SNICallback wasn't provided the default callback
    * with high-level API will be used (see below).
    */
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ java.lang.String, 
      /* cb */ js.Function2[/* err */ Error | scala.Null, /* ctx */ nodeLib.tlsMod.SecureContext, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true. Defaults to false.
    */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[nodeLib.tlsMod.SecureContext] = js.undefined
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[nodeLib.netMod.Server] = js.undefined
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.undefined
}

