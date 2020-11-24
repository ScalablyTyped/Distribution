package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridge extends js.Object {
  
  var bridge: Boolean = js.native
  
  var lights: js.Array[String] = js.native
  
  var sensors: js.Array[String] = js.native
}
object Bridge {
  
  @scala.inline
  def apply(bridge: Boolean, lights: js.Array[String], sensors: js.Array[String]): Bridge = {
    val __obj = js.Dynamic.literal(bridge = bridge.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], sensors = sensors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
    
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
    def setBridge(value: Boolean): Self = this.set("bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: String*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[String]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorsVarargs(value: String*): Self = this.set("sensors", js.Array(value :_*))
    
    @scala.inline
    def setSensors(value: js.Array[String]): Self = this.set("sensors", value.asInstanceOf[js.Any])
  }
}
