package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.expr_list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertReplaceValue extends StObject {
  
  var `type`: expr_list = js.native
  
  var value: js.Array[_] = js.native
}
object InsertReplaceValue {
  
  @scala.inline
  def apply(`type`: expr_list, value: js.Array[_]): InsertReplaceValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertReplaceValue]
  }
  
  @scala.inline
  implicit class InsertReplaceValueMutableBuilder[Self <: InsertReplaceValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: expr_list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
