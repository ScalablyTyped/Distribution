package typings.monk.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptableLatencyMS extends js.Object {
  var acceptableLatencyMS: js.UndefOr[Double] = js.undefined
  var authSource: js.UndefOr[String] = js.undefined
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  var bufferMaxEntries: js.UndefOr[Double] = js.undefined
  var collectionOptions: js.UndefOr[js.Object] = js.undefined
  var connectTimeoutMS: js.UndefOr[Double] = js.undefined
  var connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined
  var forceServerObjectId: js.UndefOr[Boolean] = js.undefined
  var ha: js.UndefOr[Boolean] = js.undefined
  var haInterval: js.UndefOr[Double] = js.undefined
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  var j: js.UndefOr[Boolean] = js.undefined
  var keepAlive: js.UndefOr[Double] = js.undefined
  var noDelay: js.UndefOr[Boolean] = js.undefined
  var pkFactory: js.UndefOr[js.Object | Null] = js.undefined
  var poolSize: js.UndefOr[Double] = js.undefined
  var promiseLibrary: js.UndefOr[js.Object | Null] = js.undefined
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readConcern: js.UndefOr[js.Object | Null] = js.undefined
  var readPreference: js.UndefOr[js.Object | Null] = js.undefined
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  var reconnectTries: js.UndefOr[Double] = js.undefined
  var replicaSet: js.UndefOr[String] = js.undefined
  var secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.undefined
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
  var socketTimeoutMS: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var sslCA: js.UndefOr[js.Array[String | Buffer]] = js.undefined
  var sslCert: js.UndefOr[String | Buffer] = js.undefined
  var sslKey: js.UndefOr[String | Buffer] = js.undefined
  var sslPass: js.UndefOr[String | Buffer] = js.undefined
  var sslValidate: js.UndefOr[Boolean] = js.undefined
  var w: js.UndefOr[String | Double] = js.undefined
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object AcceptableLatencyMS {
  @scala.inline
  def apply(
    acceptableLatencyMS: js.UndefOr[Double] = js.undefined,
    authSource: String = null,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: js.UndefOr[Double] = js.undefined,
    collectionOptions: js.Object = null,
    connectTimeoutMS: js.UndefOr[Double] = js.undefined,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: js.UndefOr[Double] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    keepAlive: js.UndefOr[Double] = js.undefined,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    pkFactory: js.UndefOr[Null | js.Object] = js.undefined,
    poolSize: js.UndefOr[Double] = js.undefined,
    promiseLibrary: js.UndefOr[Null | js.Object] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: js.UndefOr[Null | js.Object] = js.undefined,
    readPreference: js.UndefOr[Null | js.Object] = js.undefined,
    reconnectInterval: js.UndefOr[Double] = js.undefined,
    reconnectTries: js.UndefOr[Double] = js.undefined,
    replicaSet: String = null,
    secondaryAcceptableLatencyMS: js.UndefOr[Double] = js.undefined,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    socketTimeoutMS: js.UndefOr[Double] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[String | Buffer] = null,
    sslCert: String | Buffer = null,
    sslKey: String | Buffer = null,
    sslPass: String | Buffer = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined,
    w: String | Double = null,
    wtimeout: js.UndefOr[Double] = js.undefined
  ): AcceptableLatencyMS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptableLatencyMS)) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.get.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferMaxEntries)) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.get.asInstanceOf[js.Any])
    if (collectionOptions != null) __obj.updateDynamic("collectionOptions")(collectionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeoutMS)) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(haInterval)) __obj.updateDynamic("haInterval")(haInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pkFactory)) __obj.updateDynamic("pkFactory")(pkFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(poolSize)) __obj.updateDynamic("poolSize")(poolSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promiseLibrary)) __obj.updateDynamic("promiseLibrary")(promiseLibrary.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readConcern)) __obj.updateDynamic("readConcern")(readConcern.asInstanceOf[js.Any])
    if (!js.isUndefined(readPreference)) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectInterval)) __obj.updateDynamic("reconnectInterval")(reconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectTries)) __obj.updateDynamic("reconnectTries")(reconnectTries.get.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryAcceptableLatencyMS)) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeoutMS)) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA.asInstanceOf[js.Any])
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate.get.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (!js.isUndefined(wtimeout)) __obj.updateDynamic("wtimeout")(wtimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptableLatencyMS]
  }
}

