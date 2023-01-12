package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ShapeLine> */
trait PartialShapeLine extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dash: js.UndefOr[typings.plotlyJs.mod.Dash] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialShapeLine {
  
  inline def apply(): PartialShapeLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShapeLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialShapeLine] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDash(value: typings.plotlyJs.mod.Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
