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

