package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSlider extends StObject {
  
  var bgcolor: String = js.native
  
  var bordercolor: String = js.native
  
  var borderwidth: Double = js.native
  
  var range: js.Tuple2[Datum, Datum] = js.native
  
  var thickness: Double = js.native
  
  var visible: Boolean = js.native
}
object RangeSlider {
  
  @scala.inline
  def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    range: js.Tuple2[Datum, Datum],
    thickness: Double,
    visible: Boolean
  ): RangeSlider = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSlider]
  }
  
  @scala.inline
  implicit class RangeSliderMutableBuilder[Self <: RangeSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordercolor(value: String): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Tuple2[Datum, Datum]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
