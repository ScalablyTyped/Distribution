package typings.nodePushnotifications.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var autoAdjustCache: js.UndefOr[Boolean] = js.undefined
  var buffersNotifications: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a
    * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
    * will be used. - You may need to use this as some environments don't include the CA used by
    * Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[Buffer | String]] = js.undefined
  var cacheLength: js.UndefOr[Double] = js.undefined
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the
    * certificate data.
    */
  var cert: js.UndefOr[String] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var connectionRetryLimit: js.UndefOr[Double] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var disableEPIPEFix: js.UndefOr[Boolean] = js.undefined
  var disableNagle: js.UndefOr[Boolean] = js.undefined
  var fastMode: js.UndefOr[Boolean] = js.undefined
  /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
  var key: js.UndefOr[String] = js.undefined
  var maxConnections: js.UndefOr[Double] = js.undefined
  var minConnections: js.UndefOr[Double] = js.undefined
  /** The passphrase for the connection key, if required */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
    * the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[Buffer | String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var production: js.UndefOr[Boolean] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /** APN Token */
  var token: js.UndefOr[Key] = js.undefined
  var voip: js.UndefOr[Boolean] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    address: String = null,
    autoAdjustCache: js.UndefOr[Boolean] = js.undefined,
    buffersNotifications: js.UndefOr[Boolean] = js.undefined,
    ca: js.Array[Buffer | String] = null,
    cacheLength: js.UndefOr[Double] = js.undefined,
    cert: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    connectionRetryLimit: js.UndefOr[Double] = js.undefined,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    disableEPIPEFix: js.UndefOr[Boolean] = js.undefined,
    disableNagle: js.UndefOr[Boolean] = js.undefined,
    fastMode: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxConnections: js.UndefOr[Double] = js.undefined,
    minConnections: js.UndefOr[Double] = js.undefined,
    passphrase: String = null,
    pfx: Buffer | String = null,
    port: js.UndefOr[Double] = js.undefined,
    production: js.UndefOr[Boolean] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    token: Key = null,
    voip: js.UndefOr[Boolean] = js.undefined
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustCache)) __obj.updateDynamic("autoAdjustCache")(autoAdjustCache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffersNotifications)) __obj.updateDynamic("buffersNotifications")(buffersNotifications.get.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheLength)) __obj.updateDynamic("cacheLength")(cacheLength.get.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryLimit)) __obj.updateDynamic("connectionRetryLimit")(connectionRetryLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEPIPEFix)) __obj.updateDynamic("disableEPIPEFix")(disableEPIPEFix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagle)) __obj.updateDynamic("disableNagle")(disableNagle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnections)) __obj.updateDynamic("maxConnections")(maxConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minConnections)) __obj.updateDynamic("minConnections")(minConnections.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(voip)) __obj.updateDynamic("voip")(voip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

