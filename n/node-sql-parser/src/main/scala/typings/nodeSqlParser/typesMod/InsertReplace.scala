package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.insert
import typings.nodeSqlParser.nodeSqlParserStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertReplace extends AST {
  
  var columns: js.Array[String] | Null = js.native
  
  var db: String | Null = js.native
  
  var table: js.Any = js.native
  
  var `type`: replace | insert = js.native
  
  var values: js.Array[InsertReplaceValue] = js.native
}
object InsertReplace {
  
  @scala.inline
  def apply(table: js.Any, `type`: replace | insert, values: js.Array[InsertReplaceValue]): InsertReplace = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplace]
  }
  
  @scala.inline
  implicit class InsertReplaceOps[Self <: InsertReplace] (val x: Self) extends AnyVal {
    
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
    def setTable(value: js.Any): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: replace | insert): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: InsertReplaceValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[InsertReplaceValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: String*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsNull: Self = this.set("columns", null)
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNull: Self = this.set("db", null)
  }
}
