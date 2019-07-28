package typings.nodeDashMysqlDashWrapper.nodeDashMysqlDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-mysql-wrapper", "CriteriaBuilder")
@js.native
class CriteriaBuilder[T] protected () extends js.Object {
  def this(primaryTable: Table[T]) = this()
  def this(primaryTable: Table[T], tablePropertyName: String) = this()
   //to arxiko apo to Table.ts 9a benei
  def this(primaryTable: Table[T], tableName: String, parentBuilder: CriteriaBuilder[_]) = this()
  var parentBuilder: CriteriaBuilder[_] = js.native
  var primaryTable: Table[T] = js.native
  var rawCriteria: js.Any = js.native
  def at(tableNameProperty: String): CriteriaBuilder[T] = js.native
  /**
    * Auto kanei kuklous mexri na paei sto primary table kai ekei na epistrepsei to sunoliko raw criteria gia execute i kati allo.
    */
  def build(): js.Any = js.native
  /* private */ def createRulesIfNotExists(): Unit = js.native
  def except(columns: String*): CriteriaBuilder[T] = js.native
  /**
    * Same as .except(...columns)
    */
  def exclude(columns: String*): CriteriaBuilder[T] = js.native
  def join(realTableName: String, foreignColumnName: String): CriteriaBuilder[T] = js.native
  def joinAs(tableNameProperty: String, realTableName: String, foreignColumnName: String): CriteriaBuilder[T] = js.native
  def limit(start: Double): CriteriaBuilder[T] = js.native
  def limit(start: Double, end: Double): CriteriaBuilder[T] = js.native
  def orderBy(column: String): CriteriaBuilder[T] = js.native
  def orderBy(column: String, desceding: Boolean): CriteriaBuilder[T] = js.native
  def original(): CriteriaBuilder[T] = js.native
  def parent(): CriteriaBuilder[T] = js.native
  def where(key: String, value: js.Any): CriteriaBuilder[T] = js.native
}

/* static members */
@JSImport("node-mysql-wrapper", "CriteriaBuilder")
@js.native
object CriteriaBuilder extends js.Object {
  def from[T](table: Table[T]): CriteriaBuilder[T] = js.native
}

