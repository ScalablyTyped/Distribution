package typings.nodeMysqlWrapper.mod

import typings.mysql.mod.MysqlError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "Database")
@js.native
class Database () extends StObject {
  def this(connection: Connection) = this()
  
  def buildRules(): SelectQueryRules = js.native
  def buildRules(parentRules: SelectQueryRules): SelectQueryRules = js.native
  
  def collection[T](tableName: String): ObservableCollection[T] = js.native
  def collection[T](tableName: String, callbackWhenReady: js.Function): ObservableCollection[T] = js.native
  
  var connection: Connection = js.native
  
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * the difference from the 'end' is that this method doesn't care about errors so no callback passing here.
    */
  def destroy(): Unit = js.native
  
  /**
    * Close the entire real connection and remove all event's listeners (if exist).
    * @param {function} maybeAcallbackError If error occurs when closing the connection, this callback has the responsibility to catch it.
    * @returnType {nothing}
    * @return {nothing}
    */
  def end(maybeAcallbackError: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def has(tableName: String): Boolean = js.native
  def has(tableName: String, functionName: String): Boolean = js.native
  
  var isReady: Boolean = js.native
  
  /**Meteor js feature only: Returns a table which it's collection can make synchronization with the client */
  def meteorTable[T](tableName: String): MeteorTable[T] = js.native
  
  def newTableRules(tableName: String): SelectQueryRules = js.native
  
  def noticeReady(): Unit = js.native
  
  def query(queryStr: String, callback: js.Function2[/* err */ MysqlError, /* results */ js.Any, js.Any]): Unit = js.native
  def query(
    queryStr: String,
    callback: js.Function2[/* err */ MysqlError, /* results */ js.Any, js.Any],
    queryArguments: js.Array[js.Any]
  ): Unit = js.native
  
  def ready(): Unit = js.native
  def ready(callback: js.Function0[Unit]): Unit = js.native
  
  var readyListenerCallbacks: js.Array[js.Function] = js.native
  
  def removeReadyListener(callback: js.Function0[Unit]): Unit = js.native
  
  def setConnection(connection: Connection): Unit = js.native
  
  def table[T](tableName: String): Table[T] = js.native
  
  /**
    * Force to use/fetch information from only certain of database's tables, otherwise all database's tables information will be fetched.
    * @param {Array} tables the array of the tables  {string}
    * @returnType {nothing}
    * @return {nothing}
    */
  def useOnly(useTables: js.Any*): Unit = js.native
}
object Database {
  
  @JSImport("node-mysql-wrapper", "Database")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def when(_promises: typings.bluebird.mod.^[js.Any]*): typings.bluebird.mod.^[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(_promises.asInstanceOf[js.Any]).asInstanceOf[typings.bluebird.mod.^[js.Any]]
}
