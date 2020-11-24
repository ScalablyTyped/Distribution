package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var balance: Double = js.native
  
  var data: EventData = js.native
  
  var floatValue: Double = js.native
  
  var intValue: Double = js.native
  
  var stringValue: String = js.native
  
  var time: Double = js.native
  
  var volume: Double = js.native
}
object Event {
  
  @scala.inline
  def apply(
    balance: Double,
    data: EventData,
    floatValue: Double,
    intValue: Double,
    stringValue: String,
    time: Double,
    volume: Double
  ): Event = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
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
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: EventData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValue(value: Double): Self = this.set("intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
