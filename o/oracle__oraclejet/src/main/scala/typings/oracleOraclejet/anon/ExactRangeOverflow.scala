package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExactRangeOverflow extends StObject {
  
  var exact: js.UndefOr[String] = js.undefined
  
  var rangeOverflow: js.UndefOr[String] = js.undefined
  
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}
object ExactRangeOverflow {
  
  inline def apply(): ExactRangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExactRangeOverflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExactRangeOverflow] (val x: Self) extends AnyVal {
    
    inline def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setRangeOverflow(value: String): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    inline def setRangeOverflowUndefined: Self = StObject.set(x, "rangeOverflow", js.undefined)
    
    inline def setRangeUnderflow(value: String): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    inline def setRangeUnderflowUndefined: Self = StObject.set(x, "rangeUnderflow", js.undefined)
  }
}
