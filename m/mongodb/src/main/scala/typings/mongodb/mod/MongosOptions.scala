package typings.mongodb.mod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongosOptions
  extends SSLOptions
     with HighAvailabilityOptions {
  /**
    * Default: 15; Cutoff latency point in MS for MongoS proxy selection
    */
  var acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}

object MongosOptions {
  @scala.inline
  def apply(
    acceptableLatencyMS: js.UndefOr[scala.Double] = js.undefined,
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]) = null,
    ciphers: String = null,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: js.UndefOr[scala.Double] = js.undefined,
    minSize: js.UndefOr[scala.Double] = js.undefined,
    poolSize: js.UndefOr[scala.Double] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    readPreferenceTags: js.Array[String] = null,
    servername: String = null,
    socketOptions: SocketOptions = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined
  ): MongosOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptableLatencyMS)) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.get.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled.get.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(haInterval)) __obj.updateDynamic("haInterval")(haInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (readPreferenceTags != null) __obj.updateDynamic("readPreferenceTags")(readPreferenceTags.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA.asInstanceOf[js.Any])
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL.asInstanceOf[js.Any])
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongosOptions]
  }
}

