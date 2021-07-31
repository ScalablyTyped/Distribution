package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  color :plotly.js.plotly.js.Color,   width :number}> */
trait PartialcolorColorwidthnumColor extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialcolorColorwidthnumColor {
  
  @scala.inline
  def apply(): PartialcolorColorwidthnumColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcolorColorwidthnumColor]
  }
  
  @scala.inline
  implicit class PartialcolorColorwidthnumColorMutableBuilder[Self <: PartialcolorColorwidthnumColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
