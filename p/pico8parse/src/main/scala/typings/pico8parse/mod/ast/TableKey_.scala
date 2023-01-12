package typings.pico8parse.mod.ast

import typings.pico8parse.pico8parseStrings.TableKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKey_
  extends StObject
     with Base[TableKey]
     with _Node {
  
  var key: Expression
  
  var value: Expression
}
object TableKey_ {
  
  inline def apply(key: Expression, value: Expression): TableKey_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableKey")
    __obj.asInstanceOf[TableKey_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableKey_] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
