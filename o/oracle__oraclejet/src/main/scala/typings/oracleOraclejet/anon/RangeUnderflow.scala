package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeUnderflow extends StObject {
  
  var exact: js.UndefOr[String] = js.undefined
  
  var rangeOverflow: js.UndefOr[String] = js.undefined
  
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}
object RangeUnderflow {
  
  inline def apply(): RangeUnderflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeUnderflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeUnderflow] (val x: Self) extends AnyVal {
    
    inline def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setRangeOverflow(value: String): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    inline def setRangeOverflowUndefined: Self = StObject.set(x, "rangeOverflow", js.undefined)
    
    inline def setRangeUnderflow(value: String): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    inline def setRangeUnderflowUndefined: Self = StObject.set(x, "rangeUnderflow", js.undefined)
  }
}
