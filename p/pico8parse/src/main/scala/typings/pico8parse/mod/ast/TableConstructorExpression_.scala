package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.TableConstructorExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConstructorExpression_
  extends StObject
     with Base[TableConstructorExpression]
     with Expression {
  
  var fields: js.Array[TableKey_ | TableKeyString_ | TableValue_]
}
object TableConstructorExpression_ {
  
  inline def apply(fields: js.Array[TableKey_ | TableKeyString_ | TableValue_]): TableConstructorExpression_ = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableConstructorExpression")
    __obj.asInstanceOf[TableConstructorExpression_]
  }
  
  extension [Self <: TableConstructorExpression_](x: Self) {
    
    inline def setFields(value: js.Array[TableKey_ | TableKeyString_ | TableValue_]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (TableKey_ | TableKeyString_ | TableValue_)*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
