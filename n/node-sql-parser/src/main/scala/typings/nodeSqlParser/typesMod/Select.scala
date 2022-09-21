package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.DISTINCT
import typings.nodeSqlParser.nodeSqlParserStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select
  extends StObject
     with AST {
  
  var columns: (js.Array[Any | Column]) | Asterisk
  
  var distinct: DISTINCT | Null
  
  var from: (js.Array[From | Dual | Any]) | Null
  
  var groupby: js.Array[ColumnRef] | Null
  
  var having: js.Array[Any] | Null
  
  var limit: Limit | Null
  
  var options: js.Array[Any] | Null
  
  var orderby: js.Array[OrderBy] | Null
  
  var `type`: select
  
  var where: Any
  
  var `with`: With | Null
}
object Select {
  
  inline def apply(columns: (js.Array[Any | Column]) | Asterisk, where: Any): Select = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any], distinct = null, from = null, groupby = null, having = null, limit = null, options = null, orderby = null)
    __obj.updateDynamic("type")("select")
    __obj.updateDynamic("with")(null)
    __obj.asInstanceOf[Select]
  }
  
  extension [Self <: Select](x: Self) {
    
    inline def setColumns(value: (js.Array[Any | Column]) | Asterisk): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: (Any | Column)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDistinct(value: DISTINCT): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    inline def setDistinctNull: Self = StObject.set(x, "distinct", null)
    
    inline def setFrom(value: js.Array[From | Dual | Any]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromNull: Self = StObject.set(x, "from", null)
    
    inline def setFromVarargs(value: (From | Dual | Any)*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setGroupby(value: js.Array[ColumnRef]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyNull: Self = StObject.set(x, "groupby", null)
    
    inline def setGroupbyVarargs(value: ColumnRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setHaving(value: js.Array[Any]): Self = StObject.set(x, "having", value.asInstanceOf[js.Any])
    
    inline def setHavingNull: Self = StObject.set(x, "having", null)
    
    inline def setHavingVarargs(value: Any*): Self = StObject.set(x, "having", js.Array(value*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setOrderby(value: js.Array[OrderBy]): Self = StObject.set(x, "orderby", value.asInstanceOf[js.Any])
    
    inline def setOrderbyNull: Self = StObject.set(x, "orderby", null)
    
    inline def setOrderbyVarargs(value: OrderBy*): Self = StObject.set(x, "orderby", js.Array(value*))
    
    inline def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWhere(value: Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWith(value: With): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    
    inline def setWithNull: Self = StObject.set(x, "with", null)
  }
}
