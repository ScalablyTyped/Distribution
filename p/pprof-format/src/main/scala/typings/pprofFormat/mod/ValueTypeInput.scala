package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueTypeInput extends StObject {
  
  var `type`: js.UndefOr[Numeric] = js.undefined
  
  var unit: js.UndefOr[Numeric] = js.undefined
}
object ValueTypeInput {
  
  inline def apply(): ValueTypeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueTypeInput] (val x: Self) extends AnyVal {
    
    inline def setType(value: Numeric): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: Numeric): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
