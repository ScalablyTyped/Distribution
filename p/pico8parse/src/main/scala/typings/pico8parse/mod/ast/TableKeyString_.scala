package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.TableKeyString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKeyString_
  extends StObject
     with Base[TableKeyString]
     with _Node {
  
  var key: Identifier_
  
  var value: Expression
}
object TableKeyString_ {
  
  inline def apply(key: Identifier_, value: Expression): TableKeyString_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableKeyString")
    __obj.asInstanceOf[TableKeyString_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableKeyString_] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Identifier_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
