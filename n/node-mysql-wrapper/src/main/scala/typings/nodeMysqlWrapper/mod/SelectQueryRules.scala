package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "SelectQueryRules")
@js.native
open class SelectQueryRules () extends StObject {
  
  def append(appendToCurrent: String): SelectQueryRules = js.native
  
  def appendToBegin(manualAfterWhereString: String): SelectQueryRules = js.native
  
  def appendToEnd(manualAfterWhereString: String): SelectQueryRules = js.native
  
  def clear(): SelectQueryRules = js.native
  
  def clearBeginClause(): SelectQueryRules = js.native
  
  def clearEndClause(): SelectQueryRules = js.native
  
  def clearGroupBy(): SelectQueryRules = js.native
  
  def clearLimit(): SelectQueryRules = js.native
  
  def clearOrderBy(): SelectQueryRules = js.native
  
  def except(columns: String*): SelectQueryRules = js.native
  
  var exceptColumns: js.Array[String] = js.native
  
  /**
    * Same as .except(...columns)
    */
  def exclude(columns: String*): SelectQueryRules = js.native
  
  def from(parentRule: SelectQueryRules): SelectQueryRules = js.native
  
  def groupBy(columnKey: String): SelectQueryRules = js.native
  
  var groupByColumn: String = js.native
  
  def isEmpty(): Boolean = js.native
  
  /* private */ def last(propertyClauseName: Any): Any = js.native
  
  /* private */ var lastPropertyClauseName: String = js.native
  
  def limit(limitRowsOrStart: Double): SelectQueryRules = js.native
  def limit(limitRowsOrStart: Double, limitEnd: Double): SelectQueryRules = js.native
  
  var limitEnd: Double = js.native
  
  var limitStart: Double = js.native
  
  var manuallyBeginClause: String = js.native
  
  var manuallyEndClause: String = js.native
  
  def orderBy(columnKey: String): SelectQueryRules = js.native
  def orderBy(columnKey: String, descending: Boolean): SelectQueryRules = js.native
  
  var orderByColumn: String = js.native
  
  var orderByDescColumn: String = js.native
  
  var tableName: String = js.native
  
  def toRawObject(): RawRules = js.native
}
object SelectQueryRules {
  
  @JSImport("node-mysql-wrapper", "SelectQueryRules")
  @js.native
  val ^ : js.Any = js.native
  
  //auto den benei oute sto last, oute sto from.
  /* static member */
  inline def build(): SelectQueryRules = ^.asInstanceOf[js.Dynamic].applyDynamic("build")().asInstanceOf[SelectQueryRules]
  
  /* static member */
  inline def fromRawObject(obj: RawRules): SelectQueryRules = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRawObject")(obj.asInstanceOf[js.Any]).asInstanceOf[SelectQueryRules]
  
  /* static member */
  inline def toRawObject(rules: SelectQueryRules): RawRules = ^.asInstanceOf[js.Dynamic].applyDynamic("toRawObject")(rules.asInstanceOf[js.Any]).asInstanceOf[RawRules]
  
  /* static member */
  inline def toString_(rules: SelectQueryRules): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(rules.asInstanceOf[js.Any]).asInstanceOf[String]
}
