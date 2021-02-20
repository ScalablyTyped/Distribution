package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeOverflowRangeUnderflow extends StObject {
  
  var rangeOverflow: js.UndefOr[String] = js.native
  
  var rangeUnderflow: js.UndefOr[String] = js.native
}
object RangeOverflowRangeUnderflow {
  
  @scala.inline
  def apply(): RangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOverflowRangeUnderflow]
  }
  
  @scala.inline
  implicit class RangeOverflowRangeUnderflowMutableBuilder[Self <: RangeOverflowRangeUnderflow] (val x: Self) extends AnyVal {
    
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
