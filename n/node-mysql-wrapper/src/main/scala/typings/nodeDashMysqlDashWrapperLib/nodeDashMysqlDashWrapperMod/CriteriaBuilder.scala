package typings
package nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CriteriaBuilder")
@js.native
class CriteriaBuilder[T] protected () extends js.Object {
  def this(primaryTable: Table[T]) = this()
  def this(primaryTable: Table[T], tablePropertyName: java.lang.String) = this()
   //to arxiko apo to Table.ts 9a benei
  def this(primaryTable: Table[T], tableName: java.lang.String, parentBuilder: CriteriaBuilder[_]) = this()
  var parentBuilder: CriteriaBuilder[_] = js.native
  var primaryTable: Table[T] = js.native
  var rawCriteria: js.Any = js.native
  def at(tableNameProperty: java.lang.String): CriteriaBuilder[T] = js.native
  /**
    * Auto kanei kuklous mexri na paei sto primary table kai ekei na epistrepsei to sunoliko raw criteria gia execute i kati allo.
    */
  def build(): js.Any = js.native
  /* private */ def createRulesIfNotExists(): scala.Unit = js.native
  def except(columns: java.lang.String*): CriteriaBuilder[T] = js.native
  /**
    * Same as .except(...columns)
    */
  def exclude(columns: java.lang.String*): CriteriaBuilder[T] = js.native
  def join(realTableName: java.lang.String, foreignColumnName: java.lang.String): CriteriaBuilder[T] = js.native
  def joinAs(
    tableNameProperty: java.lang.String,
    realTableName: java.lang.String,
    foreignColumnName: java.lang.String
  ): CriteriaBuilder[T] = js.native
  def limit(start: scala.Double): CriteriaBuilder[T] = js.native
  def limit(start: scala.Double, end: scala.Double): CriteriaBuilder[T] = js.native
  def orderBy(column: java.lang.String): CriteriaBuilder[T] = js.native
  def orderBy(column: java.lang.String, desceding: scala.Boolean): CriteriaBuilder[T] = js.native
  def original(): CriteriaBuilder[T] = js.native
  def parent(): CriteriaBuilder[T] = js.native
  def where(key: java.lang.String, value: js.Any): CriteriaBuilder[T] = js.native
}

@JSImport("node-mysql-wrapper", "CriteriaBuilder")
@js.native
object CriteriaBuilder extends js.Object {
  def from[T](table: nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.Table[T]): nodeDashMysqlDashWrapperLib.nodeDashMysqlDashWrapperMod.CriteriaBuilder[T] = js.native
}

