package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeOverflow extends StObject {
  
  var rangeOverflow: js.UndefOr[String] = js.native
  
  var rangeUnderflow: js.UndefOr[String] = js.native
}
object RangeOverflow {
  
  @scala.inline
  def apply(): RangeOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOverflow]
  }
  
  @scala.inline
  implicit class RangeOverflowMutableBuilder[Self <: RangeOverflow] (val x: Self) extends AnyVal {
    
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
