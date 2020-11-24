package typings.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device extends js.Object {
  
  var defaultHighInputLatency: Double = js.native
  
  var defaultHighOutputLatency: Double = js.native
  
  var defaultLowInputLatency: Double = js.native
  
  var defaultLowOutputLatency: Double = js.native
  
  var defaultSampleRate: Double = js.native
  
  var hostAPIName: Double = js.native
  
  var id: Double = js.native
  
  var maxInputChannels: Double = js.native
  
  var maxOutputChannels: Double = js.native
  
  var name: String = js.native
}
object Device {
  
  @scala.inline
  def apply(
    defaultHighInputLatency: Double,
    defaultHighOutputLatency: Double,
    defaultLowInputLatency: Double,
    defaultLowOutputLatency: Double,
    defaultSampleRate: Double,
    hostAPIName: Double,
    id: Double,
    maxInputChannels: Double,
    maxOutputChannels: Double,
    name: String
  ): Device = {
    val __obj = js.Dynamic.literal(defaultHighInputLatency = defaultHighInputLatency.asInstanceOf[js.Any], defaultHighOutputLatency = defaultHighOutputLatency.asInstanceOf[js.Any], defaultLowInputLatency = defaultLowInputLatency.asInstanceOf[js.Any], defaultLowOutputLatency = defaultLowOutputLatency.asInstanceOf[js.Any], defaultSampleRate = defaultSampleRate.asInstanceOf[js.Any], hostAPIName = hostAPIName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxInputChannels = maxInputChannels.asInstanceOf[js.Any], maxOutputChannels = maxOutputChannels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def setDefaultHighInputLatency(value: Double): Self = this.set("defaultHighInputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultHighOutputLatency(value: Double): Self = this.set("defaultHighOutputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLowInputLatency(value: Double): Self = this.set("defaultLowInputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLowOutputLatency(value: Double): Self = this.set("defaultLowOutputLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSampleRate(value: Double): Self = this.set("defaultSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAPIName(value: Double): Self = this.set("hostAPIName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInputChannels(value: Double): Self = this.set("maxInputChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxOutputChannels(value: Double): Self = this.set("maxOutputChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
