package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends StObject {
  
  /**
    * The action attribute for end-to-end application tracing.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Stops the currently running operation on the connection.
    *
    * If there is no operation in progress or the operation has completed by the time the break is issued, the break() is effectively a no-op.
    *
    * If the running asynchronous operation is interrupted, its callback will return an error.
    *
    * In network configurations that drop (or in-line) out-of-band breaks, break() may hang unless you have DISABLE_OOB=ON in a sqlnet.ora file.
    *
    * If you use use break() with DRCP connections, it is currently recommended to drop the connection when releasing it back to the pool: await connection.close({drop: true}).
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#tnsadmin
    */
  def break(): js.Promise[Unit] = js.native
  def break(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Sets the maximum number of milliseconds that each underlying round-trip between node-oracledb and Oracle Database may take.
    * Each node-oracledb method or operation may make zero or more round-trips.
    * The callTimeout value applies to each round-trip individually, not to the sum of all round-trips.
    * Time spent processing in node-oracledb before or after the completion of each round-trip is not counted.
    */
  var callTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Changes the password of the specified user.
    *
    * Only users with the ALTER USER privilege can change passwords of other users.
    *
    * @param user The name of the user whose password is to be changed.
    * @param oldPassword The current password of the currently connected user. If changePassword() is being used by a DBA to change the password of another user, the value of oldPassword is ignored and can be an empty string.
    * @param newPassword The new password of the user whose password is to be changed.
    *
    * @since 2.2
    * @see https://oracle.github.io/node-oracledb/doc/api.html#changingpassword
    */
  def changePassword(user: String, oldPassword: String, newPassword: String): js.Promise[Unit] = js.native
  def changePassword(
    user: String,
    oldPassword: String,
    newPassword: String,
    callback: js.Function1[/* error */ DBError, Unit]
  ): Unit = js.native
  
  /**
    * The client identifier for end-to-end application tracing, use with mid-tier authentication, and with Virtual Private Databases.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The client information for end-to-end application tracing.
    * This is a write-only property. Displaying connection.clientInfo will show a value of null.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#endtoend
    * @since 4.1
    */
  var clientInfo: js.UndefOr[String] = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  /**
    * Releases a connection.
    *
    * Calling close() as soon as a connection is no longer required is strongly encouraged for system efficiency.
    * Calling close() for pooled connections is required to prevent the pool running out of connections.
    *
    * When a connection is released, any ongoing transaction on the connection is rolled back.
    *
    * If an error occurs on a pooled connection and that error is known to make the connection
    * unusable, then close() will drop that connection from the connection pool so a future
    * pooled getConnection() call that grows the pool will create a new, valid connection.
    *
    * @param options Only affects pooled connections.
    *
    * @since 1.9
    * @alias release()
    */
  def close(options: CloseConnectionOptions): js.Promise[Unit] = js.native
  def close(options: CloseConnectionOptions, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * This call commits the current transaction in progress on the connection.
    */
  def commit(): js.Promise[Unit] = js.native
  def commit(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Creates a Lob as an Oracle temporary LOB. The LOB is initially empty. Data can be streamed to the LOB,
    * which can then be passed into PL/SQL blocks, or inserted into the database.
    *
    * When no longer required, Lobs created with createLob() should be closed with lob.close() because
    * Oracle Database resources are held open if temporary LOBs are not closed.
    *
    * Open temporary LOB usage can be monitored using the view V$TEMPORARY_LOBS.
    *
    * LOBs created with createLob() can be bound for IN, IN OUT and OUT binds.
    *
    * @param type One of the constants CLOB or BLOB
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#lobhandling
    * @see https://oracle.github.io/node-oracledb/doc/api.html#lobbinds
    */
  def createLob(`type`: Double): js.Promise[Lob] = js.native
  def createLob(`type`: Double, callback: js.Function2[/* error */ DBError, /* lob */ Lob, Unit]): Unit = js.native
  
  /**
    * After setting currentSchema, SQL statements using unqualified references to schema objects will resolve to objects in the specified schema.
    * This setting does not change the session user or the current user, nor does it give the session user any additional system or object privileges for the session.
    * The value of currentSchema will be empty until it has been explicitly set.
    * This property is an efficient alternative to ALTER SESSION SET CURRENT_SCHEMA.
    *
    * @since 4.0
    */
  var currentSchema: js.UndefOr[String] = js.native
  
  /**
    * The database operation information for end-to-end application tracing.
    * This is a write-only property. Displaying connection.dbOp will show a value of null.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#endtoend
    * @since 4.1
    */
  var dbOp: js.UndefOr[String] = js.native
  
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute[T](sql: String): js.Promise[Result[T]] = js.native
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute[T](sql: String, bindParams: BindParameters): js.Promise[Result[T]] = js.native
  def execute[T](
    sql: String,
    bindParams: BindParameters,
    callback: js.Function2[/* error */ DBError, /* result */ Result[T], Unit]
  ): Unit = js.native
  /**
    * This call executes a single SQL or PL/SQL statement.
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    * @param options This is an optional parameter to execute() that may be used to control statement execution.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sqlexecution
    * @see https://oracle.github.io/node-oracledb/doc/api.html#querystream For an alternative
    */
  def execute[T](sql: String, bindParams: BindParameters, options: ExecuteOptions): js.Promise[Result[T]] = js.native
  def execute[T](
    sql: String,
    bindParams: BindParameters,
    options: ExecuteOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Result[T], Unit]
  ): Unit = js.native
  def execute[T](sql: String, callback: js.Function2[/* error */ DBError, /* result */ Result[T], Unit]): Unit = js.native
  
  def executeMany[T](sql: String, binds: js.Array[BindParameters]): js.Promise[Results[T]] = js.native
  def executeMany[T](
    sql: String,
    binds: js.Array[BindParameters],
    callback: js.Function2[/* error */ DBError, /* result */ Results[T], Unit]
  ): Unit = js.native
  /**
    * This method allows sets of data values to be bound to one DML or PL/SQL statement for execution.
    * It is like calling connection.execute() multiple times but requires fewer round-trips.
    * This is an efficient way to handle batch changes, for example when inserting or updating multiple rows.
    * The method cannot be used for queries.
    *
    * The executeMany() method supports IN, IN OUT and OUT binds for most data types
    * except PL/SQL Collection Associative Arrays.
    *
    * The version of this function which accepts a number of iterations should be used when no bind parameters
    * are required or when all bind parameters are OUT binds.
    *
    * @param sql The SQL or PL/SQL statement that executeMany() executes. The statement should contain bind variable names.
    * @param binds
    *
    * Contains values or variables to be bound to the executed statement.
    * It must be an array of arrays (for ‘bind by position’) or an array of objects whose keys
    * match the bind variable names in the SQL statement (for ‘bind by name’). Each sub-array or
    * sub-object should contain values for the bind variables used in the SQL statement.
    * At least one such record must be specified.
    *
    * If a record contains fewer values than expected, NULL values will be used. For bind by position,
    * empty values can be specified using syntax like [a,,c,d].
    *
    * By default, the direction of binds is BIND_IN. The first data record determines
    * the number of bind variables, each bind variable’s data type, and its name (when binding by name).
    * If a variable in the first record contains a null, this value is ignored and a subsequent record
    * is used to determine that variable’s characteristics. If all values in all records for a particular
    * bind variable are null, the type of that bind is STRING with a maximum size of 1.
    *
    * The maximum sizes of strings and buffers are determined by scanning all records in the bind data.
    *
    * If a bindDefs property is used, no data scanning occurs. This property explicitly specifies the
    * characteristics of each bind variable.
    *
    * @param options Optional parameter to control the execution.
    *
    * @since 2.2
    */
  def executeMany[T](sql: String, binds: js.Array[BindParameters], options: ExecuteManyOptions): js.Promise[Results[T]] = js.native
  def executeMany[T](
    sql: String,
    binds: js.Array[BindParameters],
    options: ExecuteManyOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Results[T], Unit]
  ): Unit = js.native
  def executeMany[T](sql: String, iterations: Double): js.Promise[Results[T]] = js.native
  def executeMany[T](
    sql: String,
    iterations: Double,
    callback: js.Function2[/* error */ DBError, /* result */ Results[T], Unit]
  ): Unit = js.native
  /**
    * This method allows sets of data values to be bound to one DML or PL/SQL statement for execution.
    * It is like calling connection.execute() multiple times but requires fewer round-trips.
    * This is an efficient way to handle batch changes, for example when inserting or updating multiple rows.
    * The method cannot be used for queries.
    *
    * The executeMany() method supports IN, IN OUT and OUT binds for most data types
    * except PL/SQL Collection Associative Arrays.
    *
    * The version of this function which accepts a number of iterations should be used when no bind parameters
    * are required or when all bind parameters are OUT binds.
    *
    * @param sql The SQL or PL/SQL statement that executeMany() executes. The statement should contain bind variable names.
    * @param iterations The number of times the SQL should be executed.
    * @param options Optional parameter to control the execution.
    */
  def executeMany[T](sql: String, iterations: Double, options: ExecuteManyOptions): js.Promise[Results[T]] = js.native
  def executeMany[T](
    sql: String,
    iterations: Double,
    options: ExecuteManyOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Results[T], Unit]
  ): Unit = js.native
  
  /**
    * Returns a DbObject prototype object representing the named Oracle Database object or collection.
    * When the definition of a type changes in the database, such as might occur in a development environment,
    * you should fully close connections to clear the object caches used by node-oracledb and the Oracle client libraries.
    *
    * For example, when using a pool you could use await connection.close({drop: true}), or restart the pool.
    * Then getDbObjectClass() can be called again to get the updated type information.
    *
    * @param className The name of the Oracle object or collection.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#objects
    * @since 4.0
    */
  def getDbObjectClass[T](className: String): js.Promise[DBObjectClass[T]] = js.native
  def getDbObjectClass[T](
    className: String,
    callback: js.Function2[/* error */ DBError, /* dbObject */ DBObjectClass[T], Unit]
  ): Unit = js.native
  
  def getQueue[T](name: String): js.Promise[AdvancedQueue[T]] = js.native
  def getQueue[T](name: String, callback: js.Function2[/* error */ DBError, /* queue */ AdvancedQueue[T], Unit]): Unit = js.native
  def getQueue[T](name: String, options: GetAdvancedQueueOptions): js.Promise[AdvancedQueue[T]] = js.native
  def getQueue[T](
    name: String,
    options: GetAdvancedQueueOptions,
    callback: js.Function2[/* error */ DBError, /* queue */ AdvancedQueue[T], Unit]
  ): Unit = js.native
  
  /**
    * Returns a parent SodaDatabase object for use with Simple Oracle Document Access (SODA).
    *
    * @since 3.0
    * @see https://oracle.github.io/node-oracledb/doc/api.html#sodaoverview
    */
  def getSodaDatabase(): SodaDatabase = js.native
  
  /**
    * Parses a SQL statement and returns information about it. This is most useful for finding column
    * names of queries, and for finding the names of bind variables used.
    *
    * This method performs a round-trip to the database, so unnecessary calls should be avoided.
    *
    * The information is provided by lower level APIs that have some limitations. Some uncommon
    * statements will return the statement type as oracledb.STMT_TYPE_UNKNOWN.
    * DDL statements are not parsed, so syntax errors in them will not be reported.
    * The direction and types of bind variables cannot be determined.
    *
    * @param sql SQL statement to parse.
    *
    * @since 2.2
    */
  def getStatementInfo(sql: String): js.Promise[StatementInfo[js.Object]] = js.native
  def getStatementInfo(
    sql: String,
    callback: js.Function2[/* error */ DBError, /* info */ StatementInfo[js.Object], Unit]
  ): Unit = js.native
  
  /**
    * The module attribute for end-to-end application tracing.
    * This is a write-only property. Displaying a Connection object will show a value of null for this attribute.
    */
  var module: js.UndefOr[String] = js.native
  
  /**
    * This readonly property gives a numeric representation of the Oracle database version which is useful in comparisons.
    * For version a.b.c.d.e, this property gives the number: (100000000 * a) + (1000000 * b) + (10000 * c) + (100 * d) + e.
    * Note if you connect to Oracle Database 18, the version will only be accurate if node-oracledb is also using Oracle Database 18 client libraries.
    * Otherwise it will show the base release such as 1800000000 instead of 1803000000.
    *
    * @since 1.3
    */
  val oracleServerVersion: Double = js.native
  
  /**
    * This readonly property gives a string representation of the Oracle database version which is useful for display.
    * Note if you connect to Oracle Database 18, the version will only be accurate if node-oracledb is also using Oracle Database 18 client libraries.
    * Otherwise it will show the base release such as “18.0.0.0.0” instead of “18.3.0.0.0”.
    *
    * @since 2.2
    */
  val oracleServerVersionString: String = js.native
  
  /**
    * This method checks that a connection is currently usable and the network to the database is valid.
    * This call can be useful for system health checks. A ping only confirms that a single connection
    * is usable at the time of the ping.
    *
    * Pinging does not replace error checking during statement execution, since network or database
    * failure may occur in the interval between ping() and execute() calls.
    *
    * Pinging requires a round-trip to the database so unnecessary ping calls should be avoided.
    *
    * If ping() returns an error, the application should close the connection.
    *
    * @since 2.2
    */
  def ping(): js.Promise[Unit] = js.native
  def ping(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  def queryStream[T](sql: String): QueryStream[T] = js.native
  def queryStream[T](sql: String, bindParams: BindParameters): QueryStream[T] = js.native
  /**
    * This function provides query streaming support. The parameters are the same as execute() except
    * a callback is not used. Instead this function returns a stream used to fetch data.
    *
    * Each row is returned as a data event. Query metadata is available via a metadata event.
    * The end event indicates the end of the query results.
    *
    * The connection must remain open until the stream is completely read.
    *
    * For tuning, adjust the value of oracledb.fetchArraySize or the option fetchArraySize (see execute()).
    *
    * @param sql The SQL statement that is executed. The statement may contain bind parameters.
    * @param bindParams This function parameter is needed if there are bind parameters in the SQL statement.
    * @param options This is an optional parameter to execute() that may be used to control statement execution.
    *
    * @since 1.8
    * @see https://oracle.github.io/node-oracledb/doc/api.html#streamingresults
    */
  def queryStream[T](sql: String, bindParams: BindParameters, options: ExecuteOptions): QueryStream[T] = js.native
  
  def release(): js.Promise[Unit] = js.native
  def release(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  /**
    * Releases a connection.
    *
    * Calling release() as soon as a connection is no longer required is strongly encouraged for system efficiency.
    * Calling release() for pooled connections is required to prevent the pool running out of connections.
    *
    * When a connection is released, any ongoing transaction on the connection is rolled back.
    *
    * If an error occurs on a pooled connection and that error is known to make the connection
    * unusable, then release() will drop that connection from the connection pool so a future
    * pooled getConnection() call that grows the pool will create a new, valid connection.
    *
    * @param options Only affects pooled connections.
    *
    * @since 1.9
    * @alias close()
    */
  def release(options: CloseConnectionOptions): js.Promise[Unit] = js.native
  def release(options: CloseConnectionOptions, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Rolls back the current transaction in progress on the connection.
    */
  def rollback(): js.Promise[Unit] = js.native
  def rollback(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Used to shut down a database instance. This is the flexible version of oracledb.shutdown(), allowing more control over behavior.
    *
    * This method must be called twice. The first call blocks new connections. SQL statements such as await ALTER DATABASE CLOSE NORMAL
    * and ALTER DATABASE DISMOUNT can then be used to close and unmount the database instance. Alternatively database administration can
    * be performed. Finally, a second call connection.shutdown(oracledb.SHUTDOWN_MODE_FINAL) is required to fully close the database instance.
    *
    * If the initial connection.shutdown() shutdownMode mode oracledb.SHUTDOWN_MODE_ABORT is used, then connection.shutdown() does not need to be called a second time.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#startupshutdown
    * @since 5.0
    */
  def shutdown(): js.Promise[Unit] = js.native
  def shutdown(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def shutdown(mode: Double): js.Promise[Unit] = js.native
  def shutdown(mode: Double, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Used to start up a database instance. This is the flexible version of oracledb.startup(), allowing more control over behavior.
    *
    * The connection must be a standalone connection, not a pooled connection.
    *
    * This function starts the database in an unmounted state. SQL statements such as ALTER DATABASE MOUNT and ALTER DATABASE OPEN
    * can then be executed to completely open the database instance. Database recovery commands could also be executed at this time.
    *
    * The connection used must have the privilege set to oracledb.SYSPRELIM, along with either oracledb.SYSDBA or oracledb.SYSOPER.
    * For example oracledb.SYSDBA | oracledb.SYSPRELIM.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#startupshutdown
    * @since 5.0
    */
  def startup(): js.Promise[Unit] = js.native
  def startup(cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def startup(opts: StartupOptions): js.Promise[Unit] = js.native
  def startup(opts: StartupOptions, cb: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * The number of statements to be cached in the statement cache of the connection.
    * The default value is the stmtCacheSize property in effect in the Pool object when the connection is created in the pool.
    */
  val stmtCacheSize: Double = js.native
  
  /**
    * Register a JavaScript callback method to be invoked when data is changed in the database by any committed transaction,
    * or when there are Advanced Queuing messages to be dequeued.
    *
    * For notifications to work, the connection must be created with events mode true, which is the default.
    * The database must be able to connect to the node-oracledb machine for notifications to be received.
    * Typically this means that the machine running node-oracledb needs a fixed IP address.
    *
    * If there is any problem sending a notification, then the callback method will not be invoked.
    * The connection.subscribe() method may be called multiple times with the same name, as long as the same connection is used.
    * In this case, the second and subsequent invocations ignore all options properties other than sql and binds.
    * Instead, the new SQL statement is registered to the same subscription, and the same JavaScript notification callback is used.
    * For performance reasons this can be preferable to creating a new subscription for each query.
    *
    * AQ notifications were added in node-oracledb 4.0.
    * The result callback parameter was added in node-oracledb 4.0.
    *
    * @param name For Continuous Query Notification this is an arbitrary name given to the subscription. For Advanced Queuing notifications this must be the queue name.
    * @param options Options that control the subscription.
    *
    * @since 2.3
    */
  def subscribe(name: String, options: SubscribeOptions): js.Promise[Subscription] = js.native
  def subscribe(
    name: String,
    options: SubscribeOptions,
    callback: js.Function2[/* error */ DBError, /* result */ Subscription, Unit]
  ): Unit = js.native
  
  /**
    * Applications can set the tag property on pooled connections to indicate the ‘session state’ that a connection has.
    * The tag will be retained when the connection is released to the pool.
    * A subsequent pool.getConnection() can request a connection that has a given tag.
    * It is up to the application to set any desired session state and set connection.tag prior to closing the connection.
    * The tag property is not used for standalone connections.
    * When node-oracledb is using Oracle Client libraries 12.2 or later, the tag must be a multi-property tag with name=value pairs like “k1=v1;k2=v2”.
    * An empty string represents not having a tag set.
    *
    * @since 3.1
    */
  var tag: js.UndefOr[String] = js.native
  
  /**
    * Unregister a Continuous Query Notification (CQN) subscription previously created with connection.subscribe().
    * No further notifications will be sent. The notification callback does not receive a notification of the
    * deregistration event.
    *
    * A subscription can be unregistered using a different connection to the initial subscription, as long as
    * the credentials are the same.
    *
    * If the subscription timeout was reached and the subscription was automatically unregistered, you will get
    * an error if you call connection.unsubscribe().
    *
    * @param name Name of the subscription used in connection.subscribe().
    */
  def unsubscribe(name: String): js.Promise[Unit] = js.native
  def unsubscribe(name: String, callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
}
