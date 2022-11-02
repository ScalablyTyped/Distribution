package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineInput extends StObject {
  
  var functionId: js.UndefOr[Numeric] = js.undefined
  
  var line: js.UndefOr[Numeric] = js.undefined
}
object LineInput {
  
  inline def apply(): LineInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineInput]
  }
  
  extension [Self <: LineInput](x: Self) {
    
    inline def setFunctionId(value: Numeric): Self = StObject.set(x, "functionId", value.asInstanceOf[js.Any])
    
    inline def setFunctionIdUndefined: Self = StObject.set(x, "functionId", js.undefined)
    
    inline def setLine(value: Numeric): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
