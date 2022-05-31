package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOverflowRangeUnderflow extends StObject {
  
  var rangeOverflow: js.UndefOr[String] = js.undefined
  
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}
object RangeOverflowRangeUnderflow {
  
  inline def apply(): RangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOverflowRangeUnderflow]
  }
  
  extension [Self <: RangeOverflowRangeUnderflow](x: Self) {
    
    inline def setRangeOverflow(value: String): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    inline def setRangeOverflowUndefined: Self = StObject.set(x, "rangeOverflow", js.undefined)
    
    inline def setRangeUnderflow(value: String): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    inline def setRangeUnderflowUndefined: Self = StObject.set(x, "rangeUnderflow", js.undefined)
  }
}
