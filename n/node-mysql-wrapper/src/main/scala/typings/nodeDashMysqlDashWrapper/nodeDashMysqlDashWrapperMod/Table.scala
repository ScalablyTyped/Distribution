package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "Table")
@js.native
class Table[T] protected () extends js.Object {
  def this(tableName: String, connection: Connection) = this()
  var _columns: js.Array[String] = js.native
  var _connection: Connection = js.native
  var _criteriaDivider: CriteriaDivider[T] = js.native
  var _deleteQuery: DeleteQuery[T] = js.native
  /** Private keywords here are useless but I put them.
    * If the developer wants to see the properties of the Table class, he/she just comes here.
    */
  var _name: String = js.native
  var _primaryKey: String = js.native
  var _rules: SelectQueryRules = js.native
  var _saveQuery: SaveQuery[T] = js.native
  var _selectQuery: SelectQuery[T] = js.native
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
    * The real database name of the table. Autofilled by library.
    */
  var name: String = js.native
  /**
    * The name of the primary key column which this table is using.
    */
  var primaryKey: String = js.native
  /**
    * Set of the query rules that will be applied after the 'where clause' on each select query executed by this table.
    * @return {SelectQueryRules}
    */
  var rules: SelectQueryRules = js.native
  /**
    * Extends this table's capabilities with a function.
    * @param {string} functionName the function name you want to use, this is used when you want to call this function later.
    * @param {function} theFunction the function with any optional parameters you want to pass along.
    * @returnType {nothing}
    * @return {nothing}
    */
  def extend(functionName: String, theFunction: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  /**
    *
    */
  def find(criteriaRawJsObject: js.Any): ^[js.Array[T]] = js.native
   // only criteria
  def find(criteriaRawJsObject: js.Any, callback: js.Function1[/* _results */ js.Array[T], _]): ^[js.Array[T]] = js.native
  def findAll(): ^[js.Array[T]] = js.native
   // only criteria and promise
  def findAll(tableRules: RawRules): ^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules, callback: js.Function1[/* _results */ js.Array[T], _]): ^[js.Array[T]] = js.native
  def findById(id: String): ^[T] = js.native
  def findById(id: String, callback: js.Function1[/* result */ T, _]): ^[T] = js.native
  def findById(id: Double): ^[T] = js.native
  def findById(id: Double, callback: js.Function1[/* result */ T, _]): ^[T] = js.native
  def findSingle(criteriaRawJsObject: js.Any): ^[T] = js.native
  def findSingle(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ T, _]): ^[T] = js.native
  /**
    * Returns the primary key's value from an object.
    * @param {any} jsObject the object which you want to find and return the value of the primary key.
    * @returnType {number | string}
    * @return {number | string}
    */
  def getPrimaryKeyValue(jsObject: js.Any): Double | String = js.native
  /**
    * Returns and array of [columns[],values[]]
    * @param {any} jsObject the raw row object.
    * @returnType {array}
    * @return {array}
    */
  def getRowAsArray(jsObject: js.Any): js.Array[_] = js.native
  /**
    * Use it when you want to check if extended function is exists here.
    * @param {string} extendedFunctionName the name of the function you want to check.
    * @returnType {boolean}
    * @return {boolean}
    */
  def has(extendedFunctionName: String): Boolean = js.native
  /**
    * Converts and returns an object from this form: { a_property:'dsda', other_property:something, any_property_name:true } to { aProperty:..., otherProperty...,anyPropertyName...}
    * @param {any} row the raw row object.
    * @returnType {any}
    * @return {any}
    */
  def objectFromRow(row: js.Any): js.Any = js.native
  /**
    * Removes or turn off an event listener/watcher from a table for a specific event type.
    * @param {string} evtType the Event type you want to remove, one of these: "INSERT", "UPDATE", "REMOVE", "SAVE".
    * @param {function} callbackToRemove the callback that you were used for watch this event type.
    * @returnType {nothing}
    * @return {nothing}
    */
  def off(evtType: String, callbackToRemove: js.Function1[/* rawResults */ js.Array[_], Unit]): Unit = js.native
  /**
    * Adds or turn on an event listener/watcher on a table for a 'database event'.
    * @param {string} evtType the event type you want to watch, one of these: ["INSERT", "UPDATE", "REMOVE", "SAVE"].
    * @param {function} callback Callback which has one parameter(typeof any[]) which filled by the rawResults (results after query executed and before exports to object(s)).
    * @returnType {nothing}
    * @return {nothing}
    */
  def on(evtType: String, callback: js.Function1[/* rawResults */ js.Array[_], Unit]): Unit = js.native
  def remove(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, _]): ^[DeleteAnswer] = js.native
  def remove(criteriaOrID: js.Any, callback: js.Function1[/* _result */ DeleteAnswer, _]): ^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, _]): ^[DeleteAnswer] = js.native
   // ID without callback
   // criteria obj without callback
  def remove(criteriaRawObject: js.Any): ^[DeleteAnswer] = js.native
  def remove(id: String): ^[DeleteAnswer] = js.native
  def remove(id: Double): ^[DeleteAnswer] = js.native
  /**
    * Converts and returns an object from this form: { aProperty:'dsda', otherProperty:something, anyPropertyName:true } to { a_property:..., other_property...,any_property_name...}
    * @param {any} row the raw row object.
    * @returnType {any}
    * @return {any}
    */
  def rowFromObject(obj: js.Any): js.Any = js.native
  def save(criteriaRawJsObject: js.Any): ^[_] = js.native
  def save(criteriaRawJsObject: js.Any, callback: js.Function1[/* _result */ js.Any, _]): ^[_] = js.native
}

