package typings.node.tlsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CLIENT_RENEG_LIMIT: scala.Double = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_LIMIT").asInstanceOf[scala.Double]

inline def CLIENT_RENEG_WINDOW: scala.Double = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CLIENT_RENEG_WINDOW").asInstanceOf[scala.Double]

/**
  * The default curve name to use for ECDH key agreement in a tls server.
  * The default value is 'auto'. See tls.createSecureContext() for further
  * information.
  */
inline def DEFAULT_ECDH_CURVE: java.lang.String = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_ECDH_CURVE").asInstanceOf[java.lang.String]
inline def DEFAULT_ECDH_CURVE_=(x: java.lang.String): scala.Unit = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ECDH_CURVE")(x.asInstanceOf[js.Any])

/**
  * The default value of the maxVersion option of
  * tls.createSecureContext(). It can be assigned any of the supported TLS
  * protocol versions, 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default:
  * 'TLSv1.3', unless changed using CLI options. Using --tls-max-v1.2 sets
  * the default to 'TLSv1.2'. Using --tls-max-v1.3 sets the default to
  * 'TLSv1.3'. If multiple of the options are provided, the highest maximum
  * is used.
  */
inline def DEFAULT_MAX_VERSION: typings.node.tlsMod.SecureVersion = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MAX_VERSION").asInstanceOf[typings.node.tlsMod.SecureVersion]
inline def DEFAULT_MAX_VERSION_=(x: typings.node.tlsMod.SecureVersion): scala.Unit = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_VERSION")(x.asInstanceOf[js.Any])

/**
  * The default value of the minVersion option of tls.createSecureContext().
  * It can be assigned any of the supported TLS protocol versions,
  * 'TLSv1.3', 'TLSv1.2', 'TLSv1.1', or 'TLSv1'. Default: 'TLSv1.2', unless
  * changed using CLI options. Using --tls-min-v1.0 sets the default to
  * 'TLSv1'. Using --tls-min-v1.1 sets the default to 'TLSv1.1'. Using
  * --tls-min-v1.3 sets the default to 'TLSv1.3'. If multiple of the options
  * are provided, the lowest minimum is used.
  */
inline def DEFAULT_MIN_VERSION: typings.node.tlsMod.SecureVersion = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MIN_VERSION").asInstanceOf[typings.node.tlsMod.SecureVersion]
inline def DEFAULT_MIN_VERSION_=(x: typings.node.tlsMod.SecureVersion): scala.Unit = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MIN_VERSION")(x.asInstanceOf[js.Any])

/*
  * Verifies the certificate `cert` is issued to host `host`.
  * @host The hostname to verify the certificate against
  * @cert PeerCertificate representing the peer's certificate
  *
  * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
  */
inline def checkServerIdentity(host: java.lang.String, cert: typings.node.tlsMod.PeerCertificate): js.UndefOr[typings.std.Error] = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkServerIdentity")(host.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.std.Error]]

inline def connect(options: typings.node.tlsMod.ConnectionOptions): typings.node.tlsMod.TLSSocket = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(options: typings.node.tlsMod.ConnectionOptions, secureConnectListener: js.Function0[scala.Unit]): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double): typings.node.tlsMod.TLSSocket = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double, host: java.lang.String): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(
  port: scala.Double,
  host: java.lang.String,
  options: scala.Unit,
  secureConnectListener: js.Function0[scala.Unit]
): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double, host: java.lang.String, options: typings.node.tlsMod.ConnectionOptions): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(
  port: scala.Double,
  host: java.lang.String,
  options: typings.node.tlsMod.ConnectionOptions,
  secureConnectListener: js.Function0[scala.Unit]
): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(
  port: scala.Double,
  host: scala.Unit,
  options: scala.Unit,
  secureConnectListener: js.Function0[scala.Unit]
): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double, host: scala.Unit, options: typings.node.tlsMod.ConnectionOptions): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(
  port: scala.Double,
  host: scala.Unit,
  options: typings.node.tlsMod.ConnectionOptions,
  secureConnectListener: js.Function0[scala.Unit]
): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double, options: scala.Unit, secureConnectListener: js.Function0[scala.Unit]): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(port: scala.Double, options: typings.node.tlsMod.ConnectionOptions): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]
inline def connect(
  port: scala.Double,
  options: typings.node.tlsMod.ConnectionOptions,
  secureConnectListener: js.Function0[scala.Unit]
): typings.node.tlsMod.TLSSocket = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], secureConnectListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.TLSSocket]

inline def createSecureContext(): typings.node.tlsMod.SecureContext = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")().asInstanceOf[typings.node.tlsMod.SecureContext]
inline def createSecureContext(options: typings.node.tlsMod.SecureContextOptions): typings.node.tlsMod.SecureContext = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecureContext")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.SecureContext]

/**
  * @deprecated since v0.11.3 Use `tls.TLSSocket` instead.
  */
inline def createSecurePair(): typings.node.tlsMod.SecurePair = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")().asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: scala.Unit, isServer: scala.Boolean): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: scala.Unit, isServer: scala.Boolean, requestCert: scala.Boolean): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: scala.Unit,
  isServer: scala.Boolean,
  requestCert: scala.Boolean,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: scala.Unit,
  isServer: scala.Boolean,
  requestCert: scala.Unit,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: scala.Unit, isServer: scala.Unit, requestCert: scala.Boolean): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: scala.Unit,
  isServer: scala.Unit,
  requestCert: scala.Boolean,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: scala.Unit,
  isServer: scala.Unit,
  requestCert: scala.Unit,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: typings.node.tlsMod.SecureContext): typings.node.tlsMod.SecurePair = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: typings.node.tlsMod.SecureContext, isServer: scala.Boolean): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: typings.node.tlsMod.SecureContext,
  isServer: scala.Boolean,
  requestCert: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: typings.node.tlsMod.SecureContext,
  isServer: scala.Boolean,
  requestCert: scala.Boolean,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: typings.node.tlsMod.SecureContext,
  isServer: scala.Boolean,
  requestCert: scala.Unit,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(credentials: typings.node.tlsMod.SecureContext, isServer: scala.Unit, requestCert: scala.Boolean): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: typings.node.tlsMod.SecureContext,
  isServer: scala.Unit,
  requestCert: scala.Boolean,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]
inline def createSecurePair(
  credentials: typings.node.tlsMod.SecureContext,
  isServer: scala.Unit,
  requestCert: scala.Unit,
  rejectUnauthorized: scala.Boolean
): typings.node.tlsMod.SecurePair = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createSecurePair")(credentials.asInstanceOf[js.Any], isServer.asInstanceOf[js.Any], requestCert.asInstanceOf[js.Any], rejectUnauthorized.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.SecurePair]

inline def createServer(): typings.node.tlsMod.Server = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.node.tlsMod.Server]
inline def createServer(options: typings.node.tlsMod.TlsOptions): typings.node.tlsMod.Server = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.Server]
inline def createServer(
  options: typings.node.tlsMod.TlsOptions,
  secureConnectionListener: js.Function1[/* socket */ typings.node.tlsMod.TLSSocket, scala.Unit]
): typings.node.tlsMod.Server = (typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], secureConnectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.node.tlsMod.Server]
inline def createServer(secureConnectionListener: js.Function1[/* socket */ typings.node.tlsMod.TLSSocket, scala.Unit]): typings.node.tlsMod.Server = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(secureConnectionListener.asInstanceOf[js.Any]).asInstanceOf[typings.node.tlsMod.Server]

inline def getCiphers(): js.Array[java.lang.String] = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[java.lang.String]]

/**
  * An immutable array of strings representing the root certificates (in PEM
  * format) used for verifying peer certificates. This is the default value
  * of the ca option to tls.createSecureContext().
  */
inline def rootCertificates: js.Array[java.lang.String] = typings.node.tlsMod.^.asInstanceOf[js.Dynamic].selectDynamic("rootCertificates").asInstanceOf[js.Array[java.lang.String]]
