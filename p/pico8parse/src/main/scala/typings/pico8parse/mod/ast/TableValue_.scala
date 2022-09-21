package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.TableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableValue_
  extends StObject
     with Base[TableValue]
     with _Node {
  
  var value: Expression
}
object TableValue_ {
  
  inline def apply(value: Expression): TableValue_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableValue")
    __obj.asInstanceOf[TableValue_]
  }
  
  extension [Self <: TableValue_](x: Self) {
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
