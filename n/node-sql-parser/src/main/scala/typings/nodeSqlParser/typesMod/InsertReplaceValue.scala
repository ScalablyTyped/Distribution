package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.expr_list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertReplaceValue extends StObject {
  
  var `type`: expr_list
  
  var value: js.Array[js.Any]
}
object InsertReplaceValue {
  
  @scala.inline
  def apply(value: js.Array[js.Any]): InsertReplaceValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("expr_list")
    __obj.asInstanceOf[InsertReplaceValue]
  }
  
  @scala.inline
  implicit class InsertReplaceValueMutableBuilder[Self <: InsertReplaceValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: expr_list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
