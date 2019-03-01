package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ConnectionConfig {
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[scala.Boolean] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    acquireTimeout: scala.Int | scala.Double = null,
    bigNumberStrings: js.UndefOr[scala.Boolean] = js.undefined,
    charset: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    connectionLimit: scala.Int | scala.Double = null,
    database: java.lang.String = null,
    dateStrings: scala.Boolean | (js.Array[
      mysqlLib.mysqlLibStrings.TIMESTAMP | mysqlLib.mysqlLibStrings.DATETIME | mysqlLib.mysqlLibStrings.DATE
    ]) = null,
    debug: scala.Boolean | js.Array[java.lang.String] | js.Array[Types] = null,
    flags: js.Array[java.lang.String] = null,
    host: java.lang.String = null,
    insecureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    localAddress: java.lang.String = null,
    multipleStatements: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    queryFormat: js.Function2[/* query */ java.lang.String, /* values */ js.Any, scala.Unit] = null,
    queueLimit: scala.Int | scala.Double = null,
    socketPath: java.lang.String = null,
    ssl: java.lang.String | (nodeLib.tlsMod.SecureContextOptions with mysqlLib.Anon_RejectUnauthorized) = null,
    stringifyObjects: js.UndefOr[scala.Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timezone: java.lang.String = null,
    trace: js.UndefOr[scala.Boolean] = js.undefined,
    typeCast: TypeCast = null,
    user: java.lang.String = null,
    waitForConnections: js.UndefOr[scala.Boolean] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (acquireTimeout != null) __obj.updateDynamic("acquireTimeout")(acquireTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings)
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionLimit != null) __obj.updateDynamic("connectionLimit")(connectionLimit.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database)
    if (dateStrings != null) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(queryFormat)
    if (queueLimit != null) __obj.updateDynamic("queueLimit")(queueLimit.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects)
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    if (!js.isUndefined(waitForConnections)) __obj.updateDynamic("waitForConnections")(waitForConnections)
    __obj.asInstanceOf[PoolConfig]
  }
}

