package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends SSLOptions {
  /**
    * Default: false;
    */
  var domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify a file sync write concern
    * Default: false
    */
  var fsync: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 10000; The High availability period for replicaset inquiry
    */
  var haInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable command monitoring for this client
    * Default: false
    */
  var monitorCommands: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true;
    */
  var monitoring: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will wait # milliseconds between retries
    * Default: 1000;
    */
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * If you're connected to a single server or mongos proxy (as opposed to a replica set),
    * the MongoDB driver will try to reconnect every reconnectInterval milliseconds for reconnectTries
    * times, and give up afterward. When the driver gives up, the mongoose connection emits a
    * reconnectFailed event.
    * Default: 30
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
    checkServerIdentity: scala.Boolean | (js.Function2[
      /* host */ java.lang.String, 
      /* cert */ nodeLib.tlsMod.PeerCertificate, 
      js.UndefOr[nodeLib.Error]
    ]) = null,
    ciphers: java.lang.String = null,
    domainsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ecdhCurve: java.lang.String = null,
    fsync: js.UndefOr[scala.Boolean] = js.undefined,
    haInterval: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    monitorCommands: js.UndefOr[scala.Boolean] = js.undefined,
    monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    poolSize: scala.Int | scala.Double = null,
    reconnectInterval: scala.Int | scala.Double = null,
    reconnectTries: scala.Int | scala.Double = null,
    servername: java.lang.String = null,
    socketOptions: SocketOptions = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    sslCA: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCRL: js.Array[nodeLib.Buffer | java.lang.String] = null,
    sslCert: nodeLib.Buffer | java.lang.String = null,
    sslKey: nodeLib.Buffer | java.lang.String = null,
    sslPass: nodeLib.Buffer | java.lang.String = null,
    sslValidate: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(domainsEnabled)) __obj.updateDynamic("domainsEnabled")(domainsEnabled)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(fsync)) __obj.updateDynamic("fsync")(fsync)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorCommands)) __obj.updateDynamic("monitorCommands")(monitorCommands)
    if (!js.isUndefined(monitoring)) __obj.updateDynamic("monitoring")(monitoring)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA)
    if (sslCRL != null) __obj.updateDynamic("sslCRL")(sslCRL)
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate)
    __obj.asInstanceOf[ServerOptions]
  }
}

