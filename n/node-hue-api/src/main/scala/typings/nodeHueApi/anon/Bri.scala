package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bri extends StObject {
  
  var bri: Double = js.native
  
  var colormode: ColorMode = js.native
  
  var ct: Double = js.native
  
  var effect: LightEffect = js.native
  
  var hue: Double = js.native
  
  var on: Boolean = js.native
  
  var sat: Double = js.native
  
  var xy: js.Tuple2[Double, Double] = js.native
}
object Bri {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BriMutableBuilder[Self <: Bri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBri(value: Double): Self = StObject.set(x, "bri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormode(value: ColorMode): Self = StObject.set(x, "colormode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCt(value: Double): Self = StObject.set(x, "ct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: LightEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSat(value: Double): Self = StObject.set(x, "sat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXy(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "xy", value.asInstanceOf[js.Any])
  }
}
