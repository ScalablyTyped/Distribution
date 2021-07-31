package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICriteriaParts extends StObject {
  
  var noDatabaseProperties: js.Array[String]
  
  var rawCriteriaObject: js.Any
  
  def selectFromClause[T](_table: Table[T]): String
  
  var tables: js.Array[TableToSearchPart]
  
  var whereClause: String
}
object ICriteriaParts {
  
  @scala.inline
  def apply(
    noDatabaseProperties: js.Array[String],
    rawCriteriaObject: js.Any,
    selectFromClause: Table[js.Any] => String,
    tables: js.Array[TableToSearchPart],
    whereClause: String
  ): ICriteriaParts = {
    val __obj = js.Dynamic.literal(noDatabaseProperties = noDatabaseProperties.asInstanceOf[js.Any], rawCriteriaObject = rawCriteriaObject.asInstanceOf[js.Any], selectFromClause = js.Any.fromFunction1(selectFromClause), tables = tables.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICriteriaParts]
  }
  
  @scala.inline
  implicit class ICriteriaPartsMutableBuilder[Self <: ICriteriaParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoDatabaseProperties(value: js.Array[String]): Self = StObject.set(x, "noDatabaseProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDatabasePropertiesVarargs(value: String*): Self = StObject.set(x, "noDatabaseProperties", js.Array(value :_*))
    
    @scala.inline
    def setRawCriteriaObject(value: js.Any): Self = StObject.set(x, "rawCriteriaObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFromClause(value: Table[js.Any] => String): Self = StObject.set(x, "selectFromClause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTables(value: js.Array[TableToSearchPart]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesVarargs(value: TableToSearchPart*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setWhereClause(value: String): Self = StObject.set(x, "whereClause", value.asInstanceOf[js.Any])
  }
}
