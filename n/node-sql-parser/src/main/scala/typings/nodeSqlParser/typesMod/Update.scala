package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends AST {
  
  var db: String | Null = js.native
  
  var set: js.Array[SetList] = js.native
  
  var table: (js.Array[From | Dual]) | Null = js.native
  
  var `type`: update = js.native
  
  var where: js.Any = js.native
}
object Update {
  
  @scala.inline
  def apply(set: js.Array[SetList], `type`: update, where: js.Any): Update = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any], where = where.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  @scala.inline
  implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbNull: Self = StObject.set(x, "db", null)
    
    @scala.inline
    def setSet(value: js.Array[SetList]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetVarargs(value: SetList*): Self = StObject.set(x, "set", js.Array(value :_*))
    
    @scala.inline
    def setTable(value: js.Array[From | Dual]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNull: Self = StObject.set(x, "table", null)
    
    @scala.inline
    def setTableVarargs(value: (From | Dual)*): Self = StObject.set(x, "table", js.Array(value :_*))
    
    @scala.inline
    def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhere(value: js.Any): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
