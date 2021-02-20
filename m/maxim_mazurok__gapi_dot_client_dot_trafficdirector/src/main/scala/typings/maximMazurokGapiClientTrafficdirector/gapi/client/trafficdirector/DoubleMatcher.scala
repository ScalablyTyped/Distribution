package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleMatcher extends StObject {
  
  /** If specified, the input double value must be equal to the value specified here. */
  var exact: js.UndefOr[Double] = js.native
  
  /** If specified, the input double value must be in the range specified here. Note: The range is using half-open interval semantics [start, end). */
  var range: js.UndefOr[DoubleRange] = js.native
}
object DoubleMatcher {
  
  @scala.inline
  def apply(): DoubleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleMatcher]
  }
  
  @scala.inline
  implicit class DoubleMatcherMutableBuilder[Self <: DoubleMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setRange(value: DoubleRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
