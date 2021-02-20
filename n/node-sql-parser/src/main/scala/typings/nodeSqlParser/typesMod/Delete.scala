package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends AST {
  
  var from: js.Array[From | Dual] = js.native
  
  var table: js.Any = js.native
  
  var `type`: delete = js.native
  
  var where: js.Any = js.native
}
object Delete {
  
  @scala.inline
  def apply(from: js.Array[From | Dual], table: js.Any, `type`: delete, where: js.Any): Delete = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
