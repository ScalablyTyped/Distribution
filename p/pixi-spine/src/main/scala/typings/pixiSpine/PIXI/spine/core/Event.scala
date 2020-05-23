package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var balance: Double
  var data: EventData
  var floatValue: Double
  var intValue: Double
  var stringValue: String
  var time: Double
  var volume: Double
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
}

