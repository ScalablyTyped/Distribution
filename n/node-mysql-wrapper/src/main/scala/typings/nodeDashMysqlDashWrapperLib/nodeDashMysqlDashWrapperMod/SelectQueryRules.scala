package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "SelectQueryRules")
@js.native
class SelectQueryRules () extends js.Object {
  var exceptColumns: js.Array[java.lang.String] = js.native
  var groupByColumn: java.lang.String = js.native
  var lastPropertyClauseName: java.lang.String = js.native
  var limitEnd: scala.Double = js.native
  var limitStart: scala.Double = js.native
  var manuallyBeginClause: java.lang.String = js.native
  var manuallyEndClause: java.lang.String = js.native
  var orderByColumn: java.lang.String = js.native
  var orderByDescColumn: java.lang.String = js.native
  var tableName: java.lang.String = js.native
  def append(appendToCurrent: java.lang.String): SelectQueryRules = js.native
  def appendToBegin(manualAfterWhereString: java.lang.String): SelectQueryRules = js.native
  def appendToEnd(manualAfterWhereString: java.lang.String): SelectQueryRules = js.native
  def clear(): SelectQueryRules = js.native
  def clearBeginClause(): SelectQueryRules = js.native
  def clearEndClause(): SelectQueryRules = js.native
  def clearGroupBy(): SelectQueryRules = js.native
  def clearLimit(): SelectQueryRules = js.native
  def clearOrderBy(): SelectQueryRules = js.native
  def except(columns: java.lang.String*): SelectQueryRules = js.native
  /**
       * Same as .except(...columns)
       */
  def exclude(columns: java.lang.String*): SelectQueryRules = js.native
  def from(parentRule: SelectQueryRules): SelectQueryRules = js.native
  def groupBy(columnKey: java.lang.String): SelectQueryRules = js.native
  def isEmpty(): scala.Boolean = js.native
  /* private */ def last(propertyClauseName: js.Any): js.Any = js.native
  def limit(limitRowsOrStart: scala.Double): SelectQueryRules = js.native
  def limit(limitRowsOrStart: scala.Double, limitEnd: scala.Double): SelectQueryRules = js.native
  def orderBy(columnKey: java.lang.String): SelectQueryRules = js.native
  def orderBy(columnKey: java.lang.String, descending: scala.Boolean): SelectQueryRules = js.native
  def toRawObject(): nodeDashMysqlDashWrapperLib.RawRules = js.native
}

@JSImport("node-mysql-wrapper", "SelectQueryRules")
@js.native
object SelectQueryRules extends js.Object {
   //auto den benei oute sto last, oute sto from.
  def build(): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.SelectQueryRules = js.native
  def fromRawObject(obj: nodeDashMysqlDashWrapperLib.RawRules): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.SelectQueryRules = js.native
  def toRawObject(rules: nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.SelectQueryRules): nodeDashMysqlDashWrapperLib.RawRules = js.native
  def toString(rules: nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.SelectQueryRules): java.lang.String = js.native
}

