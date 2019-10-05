package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", "getConnection")
@js.native
object getConnection extends js.Object {
  /**
    * Obtains a connection from the default pool.
    *
    * For situations where connections are used infrequently, creating a standalone connection may be more efficient than creating and managing a connection pool.
    * However, in most cases, Oracle recommends getting connections from a connection pool.
    */
  def apply(): js.Promise[Connection] = js.native
  def apply(callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]): Unit = js.native
  /**
    * Creates a new, standalone, non-pooled connection.
    *
    * For situations where connections are used infrequently, creating a standalone connection may be more efficient than creating and managing a connection pool.
    * However, in most cases, Oracle recommends getting connections from a connection pool.
    *
    * @param connectionAttributes Connection credentials and connection-specific configuration properties.
    */
  def apply(connectionAttributes: ConnectionAttributes): js.Promise[Connection] = js.native
  def apply(
    connectionAttributes: ConnectionAttributes,
    callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]
  ): Unit = js.native
  /**
    * Obtains a connection from a pool in the connection pool cache.
    *
    * For situations where connections are used infrequently, creating a standalone connection may be more efficient than creating and managing a connection pool.
    * However, in most cases, Oracle recommends getting connections from a connection pool.
    *
    * @param poolAlias Specifies which previously created pool in the connection pool cache to use to obtain the connection.
    */
  def apply(poolAlias: String): js.Promise[Connection] = js.native
  def apply(poolAlias: String, callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]): Unit = js.native
}

