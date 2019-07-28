package typings.mongodb.mongodbMod

import typings.node.Buffer
import typings.node.Error
import typings.node.tlsMod.PeerCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplSetOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * The max staleness to secondary reads (values under 10 seconds cannot be guaranteed);
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the replicaset to connect to.
    */
  var replicaSet: js.UndefOr[String] = js.undefined
  /**
    * Default: 15 ; Range of servers to pick when using NEAREST (lowest ping ms + the latency fence, ex: range of 1 to (1 + 15) ms)
    */
  var secondaryAcceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}

object ReplSetOptions {
  @scala.inline
  def apply(
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]) = null,
    ciphers: String = null,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: Int | scala.Double = null,
    maxStalenessSeconds: Int | scala.Double = null,
    minSize: Int | scala.Double = null,
    poolSize: Int | scala.Double = null,
    readPreference: ReadPreference | String = null,
    readPreferenceTags: js.Array[String] = null,
    replicaSet: String = null,
    secondaryAcceptableLatencyMS: Int | scala.Double = null,
    servername: String = null,
    socketOptions: SocketOptions = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined
  ): ReplSetOptions = {
    val __obj = js.Dynamic.literal()
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary)
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags)
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (secondaryAcceptableLatencyMS != null) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA)
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL)
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate)
    __obj.asInstanceOf[ReplSetOptions]
  }
}

