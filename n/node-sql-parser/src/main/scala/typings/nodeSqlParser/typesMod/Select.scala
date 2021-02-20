package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.DISTINCT
import typings.nodeSqlParser.nodeSqlParserStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select extends AST {
  
  var columns: (js.Array[_ | Column]) | Asterisk = js.native
  
  var distinct: DISTINCT | Null = js.native
  
  var from: (js.Array[From | Dual]) | Null = js.native
  
  var groupby: js.Array[ColumnRef] | Null = js.native
  
  var having: js.Array[_] | Null = js.native
  
  var limit: Limit | Null = js.native
  
  var options: js.Array[_] | Null = js.native
  
  var orderby: js.Array[OrderBy] | Null = js.native
  
  var `type`: select = js.native
  
  var where: js.Any = js.native
  
  var `with`: With | Null = js.native
}
object Select {
  
  @scala.inline
  def apply(columns: (js.Array[_ | Column]) | Asterisk, `type`: select, where: js.Any): Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
  
  @scala.inline
  implicit class SelectMutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: (js.Array[_ | Column]) | Asterisk): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: (js.Any | Column)*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDistinct(value: DISTINCT): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctNull: Self = StObject.set(x, "distinct", null)
    
    @scala.inline
    def setFrom(value: js.Array[From | Dual]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromNull: Self = StObject.set(x, "from", null)
    
    @scala.inline
    def setFromVarargs(value: (From | Dual)*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[ColumnRef]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyNull: Self = StObject.set(x, "groupby", null)
    
    @scala.inline
    def setGroupbyVarargs(value: ColumnRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setHaving(value: js.Array[_]): Self = StObject.set(x, "having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingNull: Self = StObject.set(x, "having", null)
    
    @scala.inline
    def setHavingVarargs(value: js.Any*): Self = StObject.set(x, "having", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitNull: Self = StObject.set(x, "limit", null)
    
    @scala.inline
    def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setOrderby(value: js.Array[OrderBy]): Self = StObject.set(x, "orderby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderbyNull: Self = StObject.set(x, "orderby", null)
    
    @scala.inline
    def setOrderbyVarargs(value: OrderBy*): Self = StObject.set(x, "orderby", js.Array(value :_*))
    
    @scala.inline
    def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith(value: With): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithNull: Self = StObject.set(x, "with", null)
  }
}
