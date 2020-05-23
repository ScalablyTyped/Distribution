package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var audioPath: String
  var balance: Double
  var floatValue: Double
  var intValue: Double
  var name: String
  var stringValue: String
  var volume: Double
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
}

