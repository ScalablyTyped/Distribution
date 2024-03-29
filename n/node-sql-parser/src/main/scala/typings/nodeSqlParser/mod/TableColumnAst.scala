package typings.nodeSqlParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableColumnAst extends StObject {
  
  var ast: js.Array[AST] | AST
  
  var columnList: js.Array[String]
  
  var tableList: js.Array[String]
}
object TableColumnAst {
  
  inline def apply(ast: js.Array[AST] | AST, columnList: js.Array[String], tableList: js.Array[String]): TableColumnAst = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], columnList = columnList.asInstanceOf[js.Any], tableList = tableList.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnAst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableColumnAst] (val x: Self) extends AnyVal {
    
    inline def setAst(value: js.Array[AST] | AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstVarargs(value: AST*): Self = StObject.set(x, "ast", js.Array(value*))
    
    inline def setColumnList(value: js.Array[String]): Self = StObject.set(x, "columnList", value.asInstanceOf[js.Any])
    
    inline def setColumnListVarargs(value: String*): Self = StObject.set(x, "columnList", js.Array(value*))
    
    inline def setTableList(value: js.Array[String]): Self = StObject.set(x, "tableList", value.asInstanceOf[js.Any])
    
    inline def setTableListVarargs(value: String*): Self = StObject.set(x, "tableList", js.Array(value*))
  }
}
