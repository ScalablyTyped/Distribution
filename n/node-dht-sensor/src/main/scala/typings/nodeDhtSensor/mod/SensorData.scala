package typings.nodeDhtSensor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SensorData extends js.Object {
  
  var humidity: Double = js.native
  
  var temperature: Double = js.native
}
object SensorData {
  
  @scala.inline
  def apply(humidity: Double, temperature: Double): SensorData = {
    val __obj = js.Dynamic.literal(humidity = humidity.asInstanceOf[js.Any], temperature = temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorData]
  }
  
  @scala.inline
  implicit class SensorDataOps[Self <: SensorData] (val x: Self) extends AnyVal {
    
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
    def setHumidity(value: Double): Self = this.set("humidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperature(value: Double): Self = this.set("temperature", value.asInstanceOf[js.Any])
  }
}
