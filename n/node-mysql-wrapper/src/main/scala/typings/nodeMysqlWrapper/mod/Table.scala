package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "Table")
@js.native
open class Table[T] protected () extends StObject {
  def this(tableName: String, connection: Connection) = this()
  
  /* private */ var _columns: js.Array[String] = js.native
  
  /* private */ var _connection: Connection = js.native
  
  /* private */ var _criteriaDivider: CriteriaDivider[T] = js.native
  
  /* private */ var _deleteQuery: DeleteQuery[T] = js.native
  
  /** Private keywords here are useless but I put them.
    * If the developer wants to see the properties of the Table class, they just come here.
    */
  /* private */ var _name: String = js.native
  
  /* private */ var _primaryKey: String = js.native
  
  /* private */ var _rules: SelectQueryRules = js.native
  
  /* private */ var _saveQuery: SaveQuery[T] = js.native
  
  /* private */ var _selectQuery: SelectQuery[T] = js.native
  
  /**
    * An array of all columns' names inside this table.
    */
  var columns: js.Array[String] = js.native
  
  /**
    * The MysqlConnection object which this MysqlTable belongs.
    */
  var connection: Connection = js.native
  
  /**
    * Returns new Criteria Builder each time.
    * Helps you  to make criteria raw js objects ready to use in find,remove and save methods.
    * @return {CriteriaBuilder}
    */
  var criteria: CriteriaBuilder[T] = js.native
  
  /**
    * Returns this table's criteria divider class.
    * @return {CriteriaDivider}
    */
  var criteriaDivider: CriteriaDivider[T] = js.native
  
  /**
    * Extends this table's capabilities with a function.
    * @param {string} functionName the function name you want to use, this is used when you want to call this function later.
    * @param {function} theFunction the function with any optional parameters you want to pass along.
    * @returnType {nothing}
    * @return {nothing}
    */
  def extend(functionName: String, theFunction: js.Function1[/* repeated */ Any, Any]): Unit = js.native
  
  /**
    *
    */
  def find(criteriaRawJsObject: Any): typings.bluebird.mod.^[js.Array[T]] = js.native
  // only criteria
  def find(criteriaRawJsObject: Any, callback: js.Function1[/* _results */ js.Array[T], Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def findAll(): typings.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: Unit, callback: js.Function1[/* _results */ js.Array[T], Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  // only criteria and promise
  def findAll(tableRules: RawRules): typings.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules, callback: js.Function1[/* _results */ js.Array[T], Any]): typings.bluebird.mod.^[js.Array[T]] = js.native
  
  def findById(id: String): typings.bluebird.mod.^[T] = js.native
  def findById(id: String, callback: js.Function1[/* result */ T, Any]): typings.bluebird.mod.^[T] = js.native
  def findById(id: Double): typings.bluebird.mod.^[T] = js.native
  def findById(id: Double, callback: js.Function1[/* result */ T, Any]): typings.bluebird.mod.^[T] = js.native
  
  def findSingle(criteriaRawJsObject: Any): typings.bluebird.mod.^[T] = js.native
  def findSingle(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ T, Any]): typings.bluebird.mod.^[T] = js.native
  
  /**
    * Returns the primary key's value from an object.
    * @param {any} jsObject the object which you want to find and return the value of the primary key.
    * @returnType {number | string}
    * @return {number | string}
    */
  def getPrimaryKeyValue(jsObject: Any): Double | String = js.native
  
  /**
    * Returns and array of [columns[],values[]]
    * @param {any} jsObject the raw row object.
    * @returnType {array}
    * @return {array}
    */
  def getRowAsArray(jsObject: Any): js.Array[Any] = js.native
  
  /**
    * Use it when you want to check if extended function is exists here.
    * @param {string} extendedFunctionName the name of the function you want to check.
    * @returnType {boolean}
    * @return {boolean}
    */
  def has(extendedFunctionName: String): Boolean = js.native
  
  /**
    * The real database name of the table. Autofilled by library.
    */
  var name: String = js.native
  
  /**
    * Converts and returns an object from this form: { a_property:'dsda', other_property:something, any_property_name:true } to { aProperty:..., otherProperty...,anyPropertyName...}
    * @param {any} row the raw row object.
    * @returnType {any}
    * @return {any}
    */
  def objectFromRow(row: Any): Any = js.native
  
  /**
    * Removes or turn off an event listener/watcher from a table for a specific event type.
    * @param {string} evtType the Event type you want to remove, one of these: "INSERT", "UPDATE", "REMOVE", "SAVE".
    * @param {function} callbackToRemove the callback that you were used for watch this event type.
    * @returnType {nothing}
    * @return {nothing}
    */
  def off(evtType: String, callbackToRemove: js.Function1[/* rawResults */ js.Array[Any], Unit]): Unit = js.native
  
  /**
    * Adds or turn on an event listener/watcher on a table for a 'database event'.
    * @param {string} evtType the event type you want to watch, one of these: ["INSERT", "UPDATE", "REMOVE", "SAVE"].
    * @param {function} callback Callback which has one parameter(typeof any[]) which filled by the rawResults (results after query executed and before exports to object(s)).
    * @returnType {nothing}
    * @return {nothing}
    */
  def on(evtType: String, callback: js.Function1[/* rawResults */ js.Array[Any], Unit]): Unit = js.native
  
  /**
    * The name of the primary key column which this table is using.
    */
  var primaryKey: String = js.native
  
  def remove(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Any, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typings.bluebird.mod.^[DeleteAnswer] = js.native
  // ID without callback
  // criteria obj without callback
  def remove(criteriaRawObject: Any): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(id: String): typings.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(id: Double): typings.bluebird.mod.^[DeleteAnswer] = js.native
  
  /**
    * Converts and returns an object from this form: { aProperty:'dsda', otherProperty:something, anyPropertyName:true } to { a_property:..., other_property...,any_property_name...}
    * @param {any} row the raw row object.
    * @returnType {any}
    * @return {any}
    */
  def rowFromObject(obj: Any): Any = js.native
  
  /**
    * Set of the query rules that will be applied after the 'where clause' on each select query executed by this table.
    * @return {SelectQueryRules}
    */
  var rules: SelectQueryRules = js.native
  
  def save(criteriaRawJsObject: Any): typings.bluebird.mod.^[Any] = js.native
  def save(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ Any, Any]): typings.bluebird.mod.^[Any] = js.native
}
