package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alert extends StObject {
  
  var alert: LightAlert
  
  var bri: Double
  
  var colormode: js.UndefOr[ColorMode] = js.undefined
  
  var ct: js.UndefOr[Double] = js.undefined
  
  var effect: js.UndefOr[LightEffect] = js.undefined
  
  var hue: js.UndefOr[Double] = js.undefined
  
  var on: Boolean
  
  var reachable: Boolean
  
  var rgb: js.UndefOr[js.Array[Double]] = js.undefined
  
  var sat: js.UndefOr[Double] = js.undefined
  
  var xy: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object Alert {
  
  inline def apply(alert: LightAlert, bri: Double, on: Boolean, reachable: Boolean): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], bri = bri.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  extension [Self <: Alert](x: Self) {
    
    inline def setAlert(value: LightAlert): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setBri(value: Double): Self = StObject.set(x, "bri", value.asInstanceOf[js.Any])
    
    inline def setColormode(value: ColorMode): Self = StObject.set(x, "colormode", value.asInstanceOf[js.Any])
    
    inline def setColormodeUndefined: Self = StObject.set(x, "colormode", js.undefined)
    
    inline def setCt(value: Double): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    inline def setCtUndefined: Self = StObject.set(x, "ct", js.undefined)
    
    inline def setEffect(value: LightEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setReachable(value: Boolean): Self = StObject.set(x, "reachable", value.asInstanceOf[js.Any])
    
    inline def setRgb(value: js.Array[Double]): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    
    inline def setRgbUndefined: Self = StObject.set(x, "rgb", js.undefined)
    
    inline def setRgbVarargs(value: Double*): Self = StObject.set(x, "rgb", js.Array(value*))
    
    inline def setSat(value: Double): Self = StObject.set(x, "sat", value.asInstanceOf[js.Any])
    
    inline def setSatUndefined: Self = StObject.set(x, "sat", js.undefined)
    
    inline def setXy(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
    
    inline def setXyUndefined: Self = StObject.set(x, "xy", js.undefined)
  }
}
