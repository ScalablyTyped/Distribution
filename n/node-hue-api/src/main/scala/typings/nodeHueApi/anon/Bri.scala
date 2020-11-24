package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bri extends js.Object {
  
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
  implicit class BriOps[Self <: Bri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBri(value: Double): Self = this.set("bri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormode(value: ColorMode): Self = this.set("colormode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCt(value: Double): Self = this.set("ct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: LightEffect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSat(value: Double): Self = this.set("sat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXy(value: js.Tuple2[Double, Double]): Self = this.set("xy", value.asInstanceOf[js.Any])
  }
}
