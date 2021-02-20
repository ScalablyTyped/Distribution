package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Threshold> */
@js.native
trait PartialThreshold extends StObject {
  
  var line: js.UndefOr[PartialGaugeLine] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PartialThreshold {
  
  @scala.inline
  def apply(): PartialThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThreshold]
  }
  
  @scala.inline
  implicit class PartialThresholdMutableBuilder[Self <: PartialThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: PartialGaugeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
