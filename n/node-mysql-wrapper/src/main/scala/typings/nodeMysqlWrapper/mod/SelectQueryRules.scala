package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "SelectQueryRules")
@js.native
class SelectQueryRules () extends StObject {
  
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
  
  /* private */ def last(propertyClauseName: js.Any): js.Any = js.native
  
  var lastPropertyClauseName: String = js.native
  
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
  
  //auto den benei oute sto last, oute sto from.
  /* static member */
  @JSImport("node-mysql-wrapper", "SelectQueryRules.build")
  @js.native
  def build(): SelectQueryRules = js.native
  
  /* static member */
  @JSImport("node-mysql-wrapper", "SelectQueryRules.fromRawObject")
  @js.native
  def fromRawObject(obj: RawRules): SelectQueryRules = js.native
  
  /* static member */
  @JSImport("node-mysql-wrapper", "SelectQueryRules.toRawObject")
  @js.native
  def toRawObject(rules: SelectQueryRules): RawRules = js.native
  
  /* static member */
  @JSImport("node-mysql-wrapper", "SelectQueryRules.toString")
  @js.native
  def toString_(rules: SelectQueryRules): String = js.native
}
