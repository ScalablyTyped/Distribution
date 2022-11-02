package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelInput extends StObject {
  
  var key: js.UndefOr[Numeric] = js.undefined
  
  var num: js.UndefOr[Numeric] = js.undefined
  
  var numUnit: js.UndefOr[Numeric] = js.undefined
  
  var str: js.UndefOr[Numeric] = js.undefined
}
object LabelInput {
  
  inline def apply(): LabelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelInput]
  }
  
  extension [Self <: LabelInput](x: Self) {
    
    inline def setKey(value: Numeric): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNum(value: Numeric): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setNumUnit(value: Numeric): Self = StObject.set(x, "numUnit", value.asInstanceOf[js.Any])
    
    inline def setNumUnitUndefined: Self = StObject.set(x, "numUnit", js.undefined)
    
    inline def setStr(value: Numeric): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setStrUndefined: Self = StObject.set(x, "str", js.undefined)
  }
}
