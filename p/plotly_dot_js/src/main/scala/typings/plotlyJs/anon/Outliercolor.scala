package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outliercolor extends StObject {
  
  var color: typings.plotlyJs.mod.Color
  
  var outliercolor: typings.plotlyJs.mod.Color
  
  var outlierwidth: Double
  
  var width: Double
}
object Outliercolor {
  
  inline def apply(
    color: typings.plotlyJs.mod.Color,
    outliercolor: typings.plotlyJs.mod.Color,
    outlierwidth: Double,
    width: Double
  ): Outliercolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], outliercolor = outliercolor.asInstanceOf[js.Any], outlierwidth = outlierwidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outliercolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outliercolor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOutliercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "outliercolor", value.asInstanceOf[js.Any])
    
    inline def setOutliercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "outliercolor", js.Array(value*))
    
    inline def setOutlierwidth(value: Double): Self = StObject.set(x, "outlierwidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
