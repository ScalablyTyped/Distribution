package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  opacity :number,   color :plotly.js.plotly.js.Color}> */
trait Partialopacitynumbercolor extends StObject {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
}
object Partialopacitynumbercolor {
  
  @scala.inline
  def apply(): Partialopacitynumbercolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialopacitynumbercolor]
  }
  
  @scala.inline
  implicit class PartialopacitynumbercolorMutableBuilder[Self <: Partialopacitynumbercolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
