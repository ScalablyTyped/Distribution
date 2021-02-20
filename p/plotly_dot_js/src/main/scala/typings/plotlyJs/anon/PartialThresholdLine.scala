package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Threshold> */
@js.native
trait PartialThresholdLine extends StObject {
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object PartialThresholdLine {
  
  @scala.inline
  def apply(): PartialThresholdLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThresholdLine]
  }
  
  @scala.inline
  implicit class PartialThresholdLineMutableBuilder[Self <: PartialThresholdLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Partial[GaugeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
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
