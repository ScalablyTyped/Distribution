package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventData extends js.Object {
  var audioPath: String = js.native
  var balance: Double = js.native
  var floatValue: Double = js.native
  var intValue: Double = js.native
  var name: String = js.native
  var stringValue: String = js.native
  var volume: Double = js.native
}

object EventData {
  @scala.inline
  def apply(
    audioPath: String,
    balance: Double,
    floatValue: Double,
    intValue: Double,
    name: String,
    stringValue: String,
    volume: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(audioPath = audioPath.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], floatValue = floatValue.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
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
    def setAudioPath(value: String): Self = this.set("audioPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalance(value: Double): Self = this.set("balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntValue(value: Double): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

