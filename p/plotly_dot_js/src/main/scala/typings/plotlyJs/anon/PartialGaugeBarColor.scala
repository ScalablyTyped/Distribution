package typings.plotlyJs.anon

import typings.plotlyJs.mod.GaugeLine
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.GaugeBar> */
@js.native
trait PartialGaugeBarColor extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
}
object PartialGaugeBarColor {
  
  @scala.inline
  def apply(): PartialGaugeBarColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeBarColor]
  }
  
  @scala.inline
  implicit class PartialGaugeBarColorMutableBuilder[Self <: PartialGaugeBarColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: Partial[GaugeLine]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
  }
}
