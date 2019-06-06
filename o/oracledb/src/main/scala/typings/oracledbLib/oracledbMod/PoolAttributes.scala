package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides connection credentials and pool-specific configuration properties.
  * The properties provided override the default pooling properties of the Oracledb object.
  * If an attribute is not set, or is null, the value of the related Oracledb property will be used.
  */
trait PoolAttributes extends js.Object {
  /**
    * Further statistics can be enabled by setting the createPool() poolAttrs parameter _enableStats to true.
    * Statistics can be output to the console by calling the pool._logStats() method.
    */
  var _enableStats: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An alias of connectionString. Only one of the properties should be used.
    * The Oracle database instance used by connections in the pool.
    * The string can be an Easy Connect string, or a Net Service Name from a tnsnames.ora file, or the name of a local Oracle database instance.
    */
  var connectString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An alias of connectString. Only one of the properties should be used.
    * The Oracle database instance used by connections in the pool.
    * The string can be an Easy Connect string, or a Net Service Name from a tnsnames.ora file, or the name of a local Oracle database instance.
    *
    * @since 2.1
    */
  var connectionString: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the name used for Edition-Based Redefinition by connections in the pool.
    * This optional property overrides the oracledb.edition property.
    *
    * @since 2.2
    */
  var edition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicate whether Oracle Call Interface events mode should be enabled for this pool.
    * This optional property overrides the oracledb.events property.
    *
    * @default false
    * @since 2.2
    */
  var events: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicate whether pooled connections should be established using External Authentication.
    * This optional property overrides the oracledb.externalAuth property.
    * The user and password properties should not be set when externalAuth is true.
    *
    * @default false
    * @since 0.5
    */
  var externalAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicate whether connections in the pool all have the same credentials (a ‘homogeneous’ pool), or whether different credentials can be used (a ‘heterogeneous’ pool).
    * When set to false, the user name and password can be omitted from the connection.createPool() call, but will need to be given for subsequent pool.getConnection() calls.
    * Different pool.getConnection() calls can provide different user credentials.
    * Alternatively, when homogeneous is false, the user name (the ‘proxy’ user name) and password can be given, but subsequent pool.getConnection() calls can specify a different user name to access that user’s schema.
    * Heterogeneous pools cannot be used with the connection pool cache. Applications should ensure the pool object is explicitly passed between code modules, or use a homogeneous pool and make use of connection.clientId.
    *
    * @default true
    * @since 2.3
    */
  var homogeneous: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The password of the database user used by connections in the pool. A password is also necessary if a proxy user is specified at pool creation.
    * If homogeneous is false, then the password may be omitted at pool creation but given in subsequent pool.getConnection() calls.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The poolAlias is an optional property that is used to explicitly add pools to the connection pool cache.
    * If a pool alias is provided, then the new pool will be added to the connection pool cache and the poolAlias value can then be used with methods that utilize the connection pool cache, such as oracledb.getPool() and oracledb.getConnection().
    *
    * @since 1.11
    */
  var poolAlias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
    * This optional property overrides the oracledb.poolIncrement property.
    *
    * @default 1
    */
  var poolIncrement: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of connections to which a connection pool can grow.
    * This optional property overrides the oracledb.poolMax property.
    * Importantly, if you increase poolMax you should also increase the number of threads available to node-oracledb.
    *
    * @default 4
    */
  var poolMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
    * This optional property overrides the oracledb.poolMin property.
    *
    * @default 0
    */
  var poolMin: js.UndefOr[scala.Double] = js.undefined
  /**
    * When a pool getConnection() is called and the connection has been idle in the pool for
    * at least poolPingInterval seconds, an internal “ping” will be performed first to check the aliveness of the connection.
    * This optional property overrides the oracledb.poolPingInterval property.
    *
    * @default 60
    */
  var poolPingInterval: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of seconds after which idle connections (unused in the pool) may be terminated.
    * Idle connections are terminated only when the pool is accessed.
    * This optional property overrides the oracledb.poolTimeout property.
    *
    * @default 60
    */
  var poolTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of milliseconds after which connection requests waiting in the connection request queue are terminated.
    * If queueTimeout is set to 0, then queued connection requests are never terminated.
    * This optional property overrides the oracledb.queueTimeout property.
    *
    * @default 60000
    */
  var queueTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * When sessionCallback is a Node.js function, it will be invoked for each pool.getConnection() call that will return a newly created connection in the pool.
    * It will also be called if pool.getConnection() requests a connection from the pool with a given tag, and that tag value does not match the connection’s current actual tag.
    * It will not be invoked for other getConnection() calls. The tag requested by pool.getConnection() is passed as the requestedTag parameter and the actual tag is available in connection.tag.
    *
    * The session callback is called before getConnection() returns so it can be used to do logging or efficiently set session state such as with ALTER SESSION statements.
    * Make sure any session state is set and connection.tag is updated in the sessionCallback function prior to it calling its own callback function otherwise the session will not be correctly set when getConnection() returns.
    *
    * When node-oracledb is using Oracle Client libraries 12.2 or later, the tag must be a multi-property tag with name=value pairs like “k1=v1;k2=v2”.
    * When using Oracle Client libraries 12.2 or later, sessionCallback can be a string containing the name of a PL/SQL procedure to be called when pool.getConnection() requests a tag, and that tag does not match the connection’s actual tag.
    * When the application uses DRCP connections, a PL/SQL callback can avoid the round-trip calls that a Node.js function would require to set session state. For non-DRCP connections, the PL/SQL callback will require a round-trip from the application.
    *
    * The PL/SQL procedure declaration is:
    *
    *      PROCEDURE mycallback (
    *         desired_props IN  VARCHAR2,
    *         actual_props  IN  VARCHAR2
    *      );
    *
    * @since 3.1
    */
  var sessionCallback: js.UndefOr[
    java.lang.String | (js.Function3[
      /* connection */ Connection, 
      /* requestedTag */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[DBError], scala.Unit], 
      scala.Unit
    ])
  ] = js.undefined
  /**
    * The number of statements to be cached in the statement cache of each connection in the pool.
    * This optional property overrides the oracledb.stmtCacheSize property.
    */
  var stmtCacheSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The database user name for connections in the pool. Can be a simple user name or a proxy of the form alison[fred].
    * If homogeneous is false, then the pool user name and password need to be specified only if the application wants that user to proxy the users supplied in subsequent pool.getConnection() calls.
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object PoolAttributes {
  @scala.inline
  def apply(
    _enableStats: js.UndefOr[scala.Boolean] = js.undefined,
    connectString: java.lang.String = null,
    connectionString: java.lang.String = null,
    edition: java.lang.String = null,
    events: js.UndefOr[scala.Boolean] = js.undefined,
    externalAuth: js.UndefOr[scala.Boolean] = js.undefined,
    homogeneous: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    poolAlias: java.lang.String = null,
    poolIncrement: scala.Int | scala.Double = null,
    poolMax: scala.Int | scala.Double = null,
    poolMin: scala.Int | scala.Double = null,
    poolPingInterval: scala.Int | scala.Double = null,
    poolTimeout: scala.Int | scala.Double = null,
    queueTimeout: scala.Int | scala.Double = null,
    sessionCallback: java.lang.String | (js.Function3[
      /* connection */ Connection, 
      /* requestedTag */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[DBError], scala.Unit], 
      scala.Unit
    ]) = null,
    stmtCacheSize: scala.Int | scala.Double = null,
    user: java.lang.String = null
  ): PoolAttributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_enableStats)) __obj.updateDynamic("_enableStats")(_enableStats)
    if (connectString != null) __obj.updateDynamic("connectString")(connectString)
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString)
    if (edition != null) __obj.updateDynamic("edition")(edition)
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(externalAuth)) __obj.updateDynamic("externalAuth")(externalAuth)
    if (!js.isUndefined(homogeneous)) __obj.updateDynamic("homogeneous")(homogeneous)
    if (password != null) __obj.updateDynamic("password")(password)
    if (poolAlias != null) __obj.updateDynamic("poolAlias")(poolAlias)
    if (poolIncrement != null) __obj.updateDynamic("poolIncrement")(poolIncrement.asInstanceOf[js.Any])
    if (poolMax != null) __obj.updateDynamic("poolMax")(poolMax.asInstanceOf[js.Any])
    if (poolMin != null) __obj.updateDynamic("poolMin")(poolMin.asInstanceOf[js.Any])
    if (poolPingInterval != null) __obj.updateDynamic("poolPingInterval")(poolPingInterval.asInstanceOf[js.Any])
    if (poolTimeout != null) __obj.updateDynamic("poolTimeout")(poolTimeout.asInstanceOf[js.Any])
    if (queueTimeout != null) __obj.updateDynamic("queueTimeout")(queueTimeout.asInstanceOf[js.Any])
    if (sessionCallback != null) __obj.updateDynamic("sessionCallback")(sessionCallback.asInstanceOf[js.Any])
    if (stmtCacheSize != null) __obj.updateDynamic("stmtCacheSize")(stmtCacheSize.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[PoolAttributes]
  }
}

