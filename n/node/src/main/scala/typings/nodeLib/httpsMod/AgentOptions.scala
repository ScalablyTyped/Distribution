package typings
package nodeLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- nodeLib.httpMod.AgentOptions because var conflicts: timeout. Inlined keepAlive, keepAliveMsecs, maxSockets, maxFreeSockets */ trait AgentOptions
  extends nodeLib.tlsMod.ConnectionOptions {
  /**
    * Keep sockets around in a pool to be used by other requests in the future. Default = false
    */
  var keepAlive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When using HTTP KeepAlive, how often to send TCP KeepAlive packets over sockets being kept alive. Default = 1000.
    * Only relevant if keepAlive is set to true.
    */
  var keepAliveMsecs: js.UndefOr[scala.Double] = js.undefined
  var maxCachedSessions: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum number of sockets to leave open in a free state. Only relevant if keepAlive is set to true. Default = 256.
    */
  var maxFreeSockets: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum number of sockets to allow per host. Default for Node 0.10 is 5, default for Node 0.12 is Infinity
    */
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
}

object AgentOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[nodeLib.Buffer | java.lang.String | stdLib.Uint8Array]) | nodeLib.Buffer | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* ctx */ nodeLib.tlsMod.SecureContext, 
      scala.Unit
    ]) => scala.Unit = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    checkServerIdentity: (/* host */ java.lang.String, /* cert */ nodeLib.tlsMod.PeerCertificate) => js.UndefOr[nodeLib.Error] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[scala.Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    keepAlive: js.UndefOr[scala.Boolean] = js.undefined,
    keepAliveMsecs: scala.Int | scala.Double = null,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxCachedSessions: scala.Int | scala.Double = null,
    maxFreeSockets: scala.Int | scala.Double = null,
    maxSockets: scala.Int | scala.Double = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minDHSize: scala.Int | scala.Double = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    session: nodeLib.Buffer = null,
    sessionIdContext: java.lang.String = null,
    socket: nodeLib.netMod.Socket = null,
    timeout: scala.Int | scala.Double = null
  ): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive)
    if (keepAliveMsecs != null) __obj.updateDynamic("keepAliveMsecs")(keepAliveMsecs.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxCachedSessions != null) __obj.updateDynamic("maxCachedSessions")(maxCachedSessions.asInstanceOf[js.Any])
    if (maxFreeSockets != null) __obj.updateDynamic("maxFreeSockets")(maxFreeSockets.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOptions]
  }
}

