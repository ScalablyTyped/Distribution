package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bri extends StObject {
  
  var bri: Double
  
  var colormode: ColorMode
  
  var ct: Double
  
  var effect: LightEffect
  
  var hue: Double
  
  var on: Boolean
  
  var sat: Double
  
  var xy: js.Tuple2[Double, Double]
}
object Bri {
  
  inline def apply(
    bri: Double,
    colormode: ColorMode,
    ct: Double,
    effect: LightEffect,
    hue: Double,
    on: Boolean,
    sat: Double,
    xy: js.Tuple2[Double, Double]
  ): Bri = {
    val __obj = js.Dynamic.literal(bri = bri.asInstanceOf[js.Any], colormode = colormode.asInstanceOf[js.Any], ct = ct.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], sat = sat.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bri]
  }
  
  extension [Self <: Bri](x: Self) {
    
    inline def setBri(value: Double): Self = StObject.set(x, "bri", value.asInstanceOf[js.Any])
    
    inline def setColormode(value: ColorMode): Self = StObject.set(x, "colormode", value.asInstanceOf[js.Any])
    
    inline def setCt(value: Double): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: LightEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setSat(value: Double): Self = StObject.set(x, "sat", value.asInstanceOf[js.Any])
    
    inline def setXy(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
  }
}
