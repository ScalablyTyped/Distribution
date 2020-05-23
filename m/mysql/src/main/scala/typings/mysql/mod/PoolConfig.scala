package typings.mysql.mod

import typings.mysql.anon.SecureContextOptionsrejec
import typings.mysql.mysqlStrings.DATE
import typings.mysql.mysqlStrings.DATETIME
import typings.mysql.mysqlStrings.TIMESTAMP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends ConnectionConfig {
  /**
    * The milliseconds before a timeout occurs during the connection acquisition. This is slightly different from connectTimeout,
    * because acquiring a pool connection does not always involve making a connection. (Default: 10 seconds)
    */
  var acquireTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of connections to create at once. (Default: 10)
    */
  var connectionLimit: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of connection requests the pool will queue before returning an error from getConnection. If set to 0, there
    * is no limit to the number of queued connection requests. (Default: 0)
    */
  var queueLimit: js.UndefOr[Double] = js.undefined
  /**
    * Determines the pool's action when no connections are available and the limit has been reached. If true, the pool will queue
    * the connection request and call it when one becomes available. If false, the pool will immediately call back with an error.
    * (Default: true)
    */
  var waitForConnections: js.UndefOr[Boolean] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    acquireTimeout: js.UndefOr[Double] = js.undefined,
    bigNumberStrings: js.UndefOr[Boolean] = js.undefined,
    charset: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    connectionLimit: js.UndefOr[Double] = js.undefined,
    database: String = null,
    dateStrings: Boolean | (js.Array[TIMESTAMP | DATETIME | DATE]) = null,
    debug: Boolean | (js.Array[String | Types]) = null,
    flags: String | js.Array[String] = null,
    host: String = null,
    insecureAuth: js.UndefOr[Boolean] = js.undefined,
    localAddress: String = null,
    multipleStatements: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    queryFormat: (/* query */ String, /* values */ js.Any) => String = null,
    queueLimit: js.UndefOr[Double] = js.undefined,
    socketPath: String = null,
    ssl: String | SecureContextOptionsrejec = null,
    stringifyObjects: js.UndefOr[Boolean] = js.undefined,
    supportBigNumbers: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timezone: String = null,
    trace: js.UndefOr[Boolean] = js.undefined,
    typeCast: TypeCast = null,
    user: String = null,
    waitForConnections: js.UndefOr[Boolean] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acquireTimeout)) __obj.updateDynamic("acquireTimeout")(acquireTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bigNumberStrings)) __obj.updateDynamic("bigNumberStrings")(bigNumberStrings.get.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionLimit)) __obj.updateDynamic("connectionLimit")(connectionLimit.get.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateStrings != null) __obj.updateDynamic("dateStrings")(dateStrings.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureAuth)) __obj.updateDynamic("insecureAuth")(insecureAuth.get.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleStatements)) __obj.updateDynamic("multipleStatements")(multipleStatements.get.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (queryFormat != null) __obj.updateDynamic("queryFormat")(js.Any.fromFunction2(queryFormat))
    if (!js.isUndefined(queueLimit)) __obj.updateDynamic("queueLimit")(queueLimit.get.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(stringifyObjects)) __obj.updateDynamic("stringifyObjects")(stringifyObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(supportBigNumbers)) __obj.updateDynamic("supportBigNumbers")(supportBigNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.get.asInstanceOf[js.Any])
    if (typeCast != null) __obj.updateDynamic("typeCast")(typeCast.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForConnections)) __obj.updateDynamic("waitForConnections")(waitForConnections.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

