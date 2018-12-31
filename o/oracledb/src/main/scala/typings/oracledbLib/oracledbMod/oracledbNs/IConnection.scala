package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Emits "_after_close" event */
@js.native
trait IConnection
  extends nodeLib.eventsMod.EventEmitter {
  /**
  		 * The action attribute for end-to-end application tracing.
  		 * This is a write-only property. Displaying a Connection object will show a value of null for this attribute. See End-to-end Tracing, Mid-tier Authentication, and Auditing.
  		 */
  var action: java.lang.String = js.native
  /**
  		 * The client identifier for end-to-end application tracing, use with mid-tier authentication, and with Virtual Private Databases.
  		 * This is a write-only property. Displaying a Connection object will show a value of null for this attribute. See End-to-end Tracing, Mid-tier Authentication, and Auditing.
  		 */
  var clientId: java.lang.String = js.native
  /**
  		 * The module attribute for end-to-end application tracing.
  		 * This is a write-only property. Displaying a Connection object will show a value of null for this attribute. See End-to-end Tracing, Mid-tier Authentication, and Auditing.
  		 */
  var module: java.lang.String = js.native
  /**
  		 * This readonly property gives a numeric representation of the Oracle database version. For version a.b.c.d.e, this property gives the number: (100000000 * a) + (1000000 * b) + (10000 * c) + (100 * d) + e
  		 */
  var oracleServerVersion: scala.Double = js.native
  /**
  		 * The number of statements to be cached in the statement cache of the connection. The default value is the stmtCacheSize property in effect in the Pool object when the connection is created in the pool.
  		 */
  var stmtCacheSize: scala.Double = js.native
  /**
  		 * This call stops the currently running operation on the connection.
  		 * If there is no operation in progress or the operation has completed by the time the break is issued, the break() is effectively a no-op.
  		 * If the running asynchronous operation is interrupted, its callback will return an error.
  		 * @returns	A void promise when break is done.
  		 */
  def break(): IPromise[scala.Unit] = js.native
  /**
  		 * This call stops the currently running operation on the connection.
  		 * If there is no operation in progress or the operation has completed by the time the break is issued, the break() is effectively a no-op.
  		 * If the running asynchronous operation is interrupted, its callback will return an error.
  		 * @param	{(err: any) => void} callback Callback on break done.
  		 */
  def break(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Releases a connection. If the connection was obtained from the pool, the connection is returned to the pool and is available for reuse.
  		 * Note: calling close() when connections are no longer required is strongly encouraged. Releasing helps avoid resource leakage and can improve system efficiency.
  		 * When a connection is released, any ongoing transaction on the connection is rolled back.
  		 * After releasing a connection to a pool, there is no guarantee a subsequent getConnection() call gets back the same database connection. The application must redo any ALTER SESSION statements on the new connection object, as required.
  		 * @returns	A void Promise on close done.
  		 */
  def close(): IPromise[scala.Unit] = js.native
  /**
  		 * Releases a connection. If the connection was obtained from the pool, the connection is returned to the pool and is available for reuse.
  		 * Note: calling close() when connections are no longer required is strongly encouraged. Releasing helps avoid resource leakage and can improve system efficiency.
  		 * When a connection is released, any ongoing transaction on the connection is rolled back.
  		 * After releasing a connection to a pool, there is no guarantee a subsequent getConnection() call gets back the same database connection. The application must redo any ALTER SESSION statements on the new connection object, as required.
  		 * @param	{(err: any) => void} callback Callback on close done.
  		 */
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Send a commit requisition to the database.
  		 * @returns	A void Promise on commit done.
  		 */
  def commit(): IPromise[scala.Unit] = js.native
  /**
  		 * Send a commit requisition to the database.
  		 * @param	{(err: any) => void} callback Callback on commit done.
  		 */
  def commit(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * This call executes a SQL or PL/SQL statement. See SQL Execution for examples.
  		 * The statement to be executed may contain IN binds, OUT or IN OUT bind values or variables, which are bound using either an object or an array.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{Object|Array<any>} bindParams Binds Object/Array
  		 * @param	{IExecuteOptions} options Options object
  		 * @returns	A Promise of a result object, containing any fetched rows, the values of any OUT and IN OUT bind variables, and the number of rows affected by the execution of DML statements.
  		 */
  def execute(sql: java.lang.String): IPromise[IExecuteReturn] = js.native
  def execute(sql: java.lang.String, bindParams: js.Array[_]): IPromise[IExecuteReturn] = js.native
  def execute(
    sql: java.lang.String,
    bindParams: js.Array[_],
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  def execute(sql: java.lang.String, bindParams: js.Array[_], options: IExecuteOptions): IPromise[IExecuteReturn] = js.native
  def execute(
    sql: java.lang.String,
    bindParams: js.Array[_],
    options: IExecuteOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  def execute(sql: java.lang.String, bindParams: js.Object): IPromise[IExecuteReturn] = js.native
  /**
  		 * This call executes a SQL or PL/SQL statement. See SQL Execution for examples.
  		 * The statement to be executed may contain IN binds, OUT or IN OUT bind values or variables, which are bound using either an object or an array.
  		 * A callback function returns a result object, containing any fetched rows, the values of any OUT and IN OUT bind variables, and the number of rows affected by the execution of DML statements.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{Object|Array<any>} bindParams Binds Object/Array
  		 * @param	{(err: any, value: IExecuteReturn) => void} callback Callback function to receive the result.
  		 */
  def execute(
    sql: java.lang.String,
    bindParams: js.Object,
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  def execute(sql: java.lang.String, bindParams: js.Object, options: IExecuteOptions): IPromise[IExecuteReturn] = js.native
  /**
  		 * This call executes a SQL or PL/SQL statement. See SQL Execution for examples.
  		 * The statement to be executed may contain IN binds, OUT or IN OUT bind values or variables, which are bound using either an object or an array.
  		 * A callback function returns a result object, containing any fetched rows, the values of any OUT and IN OUT bind variables, and the number of rows affected by the execution of DML statements.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{Object|Array<any>} bindParams Binds Object/Array
  		 * @param	{IExecuteOptions} options Options object
  		 * @param	{(err: any, value: IExecuteReturn) => void} callback Callback function to receive the result.
  		 */
  def execute(
    sql: java.lang.String,
    bindParams: js.Object,
    options: IExecuteOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * This call executes a SQL or PL/SQL statement. See SQL Execution for examples.
  		 * The statement to be executed may contain IN binds, OUT or IN OUT bind values or variables, which are bound using either an object or an array.
  		 * A callback function returns a result object, containing any fetched rows, the values of any OUT and IN OUT bind variables, and the number of rows affected by the execution of DML statements.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{(err: any, value: IExecuteReturn) => void} callback Callback function to receive the result.
  		 */
  def execute(
    sql: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * This call executes a SQL or PL/SQL statement. See SQL Execution for examples.
  		 * The statement to be executed may contain IN binds, OUT or IN OUT bind values or variables, which are bound using either an object or an array.
  		 * A callback function returns a result object, containing any fetched rows, the values of any OUT and IN OUT bind variables, and the number of rows affected by the execution of DML statements.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{IExecuteOptions} options Options object
  		 * @param	{(err: any, value: IExecuteReturn) => void} callback Callback function to receive the result.
  		 */
  def execute(
    sql: java.lang.String,
    options: IExecuteOptions,
    callback: js.Function2[/* err */ js.Any, /* value */ IExecuteReturn, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * This function provides query streaming support. The parameters are the same as execute() except a callback is not used. Instead this function returns a stream used to fetch data.
  		 * Each row is returned as a data event. Query metadata is available via a metadata event. The end event indicates the end of the query results.
  		 * Query results must be fetched to completion to avoid resource leaks.
  		 * The connection must remain open until the stream is completely read.
  		 * For tuning purposes the oracledb.maxRows property can be used to size an internal buffer used by queryStream(). Note it does not limit the number of rows returned by the stream. The oracledb.prefetchRows value will also affect performance.
  		 * @param	{string} sql SQL Statement.
  		 * @param	{Object|Array<any>} bindParams Binds Object/Array
  		 * @param	{IExecuteOptions} options Options object
  		 * @returns Readable Stream for queries.
  		 */
  def queryStream(sql: java.lang.String): nodeLib.streamMod.Readable = js.native
  def queryStream(sql: java.lang.String, bindParams: js.Array[_]): nodeLib.streamMod.Readable = js.native
  def queryStream(sql: java.lang.String, bindParams: js.Array[_], options: IExecuteOptions): nodeLib.streamMod.Readable = js.native
  def queryStream(sql: java.lang.String, bindParams: js.Object): nodeLib.streamMod.Readable = js.native
  def queryStream(sql: java.lang.String, bindParams: js.Object, options: IExecuteOptions): nodeLib.streamMod.Readable = js.native
  /**
  		 * An alias for Connection.close().
  		 * @returns	A void Promise on close done.
  		 */
  def release(): IPromise[scala.Unit] = js.native
  /**
  		 * An alias for Connection.close().
  		 * @param	{(err: any) => void} callback Callback on close done.
  		 */
  def release(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Send a rollback requisition to database.
  		 * @returns	A void Promise on rollback done.
  		 */
  def rollback(): IPromise[scala.Unit] = js.native
  /**
  		 * Send a rollback requisition to database.
  		 * @param	{(err: any) => void} callback Callback on rollback done.
  		 */
  def rollback(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

