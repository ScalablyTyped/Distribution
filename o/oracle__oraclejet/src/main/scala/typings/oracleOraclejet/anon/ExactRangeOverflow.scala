package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExactRangeOverflow extends StObject {
  
  var exact: js.UndefOr[String] = js.native
  
  var rangeOverflow: js.UndefOr[String] = js.native
  
  var rangeUnderflow: js.UndefOr[String] = js.native
}
object ExactRangeOverflow {
  
  @scala.inline
  def apply(): ExactRangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExactRangeOverflow]
  }
  
  @scala.inline
  implicit class ExactRangeOverflowMutableBuilder[Self <: ExactRangeOverflow] (val x: Self) extends AnyVal {
    
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
