package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeOverflow extends StObject {
  
  var rangeOverflow: js.UndefOr[String] = js.undefined
  
  var rangeUnderflow: js.UndefOr[String] = js.undefined
}
object RangeOverflow {
  
  inline def apply(): RangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOverflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeOverflow] (val x: Self) extends AnyVal {
    
    inline def setRangeOverflow(value: String): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    inline def setRangeOverflowUndefined: Self = StObject.set(x, "rangeOverflow", js.undefined)
    
    inline def setRangeUnderflow(value: String): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    inline def setRangeUnderflowUndefined: Self = StObject.set(x, "rangeUnderflow", js.undefined)
  }
}
