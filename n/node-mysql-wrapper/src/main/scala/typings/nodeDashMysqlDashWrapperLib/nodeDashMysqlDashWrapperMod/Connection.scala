package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "Connection")
@js.native
class Connection protected ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(connection: java.lang.String) = this()
  def this(connection: mysqlLib.mysqlMod.Connection) = this()
  def this(connection: mysqlLib.mysqlMod.ConnectionConfig) = this()
  /**
       * The real database connection socket.
       */
  var connection: mysqlLib.mysqlMod.Connection = js.native
  /**
       * Collection of the supported event types for the tables.
       */
  var eventTypes: js.Array[java.lang.String] = js.native
  /**
       * Force to fetch ONLY these Database table names {array of string}.
       */
  var tableNamesToUseOnly: js.Array[_] = js.native
  /**
       * All tables {MysqlTable} inside this connection's database.
       */
  var tables: js.Array[Table[_]] = js.native
  /**
       * Attach a real connection.
       * @param {Mysql.Connection} connection the real connection object.
       * @returnType {nothing}
       * @return {nothing}
       */
  def attach(connection: mysqlLib.mysqlMod.Connection): scala.Unit = js.native
  /**
       * Clear all binary logs from the whole database.
       * When finish returns a promise, use it with .then(function(){});
       * @return Promise
       */
  def clearBinaryLogs(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
       * Creates the MysqlConnection from the connection url or the real connection object.
       * @param {string | Mysql.Connection |  Mysql.ConnectionConfig} connection the connection url or the real connection object.
       * @returnType {nothing}
       * @return {nothing}
       */
  def create(connection: java.lang.String): scala.Unit = js.native
  /**
       * Creates the MysqlConnection from the connection url or the real connection object.
       * @param {string | Mysql.Connection |  Mysql.ConnectionConfig} connection the connection url or the real connection object.
       * @returnType {nothing}
       * @return {nothing}
       */
  def create(connection: mysqlLib.mysqlMod.Connection): scala.Unit = js.native
  /**
       * Creates the MysqlConnection from the connection url or the real connection object.
       * @param {string | Mysql.Connection |  Mysql.ConnectionConfig} connection the connection url or the real connection object.
       * @returnType {nothing}
       * @return {nothing}
       */
  def create(connection: mysqlLib.mysqlMod.ConnectionConfig): scala.Unit = js.native
  /**
       * Close the entire real connection and remove all event's listeners (if exist).
       * the difference from the 'end' is that this method doesn't care about errors so no callback passing here.
       */
  def destroy(): scala.Unit = js.native
  /**
       * Close the entire real connection and remove all event's listeners (if exist).
       * @param {function} callback If error occurs when closing the connection, this callback has the responsibility to catch it.
       * @returnType {nothing}
       * @return {nothing}
       */
  def end(): scala.Unit = js.native
  /**
       * Close the entire real connection and remove all event's listeners (if exist).
       * @param {function} callback If error occurs when closing the connection, this callback has the responsibility to catch it.
       * @returnType {nothing}
       * @return {nothing}
       */
  def end(callback: js.Function1[/* error */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
       * Escape the query column's value  and return it.
       * @param {string} val the value which will be escaped.
       * @returnType {string}
       * @return {string}
       */
  def escape(`val`: java.lang.String): java.lang.String = js.native
  /**
       * This method has the resposibility of fetching the correct tables from the database ( table = columns' names, primary key name).
       * @returnType {Promise}
       * @return {Promise}
       */
  def fetchDatabaseInformation(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
       * Link the real connection with this MysqlConnection object.
       * @param {function} readyCallback when the link operation is done this callback is executed.
       * @returnType {Promise}
       * @return {Promise}
       */
  def link(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
       * Link the real connection with this MysqlConnection object.
       * @param {function} readyCallback when the link operation is done this callback is executed.
       * @returnType {Promise}
       * @return {Promise}
       */
  def link(readyCallback: js.Function0[scala.Unit]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
       * Call when must notify the Database events, SAVE(INSERT,UPDATE), REMOVE(DELETE).
       * @param {string} tableWhichCalled the table name which event is coming from.
       * @param {string} queryStr the full parsed query string which used to determinate the type of event to notify.
       * @param {any[]} rawRows the raw rows results (results before a method parse/edit/export them as objects), these are passing to the watch listener(s).
       * @returnType {nothing}
       * @return {nothing}
       */
  def notice(tableWhichCalled: java.lang.String, queryStr: java.lang.String, rawRows: js.Array[_]): scala.Unit = js.native
  /**
       * Executes a database query.
       * @param {string} queryStr the query text/string to be executed.
       * @param {function} callback the function will be called and fill the one and only parameter when an errors occurs.
       * @param {any[]} queryArguments (optional) the query arguments you want to pass into query. ['arg1','arg2']...
       * @returnType {nothing}
       * @return {nothing}
       */
  def query(
    queryStr: java.lang.String,
    callback: js.Function2[/* err */ mysqlLib.mysqlMod.MysqlError, /* results */ js.Any, _]
  ): scala.Unit = js.native
  /**
       * Executes a database query.
       * @param {string} queryStr the query text/string to be executed.
       * @param {function} callback the function will be called and fill the one and only parameter when an errors occurs.
       * @param {any[]} queryArguments (optional) the query arguments you want to pass into query. ['arg1','arg2']...
       * @returnType {nothing}
       * @return {nothing}
       */
  def query(
    queryStr: java.lang.String,
    callback: js.Function2[/* err */ mysqlLib.mysqlMod.MysqlError, /* results */ js.Any, _],
    queryArguments: js.Array[_]
  ): scala.Unit = js.native
  /**
       * Returns a MysqlTable object from the database factory. (Note: this method doesn't create anything, just finds and returns the correct table, you don't have to create anything at all. Tables are fetched by the library itself.)
       * If you are using typescript you can pass a class (generic<T>) in order to use the auto completion assistance on table's results methods(find,findById,findAll,save,remove,safeRemove).
       * @param {string} tableName the table name which you want to get, on the form of: 'anyDatabaseTable' OR 'any_database_table' (possible your real table name into your database).
       * @returnType {MysqlTable}
       * @return {MysqlTable}
       */
  def table[T](tableName: java.lang.String): Table[T] = js.native
  /**
       * Removes an event listener/watcher from a table for a specific event type.
       * @param {string} tableName the table name which you want to remove the event listener.
       * @param {string} evtType the Event type you want to remove, one of these: "INSERT", "UPDATE", "REMOVE", "SAVE".
       * @param {function} callbackToRemove the callback that you were used for watch this event type.
       * @returnType {nothing}
       * @return {nothing}
       */
  def unwatch(
    tableName: java.lang.String,
    evtType: java.lang.String,
    callbackToRemove: js.Function1[/* rawResults */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Force to use/fetch information from only certain of database's tables, otherwise all database's tables information will be fetched.
       * @param {Array} tables the array of the tables  {string}
       * @returnType {nothing}
       * @return {nothing}
       */
  def useOnly(tables: js.Any*): scala.Unit = js.native
  /**
       * Adds an event listener/watcher on a table for a 'database event'.
       * @param {string} tableName the table name which you want to add the event listener.
       * @param {string or string[]} evtType the event(s) type you want to watch, one of these(string) or an array of them(string[]): ["INSERT", "UPDATE", "REMOVE", "SAVE"].
       * @param {function} callback Callback which has one parameter(typeof any[]) which filled by the rawRows (results after query executed and before parsed to object(s)).
       * @returnType {nothing}
       * @return {nothing}
       */
  def watch(
    tableName: java.lang.String,
    evtType: js.Any,
    callback: js.Function1[/* rawRows */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
}

