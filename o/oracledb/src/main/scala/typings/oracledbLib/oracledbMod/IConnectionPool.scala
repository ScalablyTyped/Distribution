package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Emits "_after_close" event */
@js.native
trait IConnectionPool
  extends nodeLib.eventsMod.EventEmitter {
  /**
  		 * The number of currently active connections in the connection pool i.e. the number of connections currently checked-out using getConnection().
  		 */
  var connectionsInUse: scala.Double = js.native
  /**
  		 * The number of currently open connections in the underlying connection pool.
  		 */
  var connectionsOpen: scala.Double = js.native
  /**
  		 * The readonly alias of this pool in the connection pool cache. An alias cannot be changed once the pool has been created.
  		 */
  var poolAlias: java.lang.String = js.native
  /**
  		 * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
  		 */
  var poolIncrement: scala.Double = js.native
  /**
  		 * The maximum number of connections that can be open in the connection pool.
  		 */
  var poolMax: scala.Double = js.native
  /**
  		 * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
  		 */
  var poolMin: scala.Double = js.native
  /**
  		 * The time (in seconds) after which the pool terminates idle connections (unused in the pool). The number of connections does not drop below poolMin.
  		 */
  var poolTimeout: scala.Double = js.native
  /**
  		 * Determines whether requests for connections from the pool are queued when the number of connections "checked out" from the pool has reached the maximum number specified by poolMax.
  		 */
  var queueRequests: scala.Double = js.native
  /**
  		 * The time (in milliseconds) that a connection request should wait in the queue before the request is terminated.
  		 */
  var queueTimeout: scala.Double = js.native
  /**
  		 * The number of statements to be cached in the statement cache of each connection.
  		 */
  var stmtCacheSize: scala.Double = js.native
  /**
  		 * Finalizes the connection pool.
  		 * @returns Promise to when the close finishes.
  		 */
  def close(): IPromise[scala.Unit] = js.native
  /**
  		 * Finalizes the connection pool.
  		 * @param  {(err:any)=>void} callback Callback called when the pool is terminated or when some error occurs
  		 * @returns void
  		 */
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * This method obtains a connection from the connection pool.
  		 * If a previously opened connection is available in the pool, that connection is returned. If all connections in the pool are in use, a new connection is created and returned to the caller, as long as the number of connections does not exceed the specified maximum for the pool. If the pool is at its maximum limit, the getConnection() call results in an error, such as ORA-24418: Cannot open further sessions.
  		 * @returns  An IConnection Promise to when the connection is available or when some error occurs.
  		 * @see {@link https://jsao.io/2015/03/making-a-wrapper-module-for-the-node-js-driver-for-oracle-database/}
  		 * @see {@link https://github.com/OraOpenSource/orawrap}
  		 */
  def getConnection(): IPromise[IConnection] = js.native
  /**
  		 * This method obtains a connection from the connection pool.
  		 * If a previously opened connection is available in the pool, that connection is returned. If all connections in the pool are in use, a new connection is created and returned to the caller, as long as the number of connections does not exceed the specified maximum for the pool. If the pool is at its maximum limit, the getConnection() call results in an error, such as ORA-24418: Cannot open further sessions.
  		 * @param  {(err:any,connection:IConnection)=>void} callback Callback called when the connection is available or when some error occurs.
  		 * @returns void
  		 * @see {@link https://jsao.io/2015/03/making-a-wrapper-module-for-the-node-js-driver-for-oracle-database/}
  		 * @see {@link https://github.com/OraOpenSource/orawrap}
  		 */
  def getConnection(callback: js.Function2[/* err */ js.Any, /* connection */ IConnection, scala.Unit]): scala.Unit = js.native
  /**
  		 * An alias for IConnectionPool.close().
  		 * @returns Promise to when the close finishes.
  		 */
  def terminate(): IPromise[scala.Unit] = js.native
  /**
  		 * An alias for IConnectionPool.close().
  		 * @param  {(err:any)=>void} callback Callback called when the pool is terminated or when some error occurs
  		 * @returns void
  		 */
  def terminate(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

