package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bytes extends js.Object {
  var caStore: js.UndefOr[
    nodeDashForgeLib.nodeDashForgeMod.pkiNs.CAStore | js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate]
  ] = js.undefined
  var cipherSuites: js.UndefOr[js.Array[nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherSuite]] = js.undefined
  var deflate: js.UndefOr[
    js.Function1[
      /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
      nodeDashForgeLib.nodeDashForgeMod.Bytes
    ]
  ] = js.undefined
  var getCertificate: js.UndefOr[
    js.Function2[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* hint */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.CertificateRequest | js.Array[java.lang.String], 
      nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM | js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM]
    ]
  ] = js.undefined
  var getPrivateKey: js.UndefOr[
    js.Function2[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* certificate */ nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate, 
      nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM
    ]
  ] = js.undefined
  var getSignature: js.UndefOr[
    js.Function3[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
      /* callback */ js.Function2[
        /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
        /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var heartbeatReceived: js.UndefOr[
    js.Function2[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* payload */ nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer, 
      scala.Unit
    ]
  ] = js.undefined
  var inflate: js.UndefOr[
    js.Function1[
      /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
      nodeDashForgeLib.nodeDashForgeMod.Bytes
    ]
  ] = js.undefined
  var server: js.UndefOr[scala.Boolean] = js.undefined
  var sessionCache: js.UndefOr[
    nodeDashForgeLib.nodeDashForgeMod.tlsNs.SessionCache | org.scalablytyped.runtime.StringDictionary[nodeDashForgeLib.nodeDashForgeMod.tlsNs.Session]
  ] = js.undefined
  var sessionId: js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.Bytes | scala.Null] = js.undefined
  var verify: js.UndefOr[
    js.Function4[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* verified */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Verified, 
      /* depth */ scala.Double, 
      /* certs */ js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate], 
      nodeDashForgeLib.nodeDashForgeMod.tlsNs.Verified
    ]
  ] = js.undefined
  var verifyClient: js.UndefOr[scala.Boolean] = js.undefined
  var virtualHost: js.UndefOr[java.lang.String] = js.undefined
  def closed(conn: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection): scala.Unit
  def connected(conn: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection): scala.Unit
  def dataReady(conn: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection): scala.Unit
  def error(
    conn: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection,
    error: nodeDashForgeLib.nodeDashForgeMod.tlsNs.TLSError
  ): scala.Unit
  def tlsDataReady(conn: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection): scala.Unit
}

object Anon_Bytes {
  @scala.inline
  def apply(
    closed: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection => scala.Unit,
    connected: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection => scala.Unit,
    dataReady: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection => scala.Unit,
    error: (nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, nodeDashForgeLib.nodeDashForgeMod.tlsNs.TLSError) => scala.Unit,
    tlsDataReady: nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection => scala.Unit,
    caStore: nodeDashForgeLib.nodeDashForgeMod.pkiNs.CAStore | js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate] = null,
    cipherSuites: js.Array[nodeDashForgeLib.nodeDashForgeMod.tlsNs.CipherSuite] = null,
    deflate: /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes => nodeDashForgeLib.nodeDashForgeMod.Bytes = null,
    getCertificate: (/* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, /* hint */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.CertificateRequest | js.Array[java.lang.String]) => nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM | js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM] = null,
    getPrivateKey: (/* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, /* certificate */ nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate) => nodeDashForgeLib.nodeDashForgeMod.pkiNs.PEM = null,
    getSignature: (/* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, /* callback */ js.Function2[
      /* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, 
      /* bytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes, 
      scala.Unit
    ]) => scala.Unit = null,
    heartbeatReceived: (/* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, /* payload */ nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer) => scala.Unit = null,
    inflate: /* inBytes */ nodeDashForgeLib.nodeDashForgeMod.Bytes => nodeDashForgeLib.nodeDashForgeMod.Bytes = null,
    server: js.UndefOr[scala.Boolean] = js.undefined,
    sessionCache: nodeDashForgeLib.nodeDashForgeMod.tlsNs.SessionCache | org.scalablytyped.runtime.StringDictionary[nodeDashForgeLib.nodeDashForgeMod.tlsNs.Session] = null,
    sessionId: nodeDashForgeLib.nodeDashForgeMod.Bytes = null,
    verify: (/* conn */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Connection, /* verified */ nodeDashForgeLib.nodeDashForgeMod.tlsNs.Verified, /* depth */ scala.Double, /* certs */ js.Array[nodeDashForgeLib.nodeDashForgeMod.pkiNs.Certificate]) => nodeDashForgeLib.nodeDashForgeMod.tlsNs.Verified = null,
    verifyClient: js.UndefOr[scala.Boolean] = js.undefined,
    virtualHost: java.lang.String = null
  ): Anon_Bytes = {
    val __obj = js.Dynamic.literal(closed = js.Any.fromFunction1(closed), connected = js.Any.fromFunction1(connected), dataReady = js.Any.fromFunction1(dataReady), error = js.Any.fromFunction2(error), tlsDataReady = js.Any.fromFunction1(tlsDataReady))
    if (caStore != null) __obj.updateDynamic("caStore")(caStore.asInstanceOf[js.Any])
    if (cipherSuites != null) __obj.updateDynamic("cipherSuites")(cipherSuites)
    if (deflate != null) __obj.updateDynamic("deflate")(js.Any.fromFunction1(deflate))
    if (getCertificate != null) __obj.updateDynamic("getCertificate")(js.Any.fromFunction2(getCertificate))
    if (getPrivateKey != null) __obj.updateDynamic("getPrivateKey")(js.Any.fromFunction2(getPrivateKey))
    if (getSignature != null) __obj.updateDynamic("getSignature")(js.Any.fromFunction3(getSignature))
    if (heartbeatReceived != null) __obj.updateDynamic("heartbeatReceived")(js.Any.fromFunction2(heartbeatReceived))
    if (inflate != null) __obj.updateDynamic("inflate")(js.Any.fromFunction1(inflate))
    if (!js.isUndefined(server)) __obj.updateDynamic("server")(server)
    if (sessionCache != null) __obj.updateDynamic("sessionCache")(sessionCache.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4(verify))
    if (!js.isUndefined(verifyClient)) __obj.updateDynamic("verifyClient")(verifyClient)
    if (virtualHost != null) __obj.updateDynamic("virtualHost")(virtualHost)
    __obj.asInstanceOf[Anon_Bytes]
  }
}

