package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait With extends StObject {
  
  var columns: js.UndefOr[js.Array[Any]] = js.undefined
  
  var name: String
  
  var stmt: js.Array[Any]
}
object With {
  
  inline def apply(name: String, stmt: js.Array[Any]): With = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stmt = stmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: With] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: js.Array[Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: Any*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStmt(value: js.Array[Any]): Self = StObject.set(x, "stmt", value.asInstanceOf[js.Any])
    
    inline def setStmtVarargs(value: Any*): Self = StObject.set(x, "stmt", js.Array(value*))
  }
}
