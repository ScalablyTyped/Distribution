package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait With extends StObject {
  
  var columns: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var name: String
  
  var stmt: js.Array[js.Any]
}
object With {
  
  @scala.inline
  def apply(name: String, stmt: js.Array[js.Any]): With = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stmt = stmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit class WithMutableBuilder[Self <: With] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[js.Any]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmt(value: js.Array[js.Any]): Self = StObject.set(x, "stmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmtVarargs(value: js.Any*): Self = StObject.set(x, "stmt", js.Array(value :_*))
  }
}
