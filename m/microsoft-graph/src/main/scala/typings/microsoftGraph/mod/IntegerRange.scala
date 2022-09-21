package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerRange extends StObject {
  
  // The inclusive upper bound of the integer range.
  var end: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The inclusive lower bound of the integer range.
  var start: js.UndefOr[NullableOption[Double]] = js.undefined
}
object IntegerRange {
  
  inline def apply(): IntegerRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerRange]
  }
  
  extension [Self <: IntegerRange](x: Self) {
    
    inline def setEnd(value: NullableOption[Double]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: NullableOption[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
