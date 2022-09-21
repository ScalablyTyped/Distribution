package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "CriteriaBuilder")
@js.native
open class CriteriaBuilder[T] protected () extends StObject {
  def this(primaryTable: Table[T]) = this()
  def this(primaryTable: Table[T], tablePropertyName: String) = this()
  //to arxiko apo to Table.ts 9a benei
  def this(primaryTable: Table[T], tableName: String, parentBuilder: CriteriaBuilder[Any]) = this()
  def this(primaryTable: Table[T], tablePropertyName: Unit, parentBuilder: CriteriaBuilder[Any]) = this()
  
  def at(tableNameProperty: String): CriteriaBuilder[T] = js.native
  
  /**
    * Auto kanei kuklous mexri na paei sto primary table kai ekei na epistrepsei to sunoliko raw criteria gia execute i kati allo.
    */
  def build(): Any = js.native
  
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
  
  /* private */ var parentBuilder: CriteriaBuilder[Any] = js.native
  
  /* private */ var primaryTable: Table[T] = js.native
  
  /* private */ var rawCriteria: Any = js.native
  
  def where(key: String, value: Any): CriteriaBuilder[T] = js.native
}
object CriteriaBuilder {
  
  @JSImport("node-mysql-wrapper", "CriteriaBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from[T](table: Table[T]): CriteriaBuilder[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(table.asInstanceOf[js.Any]).asInstanceOf[CriteriaBuilder[T]]
}
