package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeUnderflow extends StObject {
  
  var exact: js.UndefOr[String] = js.native
  
  var rangeOverflow: js.UndefOr[String] = js.native
  
  var rangeUnderflow: js.UndefOr[String] = js.native
}
object RangeUnderflow {
  
  @scala.inline
  def apply(): RangeUnderflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeUnderflow]
  }
  
  @scala.inline
  implicit class RangeUnderflowMutableBuilder[Self <: RangeUnderflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setRangeOverflow(value: String): Self = StObject.set(x, "rangeOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOverflowUndefined: Self = StObject.set(x, "rangeOverflow", js.undefined)
    
    @scala.inline
    def setRangeUnderflow(value: String): Self = StObject.set(x, "rangeUnderflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUnderflowUndefined: Self = StObject.set(x, "rangeUnderflow", js.undefined)
  }
}
