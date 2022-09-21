package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.ErrorBar
import typings.plotlyJs.plotlyJsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :'data',   array :std.Array<plotly.js.plotly.js.Datum>,   arrayminus :std.Array<plotly.js.plotly.js.Datum> | undefined} & std.Partial<plotly.js.plotly.js.ErrorOptions> */
trait typedataarrayArrayDatumar
  extends StObject
     with ErrorBar {
  
  var array: js.Array[Datum]
  
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.undefined
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var symmetric: js.UndefOr[Boolean] = js.undefined
  
  var thickness: js.UndefOr[Double] = js.undefined
  
  var `type`: data
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object typedataarrayArrayDatumar {
  
  inline def apply(array: js.Array[Datum]): typedataarrayArrayDatumar = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[typedataarrayArrayDatumar]
  }
  
  extension [Self <: typedataarrayArrayDatumar](x: Self) {
    
    inline def setArray(value: js.Array[Datum]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Datum*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setArrayminus(value: js.Array[Datum]): Self = StObject.set(x, "arrayminus", value.asInstanceOf[js.Any])
    
    inline def setArrayminusUndefined: Self = StObject.set(x, "arrayminus", js.undefined)
    
    inline def setArrayminusVarargs(value: Datum*): Self = StObject.set(x, "arrayminus", js.Array(value*))
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSymmetric(value: Boolean): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    
    inline def setSymmetricUndefined: Self = StObject.set(x, "symmetric", js.undefined)
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setType(value: data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
