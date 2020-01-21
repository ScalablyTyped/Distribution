package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a pool of connections to the database.
  */
@js.native
trait Pool extends js.Object {
  /**
    * The number of currently active connections in the connection pool i.e. the number of connections currently “checked out” using getConnection().
    */
  val connectionsInUse: Double = js.native
  /**
    * The number of currently open connections in the underlying connection pool.
    */
  val connectionsOpen: Double = js.native
  /**
    * The alias of this pool in the connection pool cache. An alias cannot be changed once the pool has been created.
    */
  val poolAlias: js.UndefOr[String] = js.native
  /**
    * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
    */
  val poolIncrement: Double = js.native
  /**
    * The maximum number of connections that can be open in the connection pool.
    */
  val poolMax: Double = js.native
  /**
    * The maximum number of connections per shard for connection pools. This ensures that the pool is balanced towards each shard.
    * 
    * @since 4.1
    */
  val poolMaxPerShard: Double = js.native
  /**
    * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
    */
  val poolMin: Double = js.native
  /**
    * The maximum number of seconds that a connection can remain idle in a connection pool (not “checked out” to the application by getConnection())
    * before node-oracledb pings the database prior to returning that connection to the application.
    */
  val poolPingInterval: Double = js.native
  /**
    * The time (in seconds) after which the pool terminates idle connections (unused in the pool).
    * The number of connections does not drop below poolMin.
    */
  val poolTimeout: Double = js.native
  /**
    * The time (in milliseconds) that a connection request should wait in the queue before the request is terminated.
    */
  val queueTimeout: Double = js.native
  /**
    * One of the POOL_STATUS_* constants indicating whether the pool is open, being drained of in-use connections, or has been closed.
    */
  val status: Double = js.native
  /**
    * The number of statements to be cached in the statement cache of each connection.
    */
  val stmtCacheSize: Double = js.native
  /**
    * If _enableStats is true, this method can be used to output statistics to the console.
    */
  def _logStats(): Unit = js.native
  /**
    * This call closes connections in the pool and terminates the connection pool.
    *
    * If a drainTime is not given, then any open connections should be released with connection.close()
    * before pool.close() is called, otherwise the pool close will fail and the pool will remain open.
    *
    * If a drainTime is specified, then any new pool.getConnection() calls will fail. If connections are in
    * use by the application, they can continue to be used for the specified number of seconds, after which
    * the pool and all open connections are forcibly closed. Prior to this time limit, if there are no
    * connections currently “checked out” from the pool with getConnection(), then the pool and any connections
    * that are idle in the pool are immediately closed. Non-zero drainTime values are strongly recommended so
    * applications have the opportunity to gracefully finish database operations. A drainTime of 0 may be
    * used to close a pool and its connections immediately.
    *
    * In network configurations that drop (or in-line) out-of-band breaks, forced pool termination may hang
    * unless you have DISABLE_OOB=ON in a sqlnet.ora file, see Optional Oracle Net Configuration.
    *
    * When the pool is closed, it will be removed from the connection pool cache.
    *
    * @param drainTime
    *
    * The number of seconds before the pool and connections are force closed.
    *
    * If drainTime is 0, the pool and its connections are closed immediately.
    *
    * @alias terminate
    * @since 1.9
    */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  def close(drainTime: Double): js.Promise[Unit] = js.native
  def close(drainTime: Double, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  /**
    * This method obtains a connection from the connection pool.
    *
    * If a previously opened connection is available in the pool, that connection is returned.
    * If all connections in the pool are in use, a new connection is created and returned to the caller,
    * as long as the number of connections does not exceed the specified maximum for the pool.
    * If the pool is at its maximum limit, the getConnection() call results in an error, such as ORA-24418:
    * Cannot open further sessions.
    *
    * By default pools are created with homogeneous set to true. The user name and password are supplied
    * when the pool is created. Each time pool.getConnection() is called, a connection for that user is returned:
    *
    *      pool.getConnection(
    *          function (err, conn) { ... }
    *      );
    *
    * If a heterogeneous pool was created by setting homogeneous to false during creation and credentials
    * were omitted, then the user name and password may be used in pool.getConnection() like:
    *
    *      pool.getConnection(
    *          {
    *              user     : 'hr',
    *              password : mypw,  // mypw contains the hr schema password
    *          },
    *          function (err, conn) { ... }
    *      );
    *
    * In this case, different user names may be used each time pool.getConnection() is called.
    * Proxy users may also be specified.
    *
    * @param poolAttributes Contains properties related to the pool used to retrieve the connection.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#connectionhandling
    * @see https://oracle.github.io/node-oracledb/doc/api.html#connpoolproxy
    */
  def getConnection(): js.Promise[Connection] = js.native
  def getConnection(callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]): Unit = js.native
  def getConnection(poolAttributes: GetPooledConnectionOptions): js.Promise[Connection] = js.native
  def getConnection(
    poolAttributes: GetPooledConnectionOptions,
    callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]
  ): Unit = js.native
  /**
    * This call closes connections in the pool and terminates the connection pool.
    *
    * If a drainTime is not given, then any open connections should be released with connection.close()
    * before pool.close() is called, otherwise the pool close will fail and the pool will remain open.
    *
    * If a drainTime is specified, then any new pool.getConnection() calls will fail. If connections are in
    * use by the application, they can continue to be used for the specified number of seconds, after which
    * the pool and all open connections are forcibly closed. Prior to this time limit, if there are no
    * connections currently “checked out” from the pool with getConnection(), then the pool and any connections
    * that are idle in the pool are immediately closed. Non-zero drainTime values are strongly recommended so
    * applications have the opportunity to gracefully finish database operations. A drainTime of 0 may be
    * used to close a pool and its connections immediately.
    *
    * In network configurations that drop (or in-line) out-of-band breaks, forced pool termination may hang
    * unless you have DISABLE_OOB=ON in a sqlnet.ora file, see Optional Oracle Net Configuration.
    *
    * When the pool is closed, it will be removed from the connection pool cache.
    *
    * @param drainTime
    *
    * The number of seconds before the pool and connections are force closed.
    *
    * If drainTime is 0, the pool and its connections are closed immediately.
    *
    * @alias close
    */
  def terminate(): js.Promise[Unit] = js.native
  def terminate(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  def terminate(drainTime: Double): js.Promise[Unit] = js.native
  def terminate(drainTime: Double, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
}

