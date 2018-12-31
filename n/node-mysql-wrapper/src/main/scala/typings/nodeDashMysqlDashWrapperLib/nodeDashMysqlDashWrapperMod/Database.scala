package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "Database")
@js.native
class Database () extends js.Object {
  def this(connection: Connection) = this()
  var connection: Connection = js.native
  var isReady: scala.Boolean = js.native
  var readyListenerCallbacks: js.Array[js.Function] = js.native
  def buildRules(): SelectQueryRules = js.native
  def buildRules(parentRules: SelectQueryRules): SelectQueryRules = js.native
  def collection[T](tableName: java.lang.String): ObservableCollection[T] = js.native
  def collection[T](tableName: java.lang.String, callbackWhenReady: js.Function): ObservableCollection[T] = js.native
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * the difference from the 'end' is that this method doesn't care about errors so no callback passing here.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * @param {function} maybeAcallbackError If error occurs when closing the connection, this callback has the responsibility to catch it.
    * @returnType {nothing}
    * @return {nothing}
    */
  def end(maybeAcallbackError: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def has(tableName: java.lang.String): scala.Boolean = js.native
  def has(tableName: java.lang.String, functionName: java.lang.String): scala.Boolean = js.native
  /**Meteor js feature only: Returns a table which it's collection can make synchronization with the client */
  def meteorTable[T](tableName: java.lang.String): MeteorTable[T] = js.native
  def newTableRules(tableName: java.lang.String): SelectQueryRules = js.native
  def noticeReady(): scala.Unit = js.native
  def query(
    queryStr: java.lang.String,
    callback: js.Function2[/* err */ mysqlLib.mysqlMod.MysqlError, /* results */ js.Any, _]
  ): scala.Unit = js.native
  def query(
    queryStr: java.lang.String,
    callback: js.Function2[/* err */ mysqlLib.mysqlMod.MysqlError, /* results */ js.Any, _],
    queryArguments: js.Array[_]
  ): scala.Unit = js.native
  def ready(): scala.Unit = js.native
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeReadyListener(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def setConnection(connection: Connection): scala.Unit = js.native
  def table[T](tableName: java.lang.String): Table[T] = js.native
  /**
    * Force to use/fetch information from only certain of database's tables, otherwise all database's tables information will be fetched.
    * @param {Array} tables the array of the tables  {string}
    * @returnType {nothing}
    * @return {nothing}
    */
  def useOnly(useTables: js.Any*): scala.Unit = js.native
}

@JSImport("node-mysql-wrapper", "Database")
@js.native
object Database extends js.Object {
  def when(_promises: bluebirdLib.bluebirdMod.namespaced[_]*): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

