package typings.mongodb.mod

import typings.node.Buffer
import typings.node.tlsMod.PeerCertificate
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends SSLOptions {
  /**
    * @default false
    */
  var domainsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify a file sync write concern
    * @default false
    */
  var fsync: js.UndefOr[Boolean] = js.undefined
  /**
    * The High availability period for replicaset inquiry
    * @default 10000
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable command monitoring for this client
    * @default false
    */
  var monitorCommands: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var monitoring: js.UndefOr[Boolean] = js.undefined
  /**
    * Will wait # milliseconds between retries
    * @default 1000
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * @default 30
    */
  var reconnectTries: js.UndefOr[scala.Double] = js.undefined
  /**
    * Socket Options
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    checkServerIdentity: Boolean | (js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]) = null,
    ciphers: String = null,
    domainsEnabled: js.UndefOr[Boolean] = js.undefined,
    ecdhCurve: String = null,
    fsync: js.UndefOr[Boolean] = js.undefined,
    haInterval: js.UndefOr[scala.Double] = js.undefined,
    minSize: js.UndefOr[scala.Double] = js.undefined,
    monitorCommands: js.UndefOr[Boolean] = js.undefined,
    monitoring: js.UndefOr[Boolean] = js.undefined,
    poolSize: js.UndefOr[scala.Double] = js.undefined,
    reconnectInterval: js.UndefOr[scala.Double] = js.undefined,
    reconnectTries: js.UndefOr[scala.Double] = js.undefined,
    servername: String = null,
    socketOptions: SocketOptions = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[Buffer | String] = null,
    sslCRL: js.Array[Buffer | String] = null,
    sslCert: Buffer | String = null,
    sslKey: Buffer | String = null,
    sslPass: Buffer | String = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled.get.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(haInterval)) __obj.updateDynamic("haInterval")(haInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectInterval)) __obj.updateDynamic("reconnectInterval")(reconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectTries)) __obj.updateDynamic("reconnectTries")(reconnectTries.get.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA.asInstanceOf[js.Any])
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL.asInstanceOf[js.Any])
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

