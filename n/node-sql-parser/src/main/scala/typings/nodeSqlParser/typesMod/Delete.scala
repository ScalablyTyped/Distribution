package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete
  extends StObject
     with AST {
  
  var from: js.Array[From | Dual]
  
  var table: js.Any
  
  var `type`: delete
  
  var where: js.Any
}
object Delete {
  
  @scala.inline
  def apply(from: js.Array[From | Dual], table: js.Any, where: js.Any): Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: js.Array[From | Dual]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromVarargs(value: (From | Dual)*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: js.Any): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
