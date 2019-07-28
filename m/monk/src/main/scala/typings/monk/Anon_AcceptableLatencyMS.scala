package typings.monk

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptableLatencyMS extends js.Object {
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

object Anon_AcceptableLatencyMS {
  @scala.inline
  def apply(
    acceptableLatencyMS: Int | Double = null,
    authSource: String = null,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    bufferMaxEntries: Int | Double = null,
    collectionOptions: js.Object = null,
    connectTimeoutMS: Int | Double = null,
    connectWithNoPrimary: js.UndefOr[Boolean] = js.undefined,
    forceServerObjectId: js.UndefOr[Boolean] = js.undefined,
    ha: js.UndefOr[Boolean] = js.undefined,
    haInterval: Int | Double = null,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    j: js.UndefOr[Boolean] = js.undefined,
    keepAlive: Int | Double = null,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    pkFactory: js.Object = null,
    poolSize: Int | Double = null,
    promiseLibrary: js.Object = null,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readConcern: js.Object = null,
    readPreference: js.Object = null,
    reconnectInterval: Int | Double = null,
    reconnectTries: Int | Double = null,
    replicaSet: String = null,
    secondaryAcceptableLatencyMS: Int | Double = null,
    serializeFunctions: js.UndefOr[Boolean] = js.undefined,
    socketTimeoutMS: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslCA: js.Array[String | Buffer] = null,
    sslCert: String | Buffer = null,
    sslKey: String | Buffer = null,
    sslPass: String | Buffer = null,
    sslValidate: js.UndefOr[Boolean] = js.undefined,
    w: String | Double = null,
    wtimeout: Int | Double = null
  ): Anon_AcceptableLatencyMS = {
    val __obj = js.Dynamic.literal()
    if (acceptableLatencyMS != null) __obj.updateDynamic("acceptableLatencyMS")(acceptableLatencyMS.asInstanceOf[js.Any])
    if (authSource != null) __obj.updateDynamic("authSource")(authSource)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (bufferMaxEntries != null) __obj.updateDynamic("bufferMaxEntries")(bufferMaxEntries.asInstanceOf[js.Any])
    if (collectionOptions != null) __obj.updateDynamic("collectionOptions")(collectionOptions)
    if (connectTimeoutMS != null) __obj.updateDynamic("connectTimeoutMS")(connectTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(connectWithNoPrimary)) __obj.updateDynamic("connectWithNoPrimary")(connectWithNoPrimary)
    if (!js.isUndefined(forceServerObjectId)) __obj.updateDynamic("forceServerObjectId")(forceServerObjectId)
    if (!js.isUndefined(ha)) __obj.updateDynamic("ha")(ha)
    if (haInterval != null) __obj.updateDynamic("haInterval")(haInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j)
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay)
    if (pkFactory != null) __obj.updateDynamic("pkFactory")(pkFactory)
    if (poolSize != null) __obj.updateDynamic("poolSize")(poolSize.asInstanceOf[js.Any])
    if (promiseLibrary != null) __obj.updateDynamic("promiseLibrary")(promiseLibrary)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (readConcern != null) __obj.updateDynamic("readConcern")(readConcern)
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference)
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (reconnectTries != null) __obj.updateDynamic("reconnectTries")(reconnectTries.asInstanceOf[js.Any])
    if (replicaSet != null) __obj.updateDynamic("replicaSet")(replicaSet)
    if (secondaryAcceptableLatencyMS != null) __obj.updateDynamic("secondaryAcceptableLatencyMS")(secondaryAcceptableLatencyMS.asInstanceOf[js.Any])
    if (!js.isUndefined(serializeFunctions)) __obj.updateDynamic("serializeFunctions")(serializeFunctions)
    if (socketTimeoutMS != null) __obj.updateDynamic("socketTimeoutMS")(socketTimeoutMS.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (sslCA != null) __obj.updateDynamic("sslCA")(sslCA)
    if (sslCert != null) __obj.updateDynamic("sslCert")(sslCert.asInstanceOf[js.Any])
    if (sslKey != null) __obj.updateDynamic("sslKey")(sslKey.asInstanceOf[js.Any])
    if (sslPass != null) __obj.updateDynamic("sslPass")(sslPass.asInstanceOf[js.Any])
    if (!js.isUndefined(sslValidate)) __obj.updateDynamic("sslValidate")(sslValidate)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceptableLatencyMS]
  }
}

