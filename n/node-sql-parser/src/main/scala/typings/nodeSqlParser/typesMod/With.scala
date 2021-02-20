package typings.nodeSqlParser.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait With extends StObject {
  
  var columns: js.UndefOr[js.Array[_]] = js.native
  
  var name: String = js.native
  
  var stmt: js.Array[_] = js.native
}
object With {
  
  @scala.inline
  def apply(name: String, stmt: js.Array[_]): With = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stmt = stmt.asInstanceOf[js.Any])
    __obj.asInstanceOf[With]
  }
  
  @scala.inline
  implicit class WithMutableBuilder[Self <: With] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[_]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: js.Any*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmt(value: js.Array[_]): Self = StObject.set(x, "stmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmtVarargs(value: js.Any*): Self = StObject.set(x, "stmt", js.Array(value :_*))
  }
}
