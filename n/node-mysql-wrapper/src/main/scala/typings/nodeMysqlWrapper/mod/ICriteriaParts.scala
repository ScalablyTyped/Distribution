package typings.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICriteriaParts extends js.Object {
  
  var noDatabaseProperties: js.Array[String] = js.native
  
  var rawCriteriaObject: js.Any = js.native
  
  def selectFromClause[T](_table: Table[T]): String = js.native
  
  var tables: js.Array[TableToSearchPart] = js.native
  
  var whereClause: String = js.native
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
  implicit class ICriteriaPartsOps[Self <: ICriteriaParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNoDatabasePropertiesVarargs(value: String*): Self = this.set("noDatabaseProperties", js.Array(value :_*))
    
    @scala.inline
    def setNoDatabaseProperties(value: js.Array[String]): Self = this.set("noDatabaseProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawCriteriaObject(value: js.Any): Self = this.set("rawCriteriaObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFromClause(value: Table[js.Any] => String): Self = this.set("selectFromClause", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTablesVarargs(value: TableToSearchPart*): Self = this.set("tables", js.Array(value :_*))
    
    @scala.inline
    def setTables(value: js.Array[TableToSearchPart]): Self = this.set("tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereClause(value: String): Self = this.set("whereClause", value.asInstanceOf[js.Any])
  }
}
