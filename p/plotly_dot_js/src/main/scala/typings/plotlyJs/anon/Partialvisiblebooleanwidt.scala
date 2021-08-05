package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  visible :boolean,   width :number,   fillcolor :plotly.js.plotly.js.Color,   line :std.Partial<{  color :plotly.js.plotly.js.Color,   width :number}>}> */
trait Partialvisiblebooleanwidt extends StObject {
  
  var fillcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var line: js.UndefOr[PartialcolorColorwidthnumColor] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Partialvisiblebooleanwidt {
  
  inline def apply(): Partialvisiblebooleanwidt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialvisiblebooleanwidt]
  }
  
  extension [Self <: Partialvisiblebooleanwidt](x: Self) {
    
    inline def setFillcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "fillcolor", value.asInstanceOf[js.Any])
    
    inline def setFillcolorUndefined: Self = StObject.set(x, "fillcolor", js.undefined)
    
    inline def setFillcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "fillcolor", js.Array(value :_*))
    
    inline def setLine(value: PartialcolorColorwidthnumColor): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
