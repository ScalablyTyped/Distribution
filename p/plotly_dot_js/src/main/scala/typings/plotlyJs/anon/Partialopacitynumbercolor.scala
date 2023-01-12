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
  
  inline def apply(): Partialopacitynumbercolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialopacitynumbercolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Partialopacitynumbercolor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
