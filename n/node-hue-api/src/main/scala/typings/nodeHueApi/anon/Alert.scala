package typings.nodeHueApi.anon

import typings.nodeHueApi.mod.ColorMode
import typings.nodeHueApi.mod.LightAlert
import typings.nodeHueApi.mod.LightEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alert extends js.Object {
  
  var alert: LightAlert = js.native
  
  var bri: Double = js.native
  
  var colormode: js.UndefOr[ColorMode] = js.native
  
  var ct: js.UndefOr[Double] = js.native
  
  var effect: js.UndefOr[LightEffect] = js.native
  
  var hue: js.UndefOr[Double] = js.native
  
  var on: Boolean = js.native
  
  var reachable: Boolean = js.native
  
  var rgb: js.UndefOr[js.Array[Double]] = js.native
  
  var sat: js.UndefOr[Double] = js.native
  
  var xy: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}
object Alert {
  
  @scala.inline
  def apply(alert: LightAlert, bri: Double, on: Boolean, reachable: Boolean): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], bri = bri.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
  
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: LightAlert): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBri(value: Double): Self = this.set("bri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachable(value: Boolean): Self = this.set("reachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormode(value: ColorMode): Self = this.set("colormode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColormode: Self = this.set("colormode", js.undefined)
    
    @scala.inline
    def setCt(value: Double): Self = this.set("ct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCt: Self = this.set("ct", js.undefined)
    
    @scala.inline
    def setEffect(value: LightEffect): Self = this.set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    
    @scala.inline
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setRgbVarargs(value: Double*): Self = this.set("rgb", js.Array(value :_*))
    
    @scala.inline
    def setRgb(value: js.Array[Double]): Self = this.set("rgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRgb: Self = this.set("rgb", js.undefined)
    
    @scala.inline
    def setSat(value: Double): Self = this.set("sat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSat: Self = this.set("sat", js.undefined)
    
    @scala.inline
    def setXy(value: js.Tuple2[Double, Double]): Self = this.set("xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXy: Self = this.set("xy", js.undefined)
  }
}
