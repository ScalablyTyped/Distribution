package typings.plotlyJs.anon

import typings.plotlyJs.mod.ErrorBar
import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'constant' | 'percent',   value :number,   valueminus :number | undefined} & std.Partial<plotly.js.plotly.js.ErrorOptions> */
trait typeconstantpercentvaluen
  extends StObject
     with ErrorBar {
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var symmetric: js.UndefOr[Boolean] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var `type`: constant | percent
  
  var value: Double
  
  var valueminus: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object typeconstantpercentvaluen {
  
  inline def apply(`type`: constant | percent, value: Double): typeconstantpercentvaluen = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeconstantpercentvaluen]
  }
  
  extension [Self <: typeconstantpercentvaluen](x: Self) {
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSymmetric(value: Boolean): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    
    inline def setSymmetricUndefined: Self = StObject.set(x, "symmetric", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setType(value: constant | percent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueminus(value: Double): Self = StObject.set(x, "valueminus", value.asInstanceOf[js.Any])
    
    inline def setValueminusUndefined: Self = StObject.set(x, "valueminus", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
