package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  color :plotly.js.plotly.js.Color,   width :number,   outliercolor :plotly.js.plotly.js.Color,   outlierwidth :number}> */
@js.native
trait PartialcolorColorwidthnum extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var outliercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.native
  
  var outlierwidth: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PartialcolorColorwidthnum {
  
  @scala.inline
  def apply(): PartialcolorColorwidthnum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcolorColorwidthnum]
  }
  
  @scala.inline
  implicit class PartialcolorColorwidthnumMutableBuilder[Self <: PartialcolorColorwidthnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutliercolorUndefined: Self = StObject.set(x, "outliercolor", js.undefined)
    
    @scala.inline
    def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value :_*))
    
    @scala.inline
    def setOutlierwidth(value: Double): Self = StObject.set(x, "outlierwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlierwidthUndefined: Self = StObject.set(x, "outlierwidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
