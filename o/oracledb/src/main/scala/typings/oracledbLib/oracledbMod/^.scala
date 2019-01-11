package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oracledb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** outFormat */
  val ARRAY: scala.Double = js.native
  /** Bind direction */
  val BIND_IN: scala.Double = js.native
  /** Bind direction */
  val BIND_INOUT: scala.Double = js.native
  /** Bind direction */
  val BIND_OUT: scala.Double = js.native
  /** Data type */
  val BLOB: scala.Double = js.native
  /** Data type */
  val BUFFER: scala.Double = js.native
  /** Data type */
  val CLOB: scala.Double = js.native
  /** Data type */
  val CURSOR: scala.Double = js.native
  /**
  	 * Readonly reference to the native connection object.
  	 */
  var Connection: js.Any = js.native
  /** Data type */
  val DATE: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_BINARY_DOUBLE: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_BINARY_FLOAT: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_BLOB: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_CHAR: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_CLOB: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_DATE: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_NUMBER: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_RAW: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_ROWID: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_TIMESTAMP: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_TIMESTAMP_LTZ: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_TIMESTAMP_TZ: scala.Double = js.native
  /** Metadata return type */
  val DB_TYPE_VARCHAR: scala.Double = js.native
  val DEFAULT: scala.Double = js.native
  /**
  	 * Readonly reference to the native Lob object.
  	 */
  var Lob: js.Any = js.native
  /** Data type */
  val NUMBER: scala.Double = js.native
  /** outFormat */
  val OBJECT: scala.Double = js.native
  /**
  	 * Readonly reference to the native oracledb.
  	 */
  var Oracledb: js.Any = js.native
  /**
  	 * Node-oracledb supports Promises on all methods. The standard Promise library is used in Node 0.12 and greater.
  	 * Promise support is not enabled by default in Node 0.10.
  	 * You can change the Promisse library to any default ES6 compatible library (like bluebird).
  	 */
  var Promise: js.Any = js.native
  /**
  	 * Reference to the native ResultSet object.
  	 */
  var ResultSet: js.Any = js.native
  /** Data type */
  val STRING: scala.Double = js.native
  /** Default transaction behaviour of auto commit for each statement. */
  var autoCommit: scala.Boolean = js.native
  /**
  	 * The user-chosen Connection class value defines a logical name for connections. Most single purpose applications should set connectionClass when using a connection pool or DRCP.
  	 * When a pooled session has a connection class, Oracle ensures that the session is not shared outside of that connection class.
  	 */
  var connectionClass: java.lang.String = js.native
  /**
  	 * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
  	 * The default value for extendedMetaData is false. With this value, the result.metaData result.resultSet.metaData objects only include column names.
  	 */
  var extendedMetaData: scala.Boolean = js.native
  /** Default authentication/authorization method. When true, the SO trusted user will be used. */
  var externalAuth: scala.Boolean = js.native
  /**
  	 * An array of node-oracledb types. When any column having the specified type is queried with execute(), the column data is returned as a string instead of the native representation. For column types not specified in fetchAsString, native types will be returned.
  	 * By default all columns are returned as native types.
  	 */
  var fetchAsString: js.Array[scala.Double] = js.native
  /** Default size in bytes that the driver will fetch from LOBs in advance. */
  var lobPrefetchSize: scala.Double = js.native
  /** Default maximum number of rows to be fetched in statements not using ResultSets */
  var maxRows: scala.Double = js.native
  /** Version of OCI that is used. */
  var oracleClientVersion: scala.Double = js.native
  /** Default format for returning rows. When ARRAY, it will return Array<Array<any>>. When OBJECT, it will return Array<Object>. */
  var outFormat: scala.Double = js.native
  /** Default number of connections to increment when available connections reach 0 in created pools. poolMax will be respected. */
  var poolIncrement: scala.Double = js.native
  /** Default maximum connections in created pools */
  var poolMax: scala.Double = js.native
  /** Default minimum connections in created pools */
  var poolMin: scala.Double = js.native
  /** Default timeout for unused connections in pool to be released. poolMin will be respected. */
  var poolTimeout: scala.Double = js.native
  /** Default number of rows that the driver will fetch in each query. */
  var prefetchRows: scala.Double = js.native
  /**
  	 * If this property is true and the number of connections "checked out" from the pool has reached the number specified by poolMax, then new requests for connections are queued until in-use connections are released.
  	 * If this property is false and a request for a connection is made from a pool where the number of "checked out" connections has reached poolMax, then an ORA-24418 error indicating that further sessions cannot be opened will be returned.
  	 * The default value is true.
  	 */
  var queueRequests: scala.Boolean = js.native
  /**
  	 * The number of milliseconds after which connection requests waiting in the connection request queue are terminated. If queueTimeout is 0, then queued connection requests are never terminated.
  	 * The default value is 60000.
  	 */
  var queueTimeout: scala.Double = js.native
  /** Default size of statements cache. Used to speed up creating queries. */
  var stmtCacheSize: scala.Double = js.native
  /** node-oracledb driver version. */
  var version: scala.Double = js.native
  /**
  	 * Creates a database managed connection pool.
  	 * @param  {IPoolAttributes} poolAttributes Parameters to stablish the connection pool.
  	 * @returns Promise {(connection:IConnectionPool)=>any} Promise with the connection pool.
  	 */
  def createPool(poolAttributes: oracledbLib.oracledbMod.oracledbNs.IPoolAttributes): oracledbLib.oracledbMod.oracledbNs.IPromise[oracledbLib.oracledbMod.oracledbNs.IConnectionPool] = js.native
  /**
  	 * Creates a database managed connection pool.
  	 * @param  {IPoolAttributes} poolAttributes Parameters to stablish the connection pool.
  	 * @param  {(err:any,connection:IConnectionPool)=>void} callback Callback to run when the connection pool gets created or when some error occurs.
  	 * @returns void
  	 */
  def createPool(
    poolAttributes: oracledbLib.oracledbMod.oracledbNs.IPoolAttributes,
    callback: js.Function2[
      /* err */ js.Any, 
      /* connection */ oracledbLib.oracledbMod.oracledbNs.IConnectionPool, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Creates a connection with the database. The pool name will be "default".
  	 * @returns  {(connection:IConnection)=>any} Promise with the connection.
  	 */
  def getConnection(): oracledbLib.oracledbMod.oracledbNs.IPromise[oracledbLib.oracledbMod.oracledbNs.IConnection] = js.native
  /**
  	 * Creates a connection with the database - the pool alias will be "default".
  	 * @param  {(err:any,connection:IConnection)=>void} callback Callback to run when the connection gets stablished or when some error occurs.
  	 * @returns void
  	 */
  def getConnection(
    callback: js.Function2[
      /* err */ js.Any, 
      /* connection */ oracledbLib.oracledbMod.oracledbNs.IConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Creates a connection with the database.
  	 * @param  {IConnectionAttributes} connectionAttributes Parameters to stablish the connection.
  	 * @returns  {(connection:IConnection)=>any} Promise with the connection.
  	 */
  def getConnection(connectionAttributes: oracledbLib.oracledbMod.oracledbNs.IConnectionAttributes): oracledbLib.oracledbMod.oracledbNs.IPromise[oracledbLib.oracledbMod.oracledbNs.IConnection] = js.native
  /**
  	 * Creates a connection with the database.
  	 * @param  {IConnectionAttributes} connectionAttributes Parameters to stablish the connection.
  	 * @param  {(err:any,connection:IConnection)=>void} callback Callback to run when the connection gets stablished or when some error occurs.
  	 * @returns void
  	 */
  def getConnection(
    connectionAttributes: oracledbLib.oracledbMod.oracledbNs.IConnectionAttributes,
    callback: js.Function2[
      /* err */ js.Any, 
      /* connection */ oracledbLib.oracledbMod.oracledbNs.IConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Creates a connection with the database.
  	 * @param  {string} poolAlias Poll from which the connection should be retrieved.
  	 * @returns  {(connection:IConnection)=>any} Promise with the connection.
  	 */
  def getConnection(poolAlias: java.lang.String): oracledbLib.oracledbMod.oracledbNs.IPromise[oracledbLib.oracledbMod.oracledbNs.IConnection] = js.native
  /**
  	 * Creates a connection with the database.
  	 * @param  {string} poolAlias Poll from which the connection should be retrieved.
  	 * @param  {(err:any,connection:IConnection)=>void} callback Callback to run when the connection gets stablished or when some error occurs.
  	 * @returns void
  	 */
  def getConnection(
    poolAlias: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* connection */ oracledbLib.oracledbMod.oracledbNs.IConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
  	 * Retrieves a connection pool from cache. If it does not exists, an error will be thrown.
  	 * @param {string} alias The index of the cache for the pool. If none is passed, it will use the default one.
  	 * @returns The connection pool or throws an error if it was not found.
  	 */
  def getPool(): oracledbLib.oracledbMod.oracledbNs.IConnectionPool = js.native
  def getPool(poolAlias: java.lang.String): oracledbLib.oracledbMod.oracledbNs.IConnectionPool = js.native
  /**
  	 * Do not use this method - used internally by node-oracledb.
  	 */
  def newLob(iLob: oracledbLib.oracledbMod.oracledbNs.ILob): oracledbLib.oracledbMod.oracledbNs.Lob = js.native
}

