package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialGaugeLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GaugeBar extends StObject {
  
  var color: Color
  
  var line: PartialGaugeLine
  
  var thickness: Double
}
object GaugeBar {
  
  @scala.inline
  def apply(color: Color, line: PartialGaugeLine, thickness: Double): GaugeBar = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[GaugeBar]
  }
  
  @scala.inline
  implicit class GaugeBarMutableBuilder[Self <: GaugeBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setLine(value: PartialGaugeLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
