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

