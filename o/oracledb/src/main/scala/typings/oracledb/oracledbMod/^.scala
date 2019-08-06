package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Constant for the AqDeqOptions Class 'mode' */
  val AQ_DEQ_MODE_BROWSE: Double = js.native
  /** Constant for the AqDeqOptions Class 'mode' */
  val AQ_DEQ_MODE_LOCKED: Double = js.native
  /** Constant for the AqDeqOptions Class 'mode' */
  val AQ_DEQ_MODE_REMOVE: Double = js.native
  /** Constant for the AqDeqOptions Class 'mode' */
  val AQ_DEQ_MODE_REMOVE_NO_DAT: Double = js.native
  /** Constant for the AqDeqOptions Class 'navigation' */
  val AQ_DEQ_NAV_FIRST_MSG: Double = js.native
  /** Constant for the AqDeqOptions Class 'navigation' */
  val AQ_DEQ_NAV_NEXT_MS: Double = js.native
  /** Constant for the AqDeqOptions Class 'navigation' */
  val AQ_DEQ_NAV_NEXT_TRANSACTION: Double = js.native
  /** Constant for the AqDeqOptions Class 'wait' */
  val AQ_DEQ_NO_WAIT: Double = js.native
  /** Constant for the AqEnqOptions Class 'deliveryMode' */
  val AQ_DEQ_WAAQ_MSG_DELIV_MODE_PERSISTENTIT_FOREVER: Double = js.native
  /** Constant for the AqDeqOptions Class 'wait' */
  val AQ_DEQ_WAIT_FOREVER: Double = js.native
  /** Constant for the AqEnqOptions Class 'deliveryMode' */
  val AQ_MSG_DELIV_MODE_BUFFERED: Double = js.native
  /** Constant for the AqEnqOptions Class 'deliveryMode' */
  val AQ_MSG_DELIV_MODE_PERSISTENT_OR_BUFFERED: Double = js.native
  /** Constant for the AqMessage Class 'state' */
  val AQ_MSG_STATE_EXPIRED: Double = js.native
  /** Constant for the AqMessage Class 'state' */
  val AQ_MSG_STATE_PROCESSED: Double = js.native
  /** Constant for the AqMessage Class 'state' */
  val AQ_MSG_STATE_READY: Double = js.native
  /** Constant for the AqMessage Class 'state' */
  val AQ_MSG_STATE_WAITING: Double = js.native
  /** Constant for the AqEnqOptions Class and AqDeqOptions 'visibility' */
  val AQ_VISIBILITY_IMMEDIATE: Double = js.native
  /** Constant for the AqEnqOptions Class and AqDeqOptions 'visibility' */
  val AQ_VISIBILITY_ON_COMMIT: Double = js.native
  /** Constant for the dir property of execute() bindParams, queryStream() and executeMany() bindDefs. */
  val BIND_IN: Double = js.native
  /** Constant for the dir property of execute() bindParams, queryStream() and executeMany() bindDefs. */
  val BIND_INOUT: Double = js.native
  /** Constant for the dir property of execute() bindParams, queryStream() and executeMany() bindDefs. */
  val BIND_OUT: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val BLOB: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val BUFFER: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val CLOB: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_ALL_OPS: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_ALL_ROWS: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_ALTER: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_DELETE: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_DROP: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_INSERT: Double = js.native
  /** Constant for the Continuous Query Notification connection.subscribe() option operations, and for the notification message operation properties. */
  val CQN_OPCODE_UPDATE: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val CURSOR: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val DATE: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BFILE: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BINARY_DOUBLE: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BINARY_FLOAT: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BINARY_INTEGER: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BLOB: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_BOOLEAN: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_CHAR: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_CLOB: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_CURSOR: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_DATE: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_INTERVAL_DS: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_INTERVAL_YM: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_LONG: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_LONG_RAW: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_NCHAR: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_NCLOB: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_NUMBER: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_NVARCHAR: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_OBJECT: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_RAW: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_ROWID: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_TIMESTAMP: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_TIMESTAMP_LTZ: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_TIMESTAMP_TZ: Double = js.native
  /** Constant which represents the Oracle Database type. */
  val DB_TYPE_VARCHAR: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val DEFAULT: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val NUMBER: Double = js.native
  /** Deprecated */
  // const ARRAY: number;
  // const OBJECT: number;
  /** Constant for the query result outFormat option. */
  val OUT_FORMAT_ARRAY: Double = js.native
  /** Constant for the query result outFormat option. */
  val OUT_FORMAT_OBJECT: Double = js.native
  /** Constant for the connection pool.status readonly attribute. */
  val POOL_STATUS_CLOSED: Double = js.native
  /** Constant for the connection pool.status readonly attribute. */
  val POOL_STATUS_DRAINING: Double = js.native
  /** Constant for the connection pool.status readonly attribute. */
  val POOL_STATUS_OPEN: Double = js.native
  /**
    * Node-oracledb supports Promises on all methods. The standard Promise library is used.
    *
    * This property can be set to override or disable the Promise implementation.
    *
    * Promises can be disabled by setting this property to null.
    *
    * Example:
    *
    *      const myLib = require('myFavouritePromiseImplementation');
    *      oracledb.Promise = myLib;
    */
  var Promise: js.Promise[js.Any] = js.native
  /** Constant for the sodaDatabase.createCollection() mode property. */
  val SODA_COLL_MAP_MODE: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_ALTER: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_BEGIN: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_CALL: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_COMMIT: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_CREATE: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_DECLARE: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_DELETE: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_DROP: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_EXPLAIN_PLAN: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_INSERT: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_MERGE: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_ROLLBACK: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_SELECT: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_UNKNOWN: Double = js.native
  /** Constant for connection.getStatementInfo() properties. */
  val STMT_TYPE_UPDATE: Double = js.native
  /** Constant for execute() bind parameter type property, for the createLob() type parameter, for the Lob type property, for fetchAsBuffer, for fetchAsString and fetchInfo, and for extended metadata. */
  val STRING: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_AQ: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_DEREG: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_OBJ_CHANGE: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_QUERY_CHANGE: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_SHUTDOWN: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_SHUTDOWN_ANY: Double = js.native
  /** Constant for the Continuous Query Notification message.type. */
  val SUBSCR_EVENT_TYPE_STARTUP: Double = js.native
  /** Constant for the Continuous Query Notification groupingClass. */
  val SUBSCR_GROUPING_CLASS_TIME: Double = js.native
  /** Constant for the Continuous Query Notification groupingType. */
  val SUBSCR_GROUPING_TYPE_LAST: Double = js.native
  /** Constant for the Continuous Query Notification groupingType. */
  val SUBSCR_GROUPING_TYPE_SUMMARY: Double = js.native
  /** Constant for the Continuous Query Notification namespace. */
  val SUBSCR_NAMESPACE_AQ: Double = js.native
  /** Constant for the Continuous Query Notification namespace. */
  val SUBSCR_NAMESPACE_DBCHANGE: Double = js.native
  /** Constant for the Continuous Query Notification qos Quality of Service. */
  val SUBSCR_QOS_BEST_EFFORT: Double = js.native
  /** Constant for the Continuous Query Notification qos Quality of Service. */
  val SUBSCR_QOS_DEREG_NFY: Double = js.native
  /** Constant for the Continuous Query Notification qos Quality of Service. */
  val SUBSCR_QOS_QUERY: Double = js.native
  /** Constant for the Continuous Query Notification qos Quality of Service. */
  val SUBSCR_QOS_RELIABLE: Double = js.native
  /** Constant for the Continuous Query Notification qos Quality of Service. */
  val SUBSCR_QOS_ROWIDS: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSASM: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSBACKUP: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSDBA: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSDG: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSKM: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSOPER: Double = js.native
  /** Constant for getConnection() privilege properties. */
  val SYSRAC: Double = js.native
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    * This property may be overridden in an execute() call.
    *
    * @default false
    * @since 0.5
    */
  var autoCommit: Boolean = js.native
  /**
    * The user-chosen Connection class value defines a logical name for connections.
    * Most single purpose applications should set connectionClass when using a connection pool or DRCP.
    *
    * When a pooled session has a connection class, Oracle ensures that the session is not shared outside of that connection class.
    *
    * The connection class value is similarly used by Database Resident Connection Pooling (DRCP) to allow or disallow sharing of sessions.
    *
    * For example, where two different kinds of users share one pool, you might set connectionClass to ‘HRPOOL’ for connections that
    * access a Human Resources system, and it might be set to ‘OEPOOL’ for users of an Order Entry system.
    * Users will only be given sessions of the appropriate class, allowing maximal reuse of resources in each case,
    * and preventing any session information leaking between the two systems.
    *
    * If connectionClass is set for a non-pooled connection, the driver name is not recorded in V$ views.
    */
  var connectionClass: String = js.native
  /**
    * Sets the name used for Edition-Based Redefinition by connections.
    *
    * @since 2.2
    */
  var edition: String = js.native
  /**
    * Determines whether Oracle Client events mode should be enabled.
    *
    * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
    *
    * Events mode is required for Continuous Query Notification, Fast Application Notification (FAN) and Runtime Load Balancing (RLB).
    *
    * @default true
    * @since 2.2
    */
  var events: Boolean = js.native
  /**
    * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
    *
    * With this value, the result.metaData result.resultSet.metaData objects only include column names.
    *
    * If extendedMetaData is true then metaData will contain additional attributes.
    *
    * This property may be overridden in an execute() call.
    *
    * @default false
    * @since 1.10
    */
  var extendedMetaData: Boolean = js.native
  /**
    * If true, connections will be established using external authentication.
    *
    * The user and password properties should not be set when externalAuth is true.
    *
    * This property can be overridden in the oracledb.createPool() call and when getting a standalone connection from oracledb.getConnection().
    *
    * @default false
    * @since 0.5
    */
  var externalAuth: Boolean = js.native
  /**
    * This property sets the size of an internal buffer used for fetching query rows from Oracle Database.
    * Changing it may affect query performance but does not affect how many rows are returned to the application.
    *
    * The property is used during the default direct fetches, during ResultSet getRow() calls, and for queryStream(). It is not used for getRows().
    *
    * Increasing this value reduces the number of round-trips to the database but increases memory usage for each data fetch.
    * For queries that return a large number of rows, higher values of fetchArraySize may give better performance.
    * For queries that only return a few rows, reduce the value of fetchArraySize to minimize the amount of memory management during data fetches.
    * JavaScript memory fragmentation may occur in some cases.
    *
    * For direct fetches (those using execute() option resultSet: false), the internal buffer size will be based on the lesser of maxRows and fetchArraySize.
    *
    * @default 100
    * @since 2.0
    */
  var fetchArraySize: Double = js.native
  /**
    * Configure data types to be returned as a Buffer instead of the default representation when queried with execute() or queryStream().
    *
    * Currently the only valid type is oracledb.BLOB.
    *
    * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
    *
    * Individual query columns in execute() or queryStream() calls can override the fetchAsBuffer global setting by using fetchInfo.
    *
    * @since 1.13
    */
  var fetchAsBuffer: js.Array[Double] = js.native
  /**
    * An array of node-oracledb types. The valid types are oracledb.DATE, oracledb.NUMBER, oracledb.BUFFER, and oracledb.CLOB.
    * When any column having one of the specified types is queried with execute() or queryStream(), the column data is returned as a string instead of the default representation.
    *
    * By default in node-oracledb, all columns are returned as native types or as Lob instances, in the case of CLOB and BLOB types.
    *
    * This property helps avoid situations where using JavaScript types can lead to numeric precision loss, or where date conversion is unwanted.
    *
    * For raw data returned as a string, Oracle returns the data as a hex-encoded string.
    * For dates and numbers returned as a string, the maximum length of a string created by this mapping is 200 bytes.
    * Strings created for CLOB columns will generally be limited by Node.js and V8 memory restrictions.
    *
    * Individual query columns in execute() or queryStream() calls can override the fetchAsString global setting by using fetchInfo.
    *
    * For non-CLOB types, the conversion to string is handled by Oracle client libraries and is often referred to as defining the fetch type.
    */
  var fetchAsString: js.Array[Double] = js.native
  /**
    * The maximum number of rows that are fetched by a query with connection.execute() when not using a ResultSet.
    * Rows beyond this limit are not fetched from the database. A value of 0 means there is no limit.
    *
    * This property may be overridden in an execute() call.
    *
    * To improve database efficiency, SQL queries should use a row limiting clause like OFFSET / FETCH or equivalent.
    * The maxRows property can be used to stop badly coded queries from returning unexpectedly large numbers of rows.
    *
    * When the number of query rows is relatively big, or can not be predicted, it is recommended to use
    * a ResultSet or queryStream(). This allows applications to process rows in smaller chunks or individually,
    * preventing the Node.js memory limit being exceeded or query results being unexpectedly truncated by a
    * maxRows limit.
    *
    * @default 0 (unlimited)
    */
  var maxRows: Double = js.native
  /**
    * This readonly property gives a numeric representation of the Oracle client library version which
    * is useful in comparisons. For version a.b.c.d.e, this property
    * gives the number: (100000000 * a) + (1000000 * b) + (10000 * c) + (100 * d) + e
    *
    * @since 1.3
    */
  val oracleClientVersion: Double = js.native
  /**
    * This readonly property gives a string representation of the Oracle client library version which is useful for display.
    *
    * @since 2.2
    */
  val oracleClientVersionString: String = js.native
  /**
    * The format of query rows fetched when using connection.execute() or connection.queryStream().
    * It affects both ResultSet and non-ResultSet queries. It can be used for top level queries and REF CURSOR output.
    *
    * This can be either of the Oracledb constants oracledb.ARRAY or oracledb.OBJECT.
    *
    * If specified as oracledb.ARRAY, each row is fetched as an array of column values.
    *
    * If specified as oracledb.OBJECT, each row is fetched as a JavaScript object.
    * The object has a property for each column name, with the property value set to the respective column value.
    * The property name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    *
    * This property may be overridden in an execute() or queryStream() call.
    *
    * @default ARRAY
    */
  var outFormat: Double = js.native
  /**
    * The number of connections that are opened whenever a connection request exceeds the number of currently open connections.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 1
    */
  var poolIncrement: Double = js.native
  /**
    * The maximum number of connections to which a connection pool can grow.
    *
    * This property may be overridden when creating a connection pool.
    *
    * Importantly, if you increase poolMax you should also increase the number of threads available to node-oracledb.
    *
    * @default 4
    */
  var poolMax: Double = js.native
  /**
    * The minimum number of connections a connection pool maintains, even when there is no activity to the target database.
    *
    * This property may be overridden when creating a connection pool.
    *
    * For pools created with External Authentication or with homogeneous set to false, the number of
    * connections initially created is zero even if a larger value is specified for poolMin.
    * The pool increment is always 1, regardless of the value of poolIncrement.
    * Once the number of open connections exceeds poolMin and connections are idle for more than
    * the poolTimeout seconds, then the number of open connections does not fall below poolMin.
    *
    * @default 0
    */
  var poolMin: Double = js.native
  /**
    * When a pool getConnection() is called and the connection has been idle in the pool for at least
    * poolPingInterval seconds, node-oracledb internally “pings” the database to check the connection is alive.
    * After a ping, an unusable connection is destroyed and a usable one is returned by getConnection().
    * Connection pinging improves the chance a pooled connection is valid when it is first used because
    * identified unusable connections will not be returned to the application.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60
    * @since 1.12
    */
  var poolPingInterval: Double = js.native
  /**
    * The number of seconds after which idle connections (unused in the pool) are terminated.
    * Idle connections are terminated only when the pool is accessed. If the poolTimeout is set to 0,
    * then idle connections are never terminated.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60
    */
  var poolTimeout: Double = js.native
  /**
    * The number of milliseconds after which connection requests waiting in the connection request queue are terminated.
    * If queueTimeout is 0, then queued connection requests are never terminated.
    *
    * This property may be overridden when creating a connection pool.
    *
    * @default 60000
    * @since 1.7
    */
  var queueTimeout: Double = js.native
  /**
    * The number of statements that are cached in the statement cache of each connection.
    *
    * This property may be overridden for specific Pool or Connection objects.
    *
    * In general, set the statement cache to the size of the working set of statements being
    * executed by the application. Statement caching can be disabled by setting the size to 0.
    *
    * @default 30
    */
  var stmtCacheSize: Double = js.native
  /**
    * This readonly property gives a numeric representation of the node-oracledb version.
    * For version x.y.z, this property gives the number: (10000 * x) + (100 * y) + z
    */
  val version: Double = js.native
  /**
    * This readonly property gives a string representation of the node-oracledb version, including the version suffix if one is present.
    *
    * @since 2.1
    */
  val versionString: String = js.native
  /**
    * This readonly property gives a string representing the version suffix (e.g. “-dev” or “-beta”) or an empty string if no version suffix is present.
    *
    * @since 2.1
    */
  val versionSuffix: String = js.native
  /**
    * This method creates a pool of connections with the specified user name, password and connection string.
    * A pool is typically created once during application initialization.
    *
    * Internally, createPool() creates an Oracle Call Interface Session Pool for each Pool object.
    *
    * The default properties may be overridden by specifying new properties in the poolAttrs parameter.
    *
    * It is possible to add pools to the pool cache when calling createPool().
    * This allows pools to later be accessed by name, removing the need to pass the pool object through code.
    *
    * A pool should be terminated with the pool.close() call.
    *
    * From node-oracledb 3.1.0, the createPool() error callback will return a DPI-1047 error if node-oracledb cannot load Oracle Client libraries.
    * Previous versions threw this error from require('oracledb').
    *
    * @param poolAttributes Provides connection credentials and pool-specific configuration properties, overriding the defualt pooling properties of the Oracledb object.
    */
  def createPool(poolAttributes: PoolAttributes): js.Promise[Pool] = js.native
  def createPool(poolAttributes: PoolAttributes, callback: js.Function2[/* error */ DBError, /* pool */ Pool, Unit]): Unit = js.native
  /**
    * Obtains a connection from the default pool.
    *
    * For situations where connections are used infrequently, creating a standalone connection may be more efficient than creating and managing a connection pool.
    * However, in most cases, Oracle recommends getting connections from a connection pool.
    */
  def getConnection(): js.Promise[Connection] = js.native
  def getConnection(callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]): Unit = js.native
  /**
    * Creates a new, standalone, non-pooled connection.
    *
    * For situations where connections are used infrequently, creating a standalone connection may be more efficient than creating and managing a connection pool.
    * However, in most cases, Oracle recommends getting connections from a connection pool.
    *
    * @param connectionAttributes Connection credentials and connection-specific configuration properties.
    */
  def getConnection(connectionAttributes: ConnectionAttributes): js.Promise[Connection] = js.native
  def getConnection(
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
  def getConnection(poolAlias: String): js.Promise[Connection] = js.native
  def getConnection(poolAlias: String, callback: js.Function2[/* error */ DBError, /* connection */ Connection, Unit]): Unit = js.native
  /**
    * Retrieves a previously created pool from the connection pool cache. Note that this is a synchronous method.
    *
    * @param poolAlias
    *
    * The pool alias of the pool to retrieve from the connection pool cache.
    *
    * @default default
    */
  def getPool(): Pool = js.native
  def getPool(poolAlias: String): Pool = js.native
}

